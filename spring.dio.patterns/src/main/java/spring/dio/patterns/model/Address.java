package spring.dio.patterns.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Address {
 
    @Id
    private String postalCode; 
    private String address1;
    private String address2;
    private String district;
    private String province;
}
