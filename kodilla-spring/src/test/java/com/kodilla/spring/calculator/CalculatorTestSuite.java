package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testcalculations(){
        //Given

        //When
        double addResult = calculator.add(4,2);
        double subResult = calculator.sub(4,2);
        double mulResult = calculator.mul(4,2);
        double divResult = calculator.div(4,2);

        //Then
        assertEquals(6.0,addResult);
        assertEquals(2.0,subResult);
        assertEquals(8.0,mulResult);
        assertEquals(2.0,divResult);
    }
}
