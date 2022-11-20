package com.dio;

public class Calculator {
    public static void sum(double value1, double value2) {
        double result = value1 + value2;
        System.out.println("The result of the sum of " + value1 + " and " + value2 + " is: " + result);
    }

    public static void minus(double value1, double value2) {
        double result = value1 - value2;
        System.out.println("The result of subtraction between " + value1 + " and " + value2 + " is: " + result);
    }
    
    public static void multiply(double value1, double value2) {
        double result = value1 * value2;
        System.out.println("The result of multiplying between " + value1 + " and " + value2 + " is: " + result);
    }

    public static void divide(double value1, double value2) {
        double result = value1 / value2;
        System.out.println("The result of dividing between " + value1 + " and " + value2 + " is: " + result);
    }

}
