package com.dio;

public class MeasureSystem {
    public void getSizeName(String size) {
        String name;
        switch (size) {
            case "P":
            case "S":
                name = "Small";
                break;
            case "M":
                name = "Medium";
                break;
            case "G":
            case "L":
                name = "Large";
                break;

            default:
                name = "Undefined";
                break;
        }

        System.out.println(name);
    }
}
