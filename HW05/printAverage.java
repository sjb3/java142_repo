/*
CSC 142
Justin Byun No partner at this time
HW#05 Last updated 10/22
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Not complete
*/

package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("printAverage #12");
        System.out.println("Enter # to calculate average, to get results, enter 0 or neg #");
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        printAverage(input);
    }

    public static void printAverage(int n) {
        int count = 0;
        int sum = 0;

        if(n <= 0) {
            System.out.println("Type a number: " + n);
        }

        while(n>0) {
            sum += n;
            count ++;

            System.out.println("Type a number: " + n);
            Scanner console = new Scanner(System.in);
            console = new Scanner(System.in);
            n = console.nextInt();
//            System.out.println("Average was: " + 1.0*sum/count);
        }
        System.out.println("Average was: " + 1.0*sum/count);
    }
}
