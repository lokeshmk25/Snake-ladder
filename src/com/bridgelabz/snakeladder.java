package com.bridgelabz;
import java.util.Scanner;
import java.util.Random;
public class snakeladder {
    public static void main(String[] args) {
        int startingposition = 0;
        System.out.println("enter your name:");
        Scanner name = new Scanner(System.in);
        String playername = name.next();

        Random dice= new Random();
        int number;
        number = dice.nextInt(6);
        System.out.println("number is "+number);

    }
}
