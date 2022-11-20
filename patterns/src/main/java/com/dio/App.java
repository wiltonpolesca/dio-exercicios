package com.dio;

import com.dio.facade.Facade;
import com.dio.singleton.SingletonEager;
import com.dio.singleton.SingletonLazy;
import com.dio.singleton.SingletonLazyHolder;
import com.dio.strategy.Aggressive;
import com.dio.strategy.Defensive;
import com.dio.strategy.IBehavior;
import com.dio.strategy.Normal;
import com.dio.strategy.Robo;

public class App {
    public static void main(String[] args) {
        printSingletons();
        strategy();
        Facade();
    }

    private static void Facade() {
        System.out.println("== Structure: Facade =============");
        Facade facade = new Facade();
        facade.migrateClient("Wilton", "xpto");
        facade.migrateClient("Polly", "otpx");
    }

    private static void strategy() {
        System.out.println("== Behavior: Strategy =============");
        IBehavior deffenssive = new Defensive();
        IBehavior aggressive = new Aggressive();
        IBehavior normal = new Normal();

        Robo robo = new Robo();
        robo.setBehaviour(normal);
        
        robo.mover();
        
        robo.setBehaviour(deffenssive);
        robo.mover();

        robo.setBehaviour(aggressive);
        robo.mover();
    }

    private static void printSingletons() {
        System.out.println("== Creation: Singleton =============");
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println("First lazy instance");
        lazy.print();
        System.out.println("Second lazy instance");
        lazy = SingletonLazy.getInstance();
        lazy.print();

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println("First eager instance");
        eager.print();
        System.out.println("Second eager instance");
        eager = SingletonEager.getInstance();
        eager.print();

        SingletonLazyHolder holder = SingletonLazyHolder.getInstance();
        System.out.println("First holder instance");
        holder.print();
        System.out.println("Second holder instance");
        holder = SingletonLazyHolder.getInstance();
        holder.print();
    }
}
