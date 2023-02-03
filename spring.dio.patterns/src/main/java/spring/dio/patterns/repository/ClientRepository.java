package spring.dio.patterns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.dio.patterns.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{
}
