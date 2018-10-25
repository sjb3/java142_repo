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
        System.out.println("showTwos #1");
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number you wanna check the factor of 2\'s");
        int num = console.nextInt();
//        int n =120;
        System.out.print(num);
        System.out.println(showTwos(num));
    }

    public static String showTwos(int n) {
        String answer = "";
        int quo = 0;

        while (n%2 ==0) {
            answer +=" 2 *";
            quo = quo + (n/2);
            n = n/2;
        }
        return " = " + answer + " " + n;
    }
}
