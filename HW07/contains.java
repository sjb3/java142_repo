/*
CSC 142
Justin Byun No partner at this time
HW#06 Last updated 11/06
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Status: ?
*/

package com.example.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int [] seq1 = {1,6,2,1,4,1,2,1,8};
        int [] seq2 = {1,2,1};

        System.out.println("#14 contains: ");
        System.out.println(contains(seq1, seq2));
    }

    public static boolean contains(int[] a1, int[] a2) {
        boolean answer = false;

        if(Arrays.asList(a1).containsAll(Arrays.asList(a2))) {
            answer = true;
        }
        return answer;
    }
}


