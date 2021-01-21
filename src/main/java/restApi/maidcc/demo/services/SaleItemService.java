package restApi.maidcc.demo.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import restApi.maidcc.demo.entity.SaleItem;
import restApi.maidcc.demo.repositories.SaleItemRepository;

/**
 *
 * @author Mhd-Sh
 */
@Service
public class SaleItemService {

    @Autowired
    private SaleItemRepository SaleItemRepository;

    public SaleItem findOneById(Long id) {
        return SaleItemRepository.getOne(id);
    }

    public List<SaleItem> findAll() {
        return SaleItemRepository.findAll();
    }

    @Transactional
    public SaleItem create(SaleItem saleItem) {
        return SaleItemRepository.save(saleItem);
    }

    public SaleItem update(SaleItem saleItem) {
        return SaleItemRepository.save(saleItem);
    }

    public void delete(SaleItem saleItem) {
        SaleItemRepository.delete(saleItem);
    }
}
