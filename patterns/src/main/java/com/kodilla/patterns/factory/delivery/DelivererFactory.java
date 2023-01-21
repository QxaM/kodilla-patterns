package com.kodilla.patterns.factory.delivery;

public class DelivererFactory {
    public static Deliverer create(String delivererName) {
        return switch(delivererName) {
          case "MegaStore" -> new MegaStore();
          case "CentralGrocery" -> new CentralGrocery();
          case "CityStore" -> new CityStore();
            default -> null;
        };
    }
}
