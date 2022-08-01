package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{
    private String taskName;
    private String where;
    private String using;
    private boolean taskExecuted = false;

    public DrivingTask(String taskName, String where, String using){
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public void executeTask(){
        System.out.println("Executing painting task.");
        taskExecuted = true;
    }

    public String getTaskName(){
        return taskName;
    }

    public boolean isTaskExecuted(){
        return taskExecuted;
    }
}
