package com.dio;

public class Message {
    static final int HOUR_TO_FINISH_MORNING = 12;
    static final int HOUR_TO_FINISH_AFTERNOON = 18;
    static final int HOUR_TO_FINISH_NIGHT = 24;

    public static void getMessage(int hour) {
        if (hour <= HOUR_TO_FINISH_MORNING) {
            System.out.println("Good Morning");
        } else if (hour <= HOUR_TO_FINISH_AFTERNOON) {
            System.out.println("Good Afternoon");
        } else if (hour <= HOUR_TO_FINISH_NIGHT) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Invalid Hour.");
        }
    }
}
