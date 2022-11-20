package com.dio.strategy;

public class Aggressive implements IBehavior {

    @Override
    public void move() {
        System.out.println("Aggressive");
    }
    
}
