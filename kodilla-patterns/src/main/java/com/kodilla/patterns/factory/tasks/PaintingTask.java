package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean taskExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint){
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
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
