package com.dio.strategy;

public class Normal implements IBehavior {

    @Override
    public void move() {
        System.out.println("Normal");
    }
    
}
