package spring.dio.patterns.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.dio.patterns.model.Client;
import spring.dio.patterns.service.IClientService;

@RestController
@RequestMapping("client")
public class ClientController {

    @Autowired
    IClientService service;

    @GetMapping
    ResponseEntity<Iterable<Client>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    ResponseEntity<Client> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    ResponseEntity<Client> post(@RequestBody Client value) {
        service.add(value);
        return ResponseEntity.ok(value);
    }
    
    @PutMapping("/{id}")
    ResponseEntity<Client> post(@PathVariable Long id, @RequestBody Client value) {
        service.update(id, value);
        return ResponseEntity.ok(value);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
