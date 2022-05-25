package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsGame {
    private String playersName;
    private String action;
    private int playersMove;
    private int computersMove;
    private int gamesToBePlayed;
    private int playerScore;
    private int computerScore;
    private String result;
    private String[] moves = new String[]{" ", "rock", "paper", "scissors"};

    public RpsGame(String playersName, int gamesToBePlayed) {
        this.playersName = playersName;
        this.gamesToBePlayed = gamesToBePlayed;
    }

    public String playGame(){
        Scanner scan = new Scanner(System.in);
        System.out.println("You started a new game. Win " + gamesToBePlayed + " rounds to win the game.");
        playersMove=0;
        playerScore=0;
        computersMove=0;
        computerScore=0;

        while(playerScore<gamesToBePlayed && computerScore<gamesToBePlayed){
            System.out.println("Please choose your move:");
            action = scan.nextLine();

            if(action.equals("x")){
                System.out.println("Do you want to end the program? Press y (yes) or n (no):");
                action = scan.nextLine();
                if(action.equals("y")){
                    return result ="x";
                } else if(action.equals("n")){
                    System.out.println("Please choose your move:");
                    action = scan.nextLine();
                } else{
                    return "n";
                }
            }else if(action.equals("n")){
                System.out.println("Do you want to end current game? Press y (yes) or n (no):");
                action = scan.nextLine();
                if(action.equals("y")){
                    return result ="n";
                }else if(action.equals("n")){
                    System.out.println("Please choose your move:");
                    action = scan.nextLine();
                }
            }else{playersMove = Integer.parseInt(action);}

            System.out.println("You chose " + moves[playersMove]);
            computersMove =generateMove();
            System.out.println("Computer chose " + moves[computersMove]);

            if((playersMove==1&&computersMove==3) || (playersMove==2&&computersMove==1) || (playersMove==3&&computersMove==2)){
                playerScore++;
                System.out.println("You win this round!");
            }else if((playersMove==1&&computersMove==2) || (playersMove==2&&computersMove==3) || (playersMove==3&&computersMove==1)){
                computerScore++;
                System.out.println("Computer wins this round.");
            }
            System.out.println("Current score: " + playersName + ": " + playerScore + ". Computer: " + computerScore);
        }

        if(playerScore>computerScore){
            System.out.println("You won the game!");
            System.out.println("Final scores: " + playersName + ": " + playerScore + ". Computer: " + computerScore);
        } else{
            System.out.println("You lost the game.");
            System.out.println("Final scores: " + playersName + ": " + playerScore + ". Computer: " + computerScore);
        }

        System.out.println("Please choose:\n" +
                "press x to end program\n" +
                "press n to start a new game");
        action = scan.nextLine();

        if(action.equals("x")){
            System.out.println("Do you want to end the program? Press y (yes) or n (no):");
            action = scan.nextLine();
            if(action.equals("y")){
                return result ="x";
            } else{
                return result ="n";
            }
        }else if(action == "n"){
            System.out.println(action);
            return result = "n";
        }
        return result;
        }

    public int generateMove(){
        Random random = new Random();
        return random.nextInt(3) + 1;
    }
}
