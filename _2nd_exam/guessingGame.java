package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        int randNum = rand.nextInt(100);

        System.out.println("Now, type your guessed number");
//        System.out.println("Secret Num: " + randNum);

        Scanner console = new Scanner(System.in);
        int guessedNum = console.nextInt();
        int count = 0;
        while(randNum != guessedNum) {
            if(randNum > guessedNum) {
                System.out.println("Too low, try again! ");
                guessedNum = console.nextInt();
            } else {
                System.out.println("Too high, try again! ");
                guessedNum = console.nextInt();
            }
            count++;
        }

        System.out.print("You\'ve got it right!");
        System.out.println(" after " + count + "trials");
    }
}
