/*
CSC 142
Justin Byun No partner at this time
HW#05 Last updated 10/22
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Status: passed the test
*/

package com.example.java;
import java.lang.Math;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("digitSum #18");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        System.out.println(digitSum(num));
    }

    public static int digitSum(int n) {
        int num = Math.abs(n);
        int sum = 0;
        if (num==0) {
            sum = 0;
        }
        while(num > 0) {
            sum += (num%10);
//            System.out.println(sum);
            num/=10;
        }
        return sum;
    }
}
