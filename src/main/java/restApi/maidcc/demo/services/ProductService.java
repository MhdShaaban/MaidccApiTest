package restApi.maidcc.demo.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restApi.maidcc.demo.entity.Category;
import restApi.maidcc.demo.entity.Product;
import restApi.maidcc.demo.entity.dto.ProductAddDto;
import restApi.maidcc.demo.entity.dto.ProductDto;
import restApi.maidcc.demo.entity.dto.ProductUpdateDto;
import restApi.maidcc.demo.repositories.CategoryRepository;
import restApi.maidcc.demo.repositories.ProductRepository;

/**
 *
 * @author Mhd-Sh
 */
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
     @Autowired
    CategoryService categoryService;

    public Product findOneById(Long id) {
        return productRepository.getOne(id);
    }

     public List<ProductDto> findAllProduct() {
        return productRepository.findAllProduct();
    }
    public boolean checkifExist(Long id) {
        return productRepository.existsById(id);
    }
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product create(ProductAddDto product) {        
        Product toAdd=new Product();
        toAdd.setDescription(product.getDescription());
        toAdd.setName(product.getName());
        toAdd.setCategory(categoryService.findOneById(product.getCategoryId()));
        return productRepository.save(toAdd);
    }

    public Product update(ProductUpdateDto product) {     
        Product toUpdate=productRepository.getOne(product.getId());
        toUpdate.setName(product.getName());
        toUpdate.setDescription(product.getDescription());
        Category category=categoryRepository.getOne(product.getCategoryId());
            toUpdate.setCategory(category);        
        return productRepository.save(toUpdate);
    }

    public void delete(Product product) {
        productRepository.delete(product);
    }
    

}    