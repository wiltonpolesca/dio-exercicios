package com.dio.strategy;

import java.util.prefs.BackingStoreException;

public class Robo {
    private IBehavior behavior;
    
    public void setBehaviour(IBehavior value) {
        behavior = value;
    }
    
    public void mover() {
        behavior.move();
    }
}
