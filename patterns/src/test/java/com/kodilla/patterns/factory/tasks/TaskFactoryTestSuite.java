package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING_TASK);
        boolean isExecuted = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        boolean isExecutedAfterExecution = shoppingTask.isTaskExecuted();

        //Then
        assertAll(() -> assertEquals("Buy bread", shoppingTask.getTaskName()),
                () -> assertFalse(isExecuted),
                () -> assertTrue(isExecutedAfterExecution));
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);
        boolean isExecuted = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        boolean isExecutedAfterExecution = paintingTask.isTaskExecuted();

        //Then
        assertAll(() -> assertEquals("Paint kitchen", paintingTask.getTaskName()),
                () -> assertFalse(isExecuted),
                () -> assertTrue(isExecutedAfterExecution));
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING_TASK);
        boolean isExecuted = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        boolean isExecutedAfterExecution = drivingTask.isTaskExecuted();

        //Then
        assertAll(() -> assertEquals("Drive to work", drivingTask.getTaskName()),
                () -> assertFalse(isExecuted),
                () -> assertTrue(isExecutedAfterExecution));
    }
}
