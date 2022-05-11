package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();
        int addResult = calculator.add(5, 12);
        int subtractResult = calculator.subtract(24, 13);

        if(addResult == (5 + 12)){
            System.out.println("Add test OK");
        } else{
            System.out.println("Add test - Error");
        }

        if(subtractResult == (24 - 13)){
            System.out.println("Subtract test OK");
        } else{
            System.out.println("Subtract test - Error");
        }
    }
}