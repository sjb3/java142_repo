/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 12/09
Used IDE: MS VS_Code
Test: passed
*/

package com.example.java;
import java.util.*;
public class Main{

    public static void main(String []args){
        starString(3);
    }

    public static String starString(int n) {
        if (n<0) {
            throw new IllegalArgumentException("Can\'t be negative value");
        } else if(n==0) {
            return ("*");
        } else {
            return starString(n-1) + starString(n-1);
        }
    }
}

// Another way
package com.example.java;
import java.util.*;

public class Main{
    public static void main(String []args){
        int num = starString(3);
        for(int i=0; i<num; i++) {
            System.out.print("*");
        }
    }
    public static int starString(int n) {
      if (n<0) {
        throw new IllegalArgumentException("Can\'t be negative value");
      }
        if(n==0) {
            return 1;
        } else {
            return 2 * starString(n-1);
        }
    }
}
