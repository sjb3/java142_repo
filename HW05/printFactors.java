/*
CSC 142
Justin Byun No partner at this time
HW#05 Last updated 10/21
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Status: passed the test
*/

package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("printFactors #9");
        System.out.println("Enter a number that you wanna print out the factors! ");
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        System.out.println(printFactors(input));
    }

    public static String printFactors(int num) {
        if(num<=0) {
            System.out.println("Number shouldn\'t be negative or 0");
        }

        String results = "";

        int i = 1;
        while(i < num) {
            if(num%i ==0) {
                results = results + i + " and ";
            }
            i++;
        }
        return results + num;
    }
}
