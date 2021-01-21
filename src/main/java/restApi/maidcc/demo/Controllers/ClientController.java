package restApi.maidcc.demo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import restApi.maidcc.demo.entity.Client;
import restApi.maidcc.demo.services.ClientService;

/**
 *
 * @author Mhd-Sh
 */
@RestController
@RequestMapping(path = "/client")
public class ClientController {

    @Autowired
    private ClientService clientService;
  
    @GetMapping(path = "/findAll")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(clientService.findAll());
    }
    @GetMapping(path = "/findAlldto")
    public ResponseEntity<?> findAlldto() {
        return ResponseEntity.ok(clientService.findAllClient());
    }
    @PostMapping(path = "/create")
    public ResponseEntity<?> create(@RequestBody Client client) {
        try{return ResponseEntity.ok(clientService.create(client));}
        catch (Throwable e) {
            return ResponseEntity.ok("check entry data");
        }                
    }
    
    @PutMapping(path = "/update")
    public ResponseEntity<?> update(@RequestBody Client client) {
        return ResponseEntity.ok(clientService.update(client));
    } 
    
    @DeleteMapping(path = "/delete")
    public ResponseEntity<?> delete(@RequestBody Client client) {
        clientService.delete(client);
        return (ResponseEntity<?>) ResponseEntity.ok();
    }
    
    @GetMapping(path = "/view/{id}")
    public ResponseEntity<?> view(@PathVariable(name = "id") Client client ) {     
        return ResponseEntity.ok(client);
    }
}
