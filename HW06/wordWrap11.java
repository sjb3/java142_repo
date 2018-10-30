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
        System.out.println("#11 wordWrap11");
        System.out.println();

        Scanner console = new Scanner(new File("fileName"));
        while (console.hasNextLine()) {
            String text = console.nextLine();
            wordWrap09(text);
        }
    }

    public static void wordWrap09 (String text) {
        Scanner data = new Scanner(text);
        String new_str = "";
        String str = data.split(" ");
        int count = 0;

        while(num < 60) {
          new_str += str;
          count ++;
          if(count >= 60) {
            System.out.println(new_str);
          }
        }
        System.out.println(new_str);
    }
}
