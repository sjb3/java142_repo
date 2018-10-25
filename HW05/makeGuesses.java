/*
CSC 142
Justin Byun No partner at this time
HW#05 Last updated 10/21
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
*/

package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("makeGuesses #6");
        System.out.println("Total guesses :" + makeGuesses());
    }

    public static int makeGuesses() {
        Random rand = new Random();
        int count = 0;
        int randNum = rand.nextInt(50) + 1;
        while(randNum <= 48) {
            System.out.println("guess = " + randNum);
            count ++;
            randNum = rand.nextInt(50) + 1;
        }
        return count;
    }
}
