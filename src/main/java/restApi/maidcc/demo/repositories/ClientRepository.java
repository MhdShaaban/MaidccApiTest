package restApi.maidcc.demo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import restApi.maidcc.demo.entity.*;
import restApi.maidcc.demo.entity.dto.ClientDto;
/**
 *
 * @author Mhd-Sh
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
    
    @Query(value = "select new restApi.maidcc.demo.entity.dto.ClientDto(c.id, c.name, c.lastname,c.mobile) from Client c ")            
    List<ClientDto> findAllClient();
}
