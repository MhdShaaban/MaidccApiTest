package restApi.maidcc.demo.Controllers;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restApi.maidcc.demo.entity.Sale;
import restApi.maidcc.demo.entity.dto.ProductAddDto;
import restApi.maidcc.demo.entity.dto.SaleAddDto;
import restApi.maidcc.demo.entity.dto.SaleUpdateDto;
import restApi.maidcc.demo.services.ClientService;
import restApi.maidcc.demo.services.SaleService;

/**
 *
 * @author Mhd-Sh
 */
@RestController
@RequestMapping(path = "/sale")
public class SaleController {

    @Autowired
    private SaleService saleService;
    
    @Autowired
    private ClientService clientService ;
  
    @GetMapping(path = "/findAlldto")
    public ResponseEntity<?> findAlldto() {
        return ResponseEntity.ok(saleService.findAllSale());
    }
    
    @GetMapping(path = "/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(saleService.findAll());
    }
    
    @PostMapping(path = "/create")
    public ResponseEntity<?> create(@RequestBody SaleAddDto sale) {
        if (!clientService.checkifExist(sale.getClientId())) {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);           
        }
        try{
            saleService.create(sale);
        } catch (Exception e) {
               Logger.getLogger(SaleService.class.getName()).log(Level.SEVERE, e.getMessage(),e);
              return new ResponseEntity<>(HttpStatus.NOT_FOUND);             
        }
        return ResponseEntity.ok("added Successfully");
    }
    
    @PutMapping(path = "/update")
    public ResponseEntity<?> update(@RequestBody SaleUpdateDto sale) {
        return ResponseEntity.ok(saleService.update(sale));
    } 
    
    @DeleteMapping(path = "/delete")
    public ResponseEntity<?> delete(@RequestBody Sale sale) {
        saleService.delete(sale);
        return (ResponseEntity<?>) ResponseEntity.ok();
    }
    
    @GetMapping(path = "/view/{id}")
    public ResponseEntity<?> view(@PathVariable(name = "id") Sale sale ) {     
        return ResponseEntity.ok(sale);
    }
}
