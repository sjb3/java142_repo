package com.example.java;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] a = {1,6,2,7,3,6,4};
        System.out.println(swaping(a));
    }

    public static boolean swaping(int[] a) {
        for(int i=0; i< a.length-1; i++) {
          // if out of order
            if(a[i] > a[i+1]) {
                // swaping happens here
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                return true;
            }
        }
        return false;
    }
}
