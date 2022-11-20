package com.dio;

import java.util.concurrent.ThreadLocalRandom;

public class Loops {

    public void testForCount(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Counting: " + i);
        }
    }

    public void testForArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Item " + i + " Value: " + array[i]);
        }
    }

    public void testForeach(String[] array) {
        for (String item : array) {
            System.out.println("Value: " + item);
        }
    }

    public void testBreakContinue(int count) {

        // Print odd values until 17
        for (int i = 0; i < count; i++) {

            if (i > 17) {
                break;
            }
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Value: " + i);

        }
    }

    public void testWhile(double maxValue) {
        double current = 0.0;
        while (current < maxValue) {
            current += randomValue();
            double balance = maxValue - current;
            if (balance > 0) {
                System.out.println("Still availalbe: " + balance);
            } else {
                System.out.println("No money available. (" + balance +")");
            }
        }
    }
    
    public void testDoWhile(double maxValue) {
        double current = 0.0;
        do {
            current += randomValue();
            double balance = maxValue - current;
            if (balance > 0) {
                System.out.println("Still availalbe: " + balance);
            } else {
                System.out.println("No money available. (" + balance +")");
            }

        } while (current < maxValue);
    }


    private double randomValue() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

}