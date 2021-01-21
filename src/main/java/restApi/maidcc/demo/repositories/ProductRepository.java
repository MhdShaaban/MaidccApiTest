package restApi.maidcc.demo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import restApi.maidcc.demo.entity.*;
import restApi.maidcc.demo.entity.dto.ProductDto;
/**
 *
 * @author Mhd-Sh
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    
    @Query(value = "select new restApi.maidcc.demo.entity.dto.ProductDto(p.id, p.name, p.description, p.category.name,p.creationDate) from Product p "
            + "LEFT JOIN p.category ")
    List<ProductDto> findAllProduct();
    
    
}
