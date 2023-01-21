package com.kodilla.patterns.factory.delivery;

public class MegaStore implements Deliverer {

    @Override
    public void processOrder(Order order) {
        System.out.println("MegaStore: processing order " + order);
    }
}
