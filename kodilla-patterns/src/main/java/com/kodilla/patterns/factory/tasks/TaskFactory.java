package com.kodilla.patterns.factory.tasks;

public class TaskFactory{
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPINGTASK:
                return new ShoppingTask("Groceries", "Eggs", 10.0);
            case PAINTINGTASK:
                return new PaintingTask("Paint 3 times", "White", "Ceiling");
            case DRIVINGTASK:
                return new DrivingTask("Drive tommorow", "Los Angeles", "Truck");
            default:
                return null;
        }
    }
}
