package com.example.java;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(parseNadd(234));
    }
    public static int parseNadd(int num) {
  // as NOT decrementing the given numbers, need different approach for base case
  // for base case, if single digit given, return it and DONE
      if(num <9) {
        return num;
      } else {
        return num%10 + parseNadd(num/10);
      }
  }
}

