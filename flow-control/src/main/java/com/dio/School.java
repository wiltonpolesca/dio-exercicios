package com.dio;

public class School {

    public void showResult(double grade) {
        
        if (grade >= 5 && grade < 7) {
            System.out.println("Must do a new recuperation exam!");
        } else if (grade >= 7) {
                System.out.println("Approved :)");
        } else {
            System.out.println("Reproved :(");
        }
    }
    
    public void showResult2(double grade) {
        
        String result = grade >= 5 && grade < 7 ? "Must do a new recuperation exam!" 
        : grade >= 7 ? "Approved :)" : "Reproved :(";
        System.out.println(result);
        
    }

}