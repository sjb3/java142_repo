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
//         if(Arrays.asList(a1).containsAll(Arrays.asList(a2))) {
//             answer = true;
//         }
        if(Arrays.asList(a1).contains(Arrays.asList(a2))) {
            answer = true;
        }
        return answer;
    }
}

