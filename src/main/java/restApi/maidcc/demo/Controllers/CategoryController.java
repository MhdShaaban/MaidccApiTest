package restApi.maidcc.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restApi.maidcc.demo.entity.Category;
import restApi.maidcc.demo.services.CategoryService;

/**
 *
 * @author Mhd-Sh
 */
@RestController
@RequestMapping(path = "/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
  
    @GetMapping(path = "/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(categoryService.findAll());
    }
    
    @PostMapping(path = "/create")
    public ResponseEntity<?> create(@RequestBody Category category) {
        return ResponseEntity.ok(categoryService.create(category));
    }
    
    
    
    @DeleteMapping(path = "/delete")
    public ResponseEntity<?> delete(@RequestBody Category category) {
        categoryService.delete(category);
        return (ResponseEntity<?>) ResponseEntity.ok();
    }
    

    @GetMapping(path = "/view/{id}")
    public ResponseEntity<?> view(@PathVariable(name = "id") Category category ) {     
        return ResponseEntity.ok(category);
    }    

}
