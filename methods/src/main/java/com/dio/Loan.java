package com.dio;

public class Loan {
    private static double interestRate2x() {
        return 0.45D;
    }

    private static double interestRate3x() {
        return 0.55D;
    }

    private static double interestRate4x() {
        return 0.65D;
    }

    public static void calculate(double value, int loanTermMonths) {

        if (loanTermMonths == 2) {
            System.out.println("Final value for 2 months is: " + getValue(value, interestRate2x()));
        } else if (loanTermMonths == 3) {
            System.out.println("Final value for 3 months is: " + getValue(value, interestRate3x()));
        } else if (loanTermMonths == 4) {
            System.out.println("Final value for 4 months is: " + getValue(value, interestRate4x()));
        } else {
            System.out.println("Loan only available for terms between 2 and 4 months");
        }
    }

    private static double getValue(double value, double interestRate) {
        return value + (value * interestRate);
    }

}
