package com.dio;

public class App {
    public static void main(String[] args) {
        System.out.println("Java Methods, exercise 1");
       
        System.out.println("");
        System.out.println("Square:");
        Quadrangle.area(10d);

        System.out.println("");
        System.out.println("Retangle:");
        Quadrangle.area(5d, 5d);

        System.out.println("");
        System.out.println("Trapezoid:");
        Quadrangle.area(7d, 5d, 2d);

        System.out.println("--------------------------------");
        System.out.println("With returns...");
        System.out.println("");
        System.out.println("Square:");
        double result = QuadrangleWithReturn.area(10d);
        System.out.println("Area of the square is " + result);

        System.out.println("");
        System.out.println("Retangle:");
        result = QuadrangleWithReturn.area(5d, 5d);
        System.out.println("Area of the retangle is " + result);

        System.out.println("");
        System.out.println("Trapezoid:");
        result = QuadrangleWithReturn.area(7d, 5d, 2d);
        System.out.println("Area of the trapezoid is " + result);

    }
}
