package spring.dio.patterns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.dio.patterns.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, String>{
}
