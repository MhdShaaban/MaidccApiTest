package restApi.maidcc.demo.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restApi.maidcc.demo.entity.Product;
import restApi.maidcc.demo.entity.Sale;
import restApi.maidcc.demo.entity.SaleItem;
import restApi.maidcc.demo.entity.dto.SaleAddDto;
import restApi.maidcc.demo.entity.dto.SaleDto;
import restApi.maidcc.demo.entity.dto.SaleItemAddDto;
import restApi.maidcc.demo.entity.dto.SaleItemUpdateDto;
import restApi.maidcc.demo.entity.dto.SaleUpdateDto;
import restApi.maidcc.demo.repositories.SaleRepository;

/**
 *
 * @author Mhd-Sh
 */
@Service
public class SaleService {
    

    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    ClientService clientService;

    @Autowired
    ProductService productService;
    @Autowired
    SaleItemService saleItemService;

    public Optional<Sale> findOneById(Long id) {
        return saleRepository.findById(id);
    }

    public List<Sale> findAll() {
        return saleRepository.findAll();
    }

    public List<SaleDto> findAllSale() {
        return saleRepository.findAllSale();
    }

    public Sale create(SaleAddDto sale) {

        Sale toAdd = new Sale();
        toAdd.setSeller(sale.getSeller());
        toAdd.setClient(clientService.findOneById(sale.getClientId()));
        List<SaleItem> items = new ArrayList<>();
        double total = 0D;
        for (SaleItemAddDto setItem : sale.getItemAddDtos()) {
            SaleItem item = new SaleItem();
            if(!productService.checkifExist(setItem.getProductId()))
                throw new  RuntimeException();
            Product p = productService.findOneById(setItem.getProductId());
            item.setPrice(setItem.getPrice());
            item.setProduct(p);
            item.setQuantity(setItem.getQuantity());
            total += (setItem.getPrice() * setItem.getQuantity());
            items.add(item);

        }
        toAdd.setTotal(total);
        toAdd = saleRepository.saveAndFlush(toAdd);
        for (SaleItem item : items) {
            item.setSale(toAdd);
            try {
                item= saleItemService.create(item);
                Logger.getLogger(SaleService.class.getName()).log(Level.SEVERE, "sale Item added with id :"+item.getId());
            } catch (Throwable e) {
                Logger.getLogger(SaleService.class.getName()).log(Level.SEVERE, e.getMessage(),e);
            }
        }

        return saleRepository.save(toAdd);
    }

    public Sale update(SaleUpdateDto sale) {
        Sale toUpdate=saleRepository.getOne(sale.getId());
        double total = 0D;
        for (SaleItemUpdateDto itemAddDto : sale.getItemAddDtos()) {
            SaleItem saleItem=saleItemService.findOneById(itemAddDto.getId());
            saleItem.setPrice(itemAddDto.getPrice());
            saleItem.setQuantity(itemAddDto.getQuantity());
            total+=itemAddDto.getPrice()*itemAddDto.getQuantity();
             Logger.getLogger(SaleService.class.getName()).log(Level.SEVERE, "sale Item updated with id :"+saleItem.getId());
            saleItemService.update(saleItem);
        }
        toUpdate.setTotal(total);
        return saleRepository.save(toUpdate);
    }

    public void delete(Sale client) {
        saleRepository.delete(client);
    }
}
