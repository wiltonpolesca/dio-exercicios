package com.dio.facade;

import com.dio.facade.subSystem1.CrmService;
import com.dio.facade.subSystem2.CepApi;

public class Facade {
    public void migrateClient(String name, String postaCode) {
        var city = CepApi.getInstance().getCity(postaCode);
        var province = CepApi.getInstance().getProvince(postaCode);
        
        CrmService.saveClient(name, postaCode, city, province   );   
    }
}
