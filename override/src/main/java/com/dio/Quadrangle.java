package com.dio;

public class Quadrangle {
    public static void area(double side) {
        System.out.println("Area of the square is " + (side * side));
    }
    public static void area(double side1, double side2) {
        System.out.println("Area of the retangle is " + (side1 * side2));
    }
    public static void area(double highBase, double lowBase, double heigth) {
        double result = highBase * lowBase;
        result = (0.5 * result);
        result = result / 2;
        System.out.println("Area of the trapezoid is " + result);
    }
}
 