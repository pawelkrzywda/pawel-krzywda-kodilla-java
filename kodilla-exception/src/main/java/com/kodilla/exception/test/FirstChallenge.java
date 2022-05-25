package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result=0.0;

        try{result = firstChallenge.divide(3, 0);
        } catch(ArithmeticException a){
            System.out.println("Something went wrong: " + a);
        } finally{
            System.out.println("This is the end of try-catch-finally block.");
        }

        System.out.println(result);
    }
}