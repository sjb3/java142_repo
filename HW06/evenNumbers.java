/*
CSC 142
Justin Byun No partner at this time
HW#06 Last updated 10/25
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Status: incomplete
*/

package com.example.java;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args)
            throws FileNotFoundException {
        System.out.println("#02 evenNumbers");
        System.out.println();
        Scanner console = new Scanner(new File("integer.txt"));
        evenNumbers(console);
    }

    public static void evenNumbers(Scanner console) {

        int count = 0;
        int sum = 0;
        int even_count = 0;
        while(console.hasNextInt()) {
            int num = console.nextInt();
            sum += num;
            count ++;
            if(num%2 ==0) {
                even_count++;
            }
        }
        System.out.println(count + " numbers, " + " sum = " + sum);
        System.out.println(even_count + " evens " + Math.round(even_count* 100.0/count) + "%");
    }
}
