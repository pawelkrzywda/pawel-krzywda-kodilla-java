package com.kodilla.spring.portfolio;

public class Board{

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList){
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void addTask(String listName, String task){
        if(listName.equals("toDoList")){
            toDoList.addTask(task);
        } else if(listName.equals("inProgressList")){
            inProgressList.addTask(task);
        } else if(listName.equals("doneList")){
            doneList.addTask(task);
        }
    }

    public String getTask(String listName){
        if(listName.equals("toDoList")){
            return toDoList.getTask(0);
        } else if(listName.equals("inProgressList")){
            return inProgressList.getTask(0);
        } else if(listName.equals("doneList")){
            return doneList.getTask(0);
        } else{
            return "Something went wrong.";
        }
    }
}
