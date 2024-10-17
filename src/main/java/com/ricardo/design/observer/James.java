package com.ricardo.design.observer;

public class James implements ObServer {

    @Override
    public void update(String message) {
        System.out.println("James : " + message);
    }
}
