package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite{
    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPINGTASK);
        shopping.executeTask();
        //Then
        assertEquals("Groceries", shopping.getTaskName());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        assertEquals("Paint 3 times", painting.getTaskName());
        assertEquals(false, painting.isTaskExecuted());
    }

    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVINGTASK);
        driving.executeTask();
        //Then
        assertEquals("Drive tommorow", driving.getTaskName());
        assertEquals(true, driving.isTaskExecuted());
    }
}
