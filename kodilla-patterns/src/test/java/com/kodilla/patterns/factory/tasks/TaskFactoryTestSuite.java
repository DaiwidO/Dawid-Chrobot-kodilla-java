package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Starting TaskFactoryTestSuite");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("Finished TaskFactoryTestSuite");
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        DrivingTask drive = (DrivingTask) drivingTask;

        //Then
        assertEquals("Drive", drivingTask.getTaskName());
        assertEquals("Miami", drive.getWhere());
        assertEquals("car", drive.getUsing());

        assertFalse(drive.isTaskExecuted());

        drive.executeTask();
        assertTrue(drive.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        PaintingTask paint = (PaintingTask) paintingTask;

        //Then
        assertEquals("Paint a white car", paintingTask.getTaskName());
        assertEquals("white", paint.getColor());
        assertEquals("car", paint.getWhatToPaint());

        assertFalse(paint.isTaskExecuted());

        paint.executeTask();
        assertTrue(paint.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        ShoppingTask shop = (ShoppingTask) shoppingTask;

        //Then
        assertEquals("Buy 2 oranges", shoppingTask.getTaskName());
        assertEquals("orange", shop.getWhatToBuy());
        assertEquals(2, shop.getQuantity());

        assertFalse(shop.isTaskExecuted());

        shop.executeTask();
        assertTrue(shop.isTaskExecuted());
    }
}
