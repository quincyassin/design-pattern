package com.ricardo.design.observer;

public class Curry implements ObServer {

    @Override
    public void update(String message) {
        String logo = message + " - Curry";
        System.out.println("after Curry's processing : " + logo);
    }
}
