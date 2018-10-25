/*
CSC 142
Justin Byun No partner at this time
HW#05 Last updated 10/23
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
Status: passed the test
*/

package com.example.java;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("isAllVowels #24");
        Scanner console = new Scanner(System.in);
        String input = console.next();
        System.out.println(isAllVowels(input));
    }

    public static String isAllVowels(String str) {

        String new_str = str.toLowerCase();
        int i = 0;
        String answer = "";

        while(i < new_str.length()) {
            char ch = new_str.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//                System.out.println(ch);
                answer = "True";
            } else {
//                System.out.println(ch);
                answer = "False";
            }
            i++;
        }
        return answer;
    }
}
