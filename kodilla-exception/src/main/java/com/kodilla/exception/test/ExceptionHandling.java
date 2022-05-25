package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1.0, 1.5);
        } catch (Exception e) {
            System.out.println("Problem found: " + e);
        } finally {
            System.out.println("End of exception handling.");
        }
    }
}
