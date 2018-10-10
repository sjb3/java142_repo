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
        System.out.print("Enter the string that you wanna FLIP!");
        Scanner console = new Scanner(System.in);
        String input_str = console.nextLine();
        printReverse(input_str);
    }
    public static void printReverse(String str) {
        // print the reversed string
        // in case it entered value is blank,
        // print a blank: if its not blank,
        // iterate backward and print the character
        int i = str.length()-1;
        if (str.length() == 0) {
            System.out.println(" ");
        } else {
            for (; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
