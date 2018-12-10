/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 12/09
Used IDE: MS VS_Code
Test: 
*/


package com.example.java;
import java.util.*;

public class Main{

    public static void main(String []args){
        starString(3);
    }

    public static int permut(int n, int r) {

      if(n=<r) {
        throw new IllegalArgumentException();
      } else {
        return n * permut(n-1, r);
      }
    }
}
