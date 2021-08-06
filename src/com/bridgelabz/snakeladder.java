package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;
public class snakeladder {
    public static final int WINNING_POSITION = 100;

    public static void main(String[] args) {
        int startposition = 0;
        int dieRoll =0;
        System.out.println("enter your name:");
        Scanner name = new Scanner(System.in);
        String playername = name.next();
        while (WINNING_POSITION > startposition) {
            Random dice = new Random();
            int dicenumber;
            dicenumber = dice.nextInt(6);
            if(dicenumber<=6) {
                dieRoll = dieRoll + 1;
            }
            System.out.println("number is " + dicenumber);
            int checkoption;
            checkoption = dice.nextInt(3);
            System.out.println("number is " + checkoption);
            int needToWin=WINNING_POSITION-startposition;
            if(needToWin>=dicenumber){
            switch (checkoption) {
                case 0:
                    System.out.println("Noplay");
                    startposition += 0;
                    break;
                case 1:
                    System.out.println("ladder :" + "+" + dicenumber);
                    startposition += dicenumber;
                    System.out.println("current position is" +startposition);
                    break;
                default:
                    System.out.println("ladder :" + "-" + dicenumber);
                    startposition -= dicenumber;
                    System.out.println("current position is" +startposition);

                    if (startposition < 0) {
                        startposition = 0;
                        System.out.println("star again");
                    }
            }System.out.println("number of times dice is rolled=" +dieRoll);
            }
        }System.out.println( playername+ "wins the game");
    }
}