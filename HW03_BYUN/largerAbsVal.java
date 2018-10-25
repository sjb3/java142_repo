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
        System.out.print("Enter the first value you wanna compare: ");
        int first = console.nextInt();
        System.out.print("Enter the second value you wanna compare: ");
        int second = console.nextInt();
        System.out.println("The bigger value should be -> " + largerAbsVal(first, second));
    }
    public static int largerAbsVal(int a, int b) {
        // After convert the given number to absolute value,
        // compare two values and return it
        int new_a = Math.abs(a);
        int new_b = Math.abs(b);
        int largerNum;
        if(new_a > new_b) {
            largerNum = new_a;
        } else {
            largerNum = new_b;
        }
        return largerNum;
    }
}
