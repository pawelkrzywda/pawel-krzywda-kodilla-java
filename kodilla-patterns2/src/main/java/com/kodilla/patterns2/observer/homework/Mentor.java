package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(username + ": New homework from student: " + homeworkQueue.getStudentName() + "\n" +
                " (total: " + homeworkQueue.getHomeworkList().size() + " homework for review from this student.)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
