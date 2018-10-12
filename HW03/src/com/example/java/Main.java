package com.example.java;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the string that you wanna FLIP!");
        Scanner console = new Scanner(System.in);
        String inputs = console.nextLine();
        System.out.println(print_reverse(inputs));
    }
    public static String print_reverse(String str) {
        int i = (str.length() -1);
        String word = "";
        for (; i>=0; i--) {
            word += str.charAt(i);
        }
        return word;
    }
}
