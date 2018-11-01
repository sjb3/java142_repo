package com.example.java;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
        apples(input);
    }

    public static void apples(Scanner input) {

            while (input.hasNextLine()) {
                int id = input.nextInt();
                String f_name = input.next();
                String l_name = input.next();

                System.out.printf("%d %s %s\n", id, f_name, l_name);
            }


    }
}
