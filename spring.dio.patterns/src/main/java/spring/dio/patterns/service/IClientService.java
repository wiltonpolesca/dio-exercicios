package spring.dio.patterns.service;

import spring.dio.patterns.model.Client;

public interface IClientService {
    Iterable<Client> findAll();
    Client findById(Long id);
    void add(Client client);
    void update(Long id, Client client);
    void delete(Long id);
}
