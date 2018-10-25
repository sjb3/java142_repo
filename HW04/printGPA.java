/*
CSC 142
Justin Byun No partner at this time
HW#04 Last updated 10/16
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
*/

// After implement Scanner console,
// prompt proper message to end users
// compute average after accumulate sum for each iteration

package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        printGPA(console);
    }

    public static void printGPA(Scanner console) {

        System.out.print("Enter a student name: ");
        String name = console.next();
        System.out.print("Enter how many scores you wanna test: ");
        int times = console.nextInt();
        double grade = 0;
        double avg = 0;
        System.out.println("Now enter each of the test score: ");
        for(int i=1; i<=times; i ++) {
            int score = console.nextInt();
            grade += score;
            avg = (grade/times);
        }
        System.out.println(name + "\' grade is " + avg);
    }
}
