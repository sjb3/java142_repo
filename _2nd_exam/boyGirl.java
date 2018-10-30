package com.example.java;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner data = new Scanner(new File("filename"));
        boyGirl(data);
    }

    public static void boyGirl(Scanner data) {
//        Scanner data = new Scanner(input);
        int line_num = 0;
        while (data.hasNextLine()) {
            line_num++;
            int boy_count = 0;
            int girl_count = 0;
            int boy_sum = 0;
            int girl_sum = 0;
            if (line_num % 2 != 0) {
                boy_count++;
                boy_sum += data.nextInt();
            } else {
                girl_count++;
                girl_sum += data.nextInt();
            }
            System.out.println("boy_count" + boy_count);
            System.out.println("girl_count" + girl_count);
            System.out.println("boy_sum" + boy_sum);
            System.out.println("girl_sum" + girl_sum);
        }
    }
}
