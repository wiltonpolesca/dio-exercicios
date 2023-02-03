package spring.dio.patterns.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.dio.patterns.model.BrazilAddress;

/*
 * Client HTTP responsible to connect to ViaCep, using OpenFeing, and
 * get details about the Brazilian client address.
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
    @RequestMapping(method = RequestMethod.GET, value = "/{postalCode}/json/")
    BrazilAddress getAddressByPostalCode(@PathVariable("postalCode") String postalCode);
}
