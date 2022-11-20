package com.dio.facade.subSystem2;

public class CepApi {
    private static CepApi instance = new CepApi();
    
    private CepApi() {
        
    }
    
    public static CepApi getInstance() {
        return instance;
    }
    
    public String getCity(String postalCode) {
        return "City...";
    } 
   
    public String getProvince(String postalCode) {
        return "Province...";
    } 
}
