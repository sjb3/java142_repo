/*

 *****
  ***
   *

*/

public class makeV {
  public static void main(String[] args) {
    for(int i=1; i<=3; i++) {

      for(int j=1; j <=i; j++) {
        System.out.print("$");
      }
           for(int j=0; j<= 3-i; j++) {
        System.out.print("*");
      }
             for(int j=0; j<= 3-i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
// in progress
  }
}