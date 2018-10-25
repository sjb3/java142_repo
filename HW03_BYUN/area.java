/*
CSC 142
Justin Byun No partner at this time
HW#03 Last updated 10/09
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)
*/

package com.example.java;
import java.lang.Math;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    /* prompt message to the end user to start off and take in the user inputs
    * subsequently, pass the input value to the method area
    */
        System.out.print("Enter the value of radius");
        Scanner console = new Scanner(System.in);
        double input_raius = console.nextDouble();
        System.out.println("The area of a circle is " + area(input_raius));
    }

    public static double area(double r) {
        // execute the math function after importing Math
        double area_result = Math.PI*Math.pow(r, 2);
        return area_result;
    }
}
