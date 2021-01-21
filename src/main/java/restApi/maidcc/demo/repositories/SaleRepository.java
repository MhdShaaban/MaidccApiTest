package restApi.maidcc.demo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import restApi.maidcc.demo.entity.*;
import restApi.maidcc.demo.entity.dto.SaleDto;
/**
 *
 * @author Mhd-Sh
 */
@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{
    @Query(value = "select new restApi.maidcc.demo.entity.dto.SaleDto(s.id,s.seller, s.total,  s.client.name) from Sale s "
            + "LEFT JOIN s.client ")
    List<SaleDto> findAllSale();
}
