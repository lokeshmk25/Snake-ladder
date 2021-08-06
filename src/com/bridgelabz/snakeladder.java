package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;
public class snakeladder {
    public static void main(String[] args) {
        int startposition = 0;
        System.out.println("enter your name:");
        Scanner name = new Scanner(System.in);
        String playername = name.next();

        Random dice= new Random();
        int dicenumber;
        dicenumber = dice.nextInt(6);
        System.out.println("number is "+dicenumber);
        int checkoption;
        checkoption = dice.nextInt(3);
        System.out.println("number is "+checkoption);
        switch (checkoption) {
            case 0:
                System.out.println("Noplay");
                startposition +=0;
                break;
            case 1:
                System.out.println("ladder :"+ "+" +dicenumber);
                startposition += dicenumber;
                break;
            default:
                System.out.println("ladder :"+"-" +dicenumber);
                startposition -= dicenumber;
                break;
        }
    }
}
