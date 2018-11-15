/*
CSC 142
Justin Byun No partner at this time
HW#06 Last updated 11/06
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Status: Test passed
*/

package com.example.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // testing case
        int n = 2;
        int [] arr = {74, 85, 102, 99, 101, 56, 84};
        System.out.println("#7. kthLargest");
        System.out.println(kthLargest(n, arr));
    }

    public static int kthLargest(int k, int[] a) {
        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
        int answer=0;
        if (k >=0) {
            answer += a[a.length-1-k];
        }
        return answer;
    }
}
