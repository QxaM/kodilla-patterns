package com.kodilla.patterns.factory.delivery;

public class Application {

    public static void main(String[] args) {
        Order order = new Order("Iron 10 pcs", "MegaStore");
        Deliverer deliverer = DelivererFactory.create(order.getDelivererName());

        deliverer.processOrder(order);
    }
}
