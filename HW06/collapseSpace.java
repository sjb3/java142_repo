/*
CSC 142
Justin Byun No partner at this time
HW#06 Last updated 10/25
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Status: test passed
*/

package com.example.java;
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args)
            throws FileNotFoundException{
        System.out.println("#05 collapseSpaces");
        System.out.println();
        Scanner console = new Scanner(new File("input.txt"));

        while(console.hasNext()) {
            String word = console.next();
            collapseSpaces(word);
        }
    }

    public static void collapseSpaces(String word) {
        Scanner data = new Scanner(word);
        String new_word = "";
        while (data.hasNext()) {
            new_word += data.next() + " ";
        }
        System.out.print(new_word);
    }
}
