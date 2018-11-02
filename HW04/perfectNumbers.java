/*
CSC 142
Justin Byun No partner at this time
HW#04 Last updated 10/16
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
*/

package com.example.java;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Find Perfect Numbers!");
        int num = console.nextInt();

        System.out.print("Perfect Number upto " + num + " : ");
        perfectNumbers(num);
    }

    public static void perfectNumbers(int n) {
        int sum = 0;
        boolean ans = false;
        for(int i=1; i <n; i ++) {
            if(n%i ==0) {
                System.out.print(" " + i);
                sum =+ i;
            }
        }
        if (sum == n) {
            System.out.print(sum + " ");
        }

    }
}