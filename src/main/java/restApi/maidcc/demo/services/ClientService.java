package restApi.maidcc.demo.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restApi.maidcc.demo.entity.Client;
import restApi.maidcc.demo.entity.dto.ClientDto;
import restApi.maidcc.demo.repositories.ClientRepository;

/**
 *
 * @author Mhd-Sh
 */
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client findOneById(Long id) {
        return clientRepository.getOne(id);
    }
    public boolean checkifExist(Long id) {
        return clientRepository.existsById(id);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }
      public List<ClientDto> findAllClient() {
        return clientRepository.findAllClient();
    }
    public Client create(Client client) {
        return clientRepository.save(client);
    }

    public Client update(Client client) {
        Client toUpdate=clientRepository.getOne(client.getId());
         toUpdate.setName(client.getName());
         toUpdate.setLastname(client.getLastname());
         toUpdate.setMobile(client.getMobile());          
        return clientRepository.save(toUpdate);
    }

    public void delete(Client client) {
        clientRepository.delete(client);
    }
}
