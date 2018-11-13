package com.example.java;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String[] pal = {"alpha", "beta", "gamma", "Alpha"};
        isPalindrome(pal);
    }

    public static void isPalindrome(String[] pal) {
        for(int i=0; i<=(pal.length-1)/2; i++) {
            if (pal[i].equals(pal[pal.length-1-i])) {
                System.out.println("true");
            }

        }
        System.out.println("false");
    }
}
