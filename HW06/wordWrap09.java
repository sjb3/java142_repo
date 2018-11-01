/*
CSC 142
Justin Byun No partner at this time
HW#06 Last updated 10/26
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Status: Test is not available
*/

package com.example.java;
import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)
            throws FileNotFoundException {
        System.out.println("#09 wordWrap09");
        System.out.println();

        Scanner console = new Scanner(new File("fileName"));
        while (console.hasNextLine()) {
            String text = console.nextLine();
            wordWrap09(text);
        }
    }

    public static String wordWrap09 (String text) {
        String line = "";
        if (text.length() >= 60) {
            line = line + text.substring(0, 61);
        } else {
            line += text;
        }
        return line;
    }
}
