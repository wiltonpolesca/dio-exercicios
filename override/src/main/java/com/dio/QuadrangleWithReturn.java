package com.dio;

public class QuadrangleWithReturn {
    public static double area(double side) {
        return side * side;
    }
    public static double area(double side1, double side2) {
        return side1 * side2;
    }
    public static double area(double highBase, double lowBase, double heigth) {
        double result = highBase * lowBase;
        result = (0.5 * result);
        result = result / 2;
        return  result;
    }
}
 