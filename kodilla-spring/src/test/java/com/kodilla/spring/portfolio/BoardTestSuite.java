package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootApplication
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().addTask("Task to do");
        board.getDoneList().addTask("Done task");
        board.getInProgressList().addTask("Task in progress");

        //Then
        assertEquals("Task to do", board.getToDoList().getTasks().get(0));
        assertEquals("Done task", board.getDoneList().getTasks().get(0));
        assertEquals("Task in progress", board.getInProgressList().getTasks().get(0));
    }
}
