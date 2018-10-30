/*
CSC 142
Justin Byun No partner at this time
HW#06 Last updated 10/26
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Status: Test passed
*/

package com.example.java;
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Main {

    public static void main(String[] args)
            throws FileNotFoundException {
        System.out.println("#15 coinFlip");
        System.out.println();

        Scanner input = new Scanner(new File("coin.txt"));
        while(input.hasNextLine()) {
            String text = input.nextLine();
            coinFlip(text);
        }
    }

    public static void coinFlip(String text) {
        Scanner data = new Scanner(text);
        int headCount = 0;
        int count = 0;

        while(data.hasNext()) {
            String word = data.next().toUpperCase();
//            System.out.println(word);

            if(word.equals("H")) {
                headCount ++;
            }
            count ++;
        }
        double percent = Math.round(100.0*headCount/count);

        if (percent > 50.0) {
            System.out.println(headCount + " heads " + " (" + percent + "%)\n" + "You win!");

        } else {
            System.out.println(headCount + " heads " + " (" + percent + "%)");
            System.out.println();
        }
    }
}
