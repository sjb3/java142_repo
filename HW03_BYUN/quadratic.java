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
    *  And report results in the end
    */
        System.out.println("Enter three coefficients to solve quadratics");
        Scanner console = new Scanner(System.in);
        double input_a = console.nextDouble();
        double input_b = console.nextDouble();
        double input_c = console.nextDouble();
        quadratic(input_a, input_b, input_c);
    }
    public static void quadratic(double a, double b, double c) {
        double ans1, ans2;
        // compute the quadratic which is given
        // used print method here as (as far as i know) you can't return two vars
        ans1 = (-b + Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        ans2 = (-b - Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a;
        System.out.println("Answers are " + ans1 + " " + ans2);
    }
}
