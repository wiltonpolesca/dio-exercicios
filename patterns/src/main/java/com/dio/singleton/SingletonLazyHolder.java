package com.dio.singleton;

public class SingletonLazyHolder {
    // Thread safe and save some memory
    // https://stackoverflow.com/a/24018148
    private static class InstanceHolder { 
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
    
    public void print () {
        System.out.println(InstanceHolder.instance);
    }

}
