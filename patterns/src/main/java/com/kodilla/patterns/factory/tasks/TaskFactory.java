package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final static String DRIVING_TASK = "DRIVING_TASK";
    public final static String PAINTING_TASK = "PAINTING_TASK";
    public final static String SHOPPING_TASK = "SHOPPING_TASK";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case DRIVING_TASK -> new DrivingTask("Drive to work", "Work", "Bus");
            case PAINTING_TASK -> new PaintingTask("Paint kitchen", "White", "Kitchen");
            case SHOPPING_TASK -> new ShoppingTask("Buy bread", "Bread", 1.0);
            default -> null;
        };
    }
}
