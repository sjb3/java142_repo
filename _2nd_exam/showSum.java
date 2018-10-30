package com.example.java;
import java.io.*;
import java.util.*;

public class showSum {
    public static void main(String[] args) {
            throws FileNotFoundException {

        Scanner console = new Scanner(System.in);
        System.out.print("What is the file name?");
        String name = console.nextLine();
        Scanner input = new Scanner(new File(name));

        double sum = 0.0;
        int count = 0;
        while(input.hasNextInput()) {
            double next = input.nextDouble();
            count ++;
            System.out.println("Number " + count + " = " + next);
            sum += next;
        }
        System.out.println("Sum = " + sum);
    }
}

