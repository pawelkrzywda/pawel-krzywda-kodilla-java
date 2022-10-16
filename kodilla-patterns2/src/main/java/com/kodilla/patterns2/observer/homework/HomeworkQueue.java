package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkQueue implements HomeworkObservable {
    private final List<HomeworkObserver> observers;
    private final List<String> homeworkList;
    private final String studentName;

    public HomeworkQueue(String name) {
        observers = new ArrayList<>();
        homeworkList = new ArrayList<>();
        this.studentName = name;
    }

    public void addHomework(String homework) {
        homeworkList.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeworkObserver homeworkObserver) {
        observers.add(homeworkObserver);
    }

    @Override
    public void notifyObservers() {
        for (HomeworkObserver homeworkObserver : observers) {
            homeworkObserver.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver homeworkObserver) {
        observers.remove(homeworkObserver);
    }

    public List<String> getHomeworkList() {
        return homeworkList;
    }

    public String getStudentName() {
        return studentName;
    }
}
