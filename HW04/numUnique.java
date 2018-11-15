package com.example.java;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 3 numbers you wanna compare: ");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        System.out.println(numUnique(a,b,c));
    }

    public static int numUnique(int a, int b,int c) {
        int result = 0;
        if(a==b && b==c && a==c) {
            result += 0;
        } else if ((a==b && b==c && a!=c)||(a==b && b!=c && a==c) || (a!=b && b==c && a==c)) {
            result += 1;
        } else if ((a==b && b!=c && a!=c)||(a!=b && b!=c && a==c) || (a!=b && b==c && a!=c)) {
            result =+2;
        } else {
            result = 3;
        }
        return result;
    }
}