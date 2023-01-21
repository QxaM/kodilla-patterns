package com.kodilla.patterns.factory.delivery;

public class CentralGrocery implements Deliverer {

    @Override
    public void processOrder(Order order) {
        System.out.println("CentralGrocery: processing order " + order);
    }
}
