package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number you desire:");
        Scanner console = new Scanner(System.in);
        int input_num = console.nextInt();
        printNumbers(input_num);
    }
    public static void printNumbers(int max) {
        for(int i=0; i <= max; i++) {
            System.out.print("[" +i+ "] ");
        }
    }
}
