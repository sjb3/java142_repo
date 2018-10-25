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
        System.out.println("Enter the radius value to calculate the surface area of a cylinder: ");
        Scanner console = new Scanner(System.in);
        double radius = console.nextDouble();
        System.out.println("Enter the height value: to calculate the surface area of a cylinder: ");
        double height = console.nextDouble();

        System.out.println("Surface area of a cylinder is "+ cylinderSurfaceArea(radius, height));
    }
    public static double cylinderSurfaceArea(double r, double h) {
        // execute the proper math function after importing java.Math
        double area = 2*Math.PI*r*(r + h);
        return area;
    }
}
