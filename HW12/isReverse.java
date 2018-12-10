/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 12/09
Used IDE: MS VS_Code
Test: passed
*/


import java.util.*;

public class Main {
  public static void main(String[] args) {
    System.out.println(isReverse("aga", "aga"));
  }
  public static boolean isReverse(String a, String b) {
    if(a.length() ==0 && b.length() ==0) {
      return true;
    } else if(a.length() == b.length()) {
      int len = a.length();

      char first = Character.toLowerCase(a.charAt(0));
      char last = Character.toLowerCase(b.charAt(len-1));
      if(first == last) {
        a = a.substring(1);
        b = b.substring(0, b.length()-1);
        // return isReverse(a, b);
        return isReverse(a, b);
      } else {
        return false;
      }
  }
  return false;
}
}
