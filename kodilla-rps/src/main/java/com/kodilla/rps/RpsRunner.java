package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean end=false;
        String result="";

        System.out.println("Welcome Player to rock-scissors-paper simulator!\nPlease enter your name:");
        String playersName = scan.nextLine();
        System.out.println("Please enter number of rounds needed to win the game:");
        int gamesToBePlayed = scan.nextInt();
        RpsGame game = new RpsGame(playersName, gamesToBePlayed);

        System.out.println("These are the possible actions:\n" +
                "press 1 to play rock\n" +
                "press 2 to play paper\n" +
                "press 3 to play scissors\n" +
                "press x to end program\n" +
                "press n to start a new game");

        while(!end) {
            result = game.playGame();
            if(result == "x"){end = true;}else if(result == "n"){
                game.playGame();
            }
        }
        System.out.println("Program ended.");
    }
}