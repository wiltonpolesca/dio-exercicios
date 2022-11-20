package com.dio.strategy;

public class Defensive implements IBehavior {

    @Override
    public void move() {
        System.out.println("Defence");
    }
    
}
