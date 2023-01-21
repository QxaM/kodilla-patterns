package com.kodilla.patterns.factory.delivery;

public class CityStore implements Deliverer {

    @Override
    public void processOrder(Order order) {
        System.out.println("CityStore: processing order " + order);
    }
}
