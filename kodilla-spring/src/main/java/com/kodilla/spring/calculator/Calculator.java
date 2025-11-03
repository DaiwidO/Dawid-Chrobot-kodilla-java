package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    Display display;

    double add(double a, double b){
        double result = a+b;
        System.out.println("Adding " + a + " to " + b);
        display.displayValue(result);
        return a+b;
    }

    double sub(double a, double b){
        double result = a-b;
        System.out.println("Subtracting " + a + " by " + b);
        display.displayValue(result);
        return a-b;
    }

    double mul(double a, double b){
        double result = a*b;
        System.out.println("Multiplying " + a + " by " + b);
        display.displayValue(result);
        return result;
    }

    double div(double a, double b){
        double result = a/b;
        System.out.println("Dividing " + a + " by " + b);
        display.displayValue(result);
        return a/b;
    }
}
