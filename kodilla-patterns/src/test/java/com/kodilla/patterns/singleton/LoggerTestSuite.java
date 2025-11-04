package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void TestGetLastLog(){
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("First string");

        //When
        String result = logger.getLastLog();

        //Then
        assertEquals("First string", result);
    }
}
