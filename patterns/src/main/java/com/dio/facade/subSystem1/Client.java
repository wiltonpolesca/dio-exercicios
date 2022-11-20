package com.dio.facade.subSystem1;

public class Client {
    private String name;
    private String postalCode;
    private String city;
    private String province;

    public String getName() {
        return name;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public Client(String name, String postalCode, String city, String province) {
        this.name = name;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
    }
    
    @Override
    public String toString() {
        return String.format("Name: %s, Postal code: %s, City: %s, Province: %s", 
        getName(), getPostalCode(), getCity(), getProvince());
    }
}
