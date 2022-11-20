package com.dio.facade.subSystem1;

import java.util.ArrayList;
import java.util.List;

public class CrmService {
    static List<Client> values = new ArrayList<>();
    public static void saveClient(String name, String postalCode, String city, String province) {
        Client client = new Client(name, postalCode, city, province);
        values.add(client);
        System.out.println("Added CRM: " + client);
    }
}
