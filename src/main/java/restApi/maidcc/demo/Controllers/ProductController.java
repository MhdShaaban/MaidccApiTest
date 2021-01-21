package restApi.maidcc.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restApi.maidcc.demo.entity.Category;
import restApi.maidcc.demo.entity.Product;
import restApi.maidcc.demo.entity.dto.ProductAddDto;
import restApi.maidcc.demo.entity.dto.ProductUpdateDto;
import restApi.maidcc.demo.services.CategoryService;
import restApi.maidcc.demo.services.ProductService;

/**
 *
 * @author Mhd-Sh
 */
@RestController
@RequestMapping(path = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @Autowired
    private CategoryService categoryService ;
  
    @GetMapping(path = "/findAlldto")
    public ResponseEntity<?> findAlldto() {
        return ResponseEntity.ok(productService.findAllProduct());
    }
    
    @GetMapping(path = "/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(productService.findAll());
    }
    
    @PostMapping(path = "/create")
    public ResponseEntity<?> create(@RequestBody ProductAddDto product) {
        if (!categoryService.checkifExist(product.getCategoryId())) {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);           
        }         
        return ResponseEntity.ok(productService.create(product));
    }
    
    @PutMapping(path = "/update")
    public ResponseEntity<?> update(@RequestBody ProductUpdateDto product) {
        if (!categoryService.checkifExist(product.getCategoryId())) {
             return new ResponseEntity<>(HttpStatus.NOT_FOUND);           
        }  
        return ResponseEntity.ok(productService.update(product));
    } 
    
    @DeleteMapping(path = "/delete")
    public ResponseEntity<?> delete(@RequestBody Product product) {
        productService.delete(product);
        return (ResponseEntity<?>) ResponseEntity.ok();
    }
    
    @GetMapping(path = "/view/{id}")
    public ResponseEntity<?> view(@PathVariable(name = "id") Product product ) {     
        return ResponseEntity.ok(product);
    }   
}
