package restApi.maidcc.demo.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restApi.maidcc.demo.entity.Category;
import restApi.maidcc.demo.repositories.CategoryRepository;

/**
 *
 * @author Mhd-Sh
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category findOneById(Long id) {
        return categoryRepository.getOne(id);
    } 
    
    public boolean checkifExist(Long id) {
        return categoryRepository.existsById(id);
    }
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    public Category update(Category category) {
        return categoryRepository.save(category);
    }

    public void delete(Category category) {
         categoryRepository.delete(category);
    }

}
