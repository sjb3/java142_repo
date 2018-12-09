
// Test: passed
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
        throw new IllegalArgumentException();
      }
        if(n==0) {
//            System.out.println("*");
            return 1;
        } else {
            return 2 * starString(n-1);
        }
    }
}

package com.example.java;
import java.util.*;
public class Main{

    public static void main(String []args){
//        int num = starString(3);
        starString(3);
//
//        for(int i=0; i<num; i++) {
//            System.out.print("*");
//        }

    }

    public static void starString(int n) {
        if (n<0) {
            throw new IllegalArgumentException("Can\'t be negative value");
        }
        if(n==0) {
            System.out.print("*");
        }
        
        if(n==1) {
            System.out.print("&&");
        } else {
            System.out.print("**");
            starString(n-1);


//            return 2 * starString(n-1);
        }
    }
}