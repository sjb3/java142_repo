/*
CSC 142
Justin Byun No partner at this time
HW#06 Last updated 11/06
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Status: Test passed!
*/

package com.example.java;
import java.util.*;
import java.lang.Math;
public class Main {

    public static void main(String[] args) {
        System.out.println("#06 stdev");
        int[] arr = {1,-2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(stdev(arr));
    }

    public static double stdev(int[] arr) {
        double sum = 0.0;
        for(int i=0; i< arr.length; i++) {
            sum+= arr[i];
        }
        double avg =  1.0 * sum/(arr.length);

        double stdev = 0.0;
        double acc = 0.0;
        for(int i=0; i<arr.length; i++) {
            acc += Math.pow((arr[i]-avg),2);
        }
        return Math.sqrt(acc/(arr.length-1));
    }
}
