package restApi.maidcc.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import restApi.maidcc.demo.entity.*;
/**
 *
 * @author Mhd-Sh
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
