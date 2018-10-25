/*
CSC 142
Justin Byun No partner at this time
HW#03 Last updated 10/09
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)
*/

package com.example.java;
import java.lang.Math;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    /* prompt message to the end user to start off and take in the user inputs
    * subsequently, pass the input value to the method area
    *  And report results in the end
    */
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the base value; ");
        int base = console.nextInt();
        System.out.print("Enter the base power; ");
        int power = console.nextInt();
        printPowerOfN(base,power);
    }
    public static void printPowerOfN(int b, int e) {
        // Calculate the given value starting from base^0 upto the
        // input #
        // As we're looping through, didn't return the value:
        // in case using return, it will return the very last value of it
        for(int i=0; i<=e; i ++) {
            System.out.print(" "+ (int)Math.pow(b, i));
        }
    }
}
