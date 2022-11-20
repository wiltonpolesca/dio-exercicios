package com.dio;

public class App {
    public static void main(String[] args) {
        System.out.println("Java Methods, exercise 1");
       
        System.out.println("");
        System.out.println("Calculator:");
        Calculator.sum(10d, 20d);
        Calculator.minus(23d, 17d);
        Calculator.multiply(23d, 17d);
        Calculator.divide(54d, 17d);

        System.out.println("");
        System.out.println("Message:");
        Message.getMessage(7);
        Message.getMessage(13);
        Message.getMessage(19);
        Message.getMessage(25);

        System.out.println("");
        System.out.println("Loan:");

        Loan.calculate(1000, 1); // Invalid
        Loan.calculate(1000, 2); 
        Loan.calculate(1000, 3); 
        Loan.calculate(1000, 4); 
        Loan.calculate(1000, 5); // Invalid

    }
}
