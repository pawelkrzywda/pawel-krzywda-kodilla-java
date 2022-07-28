package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void newLogs() {
        logger = Logger.INSTANCE;
        logger.log("First log.");
        logger.log("Second log.");
    }



    @Test
    void testGetFileName() {
        //Given
        //When
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("Second log.", lastLog);
    }
}
