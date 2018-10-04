/*

 *****
  ***
   *

*/

public class makeV {
  public static void main(String[] args) {
    for(int i=1; i<=3; i++) {
      for(int j=1; j<= i-3; j++) {
        System.out.print("*");
      }
      for(int j=1; j <=3-2; j++) {
        System.out.print("$");
      }
      System.out.println();
    }
  }
}