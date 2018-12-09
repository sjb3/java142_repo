package com.example.java;
import java.util.*;

public class Main{

    public static void main(String[] args) {
        writeSquare(10);
    }

    public static void writeSquare(int n) {
        int min = 1;
        int max = n;

        if(n==1) {
            System.out.println(n);
        } else if(n%2==1) {
            System.out.print(n*n);
            System.out.print(", ");
            writeSquare(n-2);
        } else if(n%2==0) {
            System.out.print((n-1)*(n-1));
            System.out.print(", ");
            writeSquare(n-2);
        } else {
            System.out.print(n*n);
            System.out.print(", ");
            writeSquare(n+2);
        }
    }
}
