package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite{

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addTask("toDoList", "Do the laundry.");
        board.addTask("inProgressList", "Paint the celling.");
        board.addTask("doneList", "Wash the car.");

        //Then
        assertEquals("Do the laundry.", board.getTask("toDoList") );
        assertEquals("Paint the celling.", board.getTask("inProgressList") );
        assertEquals("Wash the car.", board.getTask("doneList") );
    }
}
