package com.dio;

public class App {
    public static void main(String[] args) {
        
        int num = 30;
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("count: " + count);
    }
}
