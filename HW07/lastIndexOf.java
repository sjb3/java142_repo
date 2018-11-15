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
public class Main {

    public static void main(String[] args) {
        int [] a = {74, 85, 102, 99, 101, 85, 56};
        int x = 85;
        System.out.println("#1 lastIndexOf: ");
        System.out.println("index is " + lastIndexOf(a, x));
    }

    public static int lastIndexOf(int[] arr, int x) {
        int count = 0;
        boolean answer = false;
        for(int i=arr.length-1; i>=0; i--) {
            if(x == arr[i]) {
                // count ++;
                return i;
            }
        }
        return -1;
    }
}
