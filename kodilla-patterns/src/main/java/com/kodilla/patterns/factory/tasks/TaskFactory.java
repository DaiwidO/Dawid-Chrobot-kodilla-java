package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVINGTASK = "DrivingTask";
    public static final String PAINTINGTASK = "PaintingTask";
    public static final String SHOPPINGTASK = "ShoppingTask";

    public Task makeTask(String taskClass){
        switch (taskClass){
            case DRIVINGTASK: return new DrivingTask("Drive", "Miami", "car");
            case PAINTINGTASK: {
                return new PaintingTask("Paint a white car", "white", "car");
            }
            case SHOPPINGTASK: return new ShoppingTask("Buy 2 oranges", "orange", 2);
            default: return null;
        }
    }
}
