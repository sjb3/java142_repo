/*
CSC 142
Justin Byun No partner at this time
HW#08 Last updated 11/18
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
*/

package com.example.java;
import java.util.*;

public class Point {
    // fields
    private int x;
    private int y;
    // construct
    // initial point
    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object o) {
        if(o instanceof Point) {
            Point other = Point o;
            return x == other.x && y == other.y;
        } else {
            return false;
        }
    }
    // #1 question
    public int quadrant(int a, int b) {
        if (a > 0 && b > 0) {
            return 1;
        } else if (a > 0 && b < 0) {
            return 4;
        } else if (a < 0 && b > 0) {
            return 2;
        } else if (a < 0 && b < 0) {
            return 3;
        } else {
            return 0;
        }
    // #4 question
    public boolean isVertical(Point other) {
        if(this.x == other.x) {
            return true;
        }
        else {
          return false;
        }
    }
      // Returns a String for x and y coordinate.
    public String toString() {
        return "x: " + this.x + "y: " + minutes;
    }
}
