package spring.dio.patterns.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.dio.patterns.model.Address;
import spring.dio.patterns.model.BrazilAddress;
import spring.dio.patterns.model.Client;
import spring.dio.patterns.repository.AddressRepository;
import spring.dio.patterns.repository.ClientRepository;
import spring.dio.patterns.service.IClientService;
import spring.dio.patterns.service.ViaCepService;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository repository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Client> findAll() {
        return repository.findAll();
    }

    @Override
    public Client findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public void add(Client client) {
        String postalCode = client.getAddress().getPostalCode();
        Address address = getAddress(postalCode);
        client.setAddress(address);
        repository.save(client);
    }

    @Override
    public void update(Long id, Client client) {
        Client entity = findById(id);
        if (entity == null) {
            throw new RuntimeException("Client not found.");
        }
        String postalCode = client.getAddress().getPostalCode();
        Address address = getAddress(postalCode);
        entity.setAddress(address);
        repository.save(client);
    }

    @Override
    public void delete(Long id) {
        Client entity = findById(id);
        if (entity == null) {
            throw new RuntimeException("Client not found.");
        }

        repository.delete(entity);
    }
    
    private Address getAddress(String postalCode) {
        Address address = addressRepository.findById(postalCode)
                .orElseGet(() -> {
                    BrazilAddress brAdd = viaCepService.getAddressByPostalCode(postalCode);
                    if (brAdd != null) {
                        Address add = new Address();
                        add.setPostalCode(postalCode);
                        add.setAddress1(brAdd.getLogradouro());
                        add.setAddress2(brAdd.getComplemento());
                        add.setDistrict(brAdd.getBairro());
                        add.setProvince(brAdd.getUf());
                        addressRepository.save(add);
                        return add;
                    }
                    return null;
                });
        return address;
    }

}
