package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        // Given
        HomeworkQueue johnHomework = new HomeworkQueue("John Smith");
        HomeworkQueue jessieHomework = new HomeworkQueue("Jessie Coulson");
        HomeworkQueue mikeHomework = new HomeworkQueue("Mike Wilson");
        HomeworkQueue eddHomework = new HomeworkQueue("Edd Kovalsky");
        HomeworkQueue aliceHomework = new HomeworkQueue("Alice Brown");
        Mentor michael = new Mentor("Michael Adams");
        Mentor leo = new Mentor("Leonardo Lopez");

        johnHomework.registerObserver(michael);
        jessieHomework.registerObserver(michael);
        mikeHomework.registerObserver(leo);
        eddHomework.registerObserver(leo);
        aliceHomework.registerObserver(leo);

        // When
        johnHomework.addHomework("Task 15.2");
        johnHomework.addHomework("Task 15.3");
        johnHomework.addHomework("Task 15.4");
        jessieHomework.addHomework("task 7.1");
        jessieHomework.addHomework("task 7.2");
        mikeHomework.addHomework("Task 24.4 ready for review - code with tests send to GitHub.");
        eddHomework.addHomework("Task 1.2");
        eddHomework.addHomework("Task 1.3");
        aliceHomework.addHomework("Exercise 5.5");
        aliceHomework.addHomework("Exercise 5.6");
        aliceHomework.addHomework("Exercise 5.7");
        aliceHomework.addHomework("Exercise 5.8");

        // Then
        assertEquals(5, michael.getUpdateCount());
        assertEquals(7, leo.getUpdateCount());
    }
}
