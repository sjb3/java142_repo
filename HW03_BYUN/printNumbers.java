/*
CSC 142
Justin Byun No partner at this time
HW#03 Last updated 10/09
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)
*/

package com.example.java;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    /* prompt message to the end user to start off and take in the user inputs
    * subsequently, pass the input value to the method area
    *  And report results in the end
    */
        System.out.print("Enter the number you wanna print out :");
        Scanner console = new Scanner(System.in);
        int input_num = console.nextInt();
        printNumbers(input_num);
    }
    public static void printNumbers(int max) {
        // Create the iteration to loop it through and
        // print them according to given format
        for(int i=1; i <= max; i++) {
            System.out.print("[" +i+ "] ");
        }
        // didnt' return the value as if so, it's gonna pull the very last item of the iteration
    }
}
