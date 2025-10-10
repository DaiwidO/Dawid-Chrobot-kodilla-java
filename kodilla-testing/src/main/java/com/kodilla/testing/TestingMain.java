package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {

        System.out.println("Test - pierwszy test jednostkowy:");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


        System.out.println("Test - drugi test jednostkowy:");

        Calculator calculator = new Calculator();

        int AddingTest = calculator.add(1, 2);
        if (AddingTest == 3) {
            System.out.println("Adding test OK");
        }
        else{
            System.out.println("Adding Error!");
        }

        int SubtractionTest = calculator.sub(1, 2);
        if (SubtractionTest == -1) {
            System.out.println("Subtraction test OK");
        }
        else{
            System.out.println("Subtraction Error!");
        }
    }
}