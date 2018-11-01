package com.example.java;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args)
            throws FileNotFoundException {
        Scanner input = new Scanner(new File("input.txt"));
        boyGirl(input);
    }

    public static void boyGirl(Scanner input) {
        int line_Num = 0;
        int boy_count = 0;
        int girl_count = 0;
        int boy_sum = 0;
        int girl_sum = 0;

        while(input.hasNextLine()) {
            String text = input.nextLine();
            line_Num++;

            Scanner data = new Scanner(text);
            String name = data.next();
//            System.out.println(name);
//            System.out.println(val);
//            System.out.println(line_Num);
//            int val = data.nextInt();

            if(line_Num%2 !=0) {
                boy_count ++;
                boy_sum += data.nextInt();
//                System.out.println("LINE_NUM: " + line_Num);

            } else {
                girl_count ++;
                girl_sum += data.nextInt();
//                System.out.println("LINE_NUM: " + line_Num);
            }

        }
        System.out.println("Your file contains: " + boy_count + " boys and " + girl_count + " girls.");
        System.out.println("The different between boys and girls sums:  " + Math.abs(boy_sum - girl_sum));
    }
}
