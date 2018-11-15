package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(">>> Now enter how many times you wanna iterate the loop: ");
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();

        System.out.println(longestName(console, num).toUpperCase() + "\'s name is the longest!");
    }

    public static String longestName(Scanner console, int n) {
        String name = "";
        String longest = "";
//        boolean areTies = false;

        for(int i=1; i<=n; i++) {
            System.out.print("Enter name #" + i + " : ");
            name = console.next();

            if(name.length()> longest.length()) {
                longest = name;
//                areTies = false;
            }
//            if(name.length() ==longest.length()) {
//                areTies = true;
//            }
        }
        return longest;


    }
}
