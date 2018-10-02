/**
 * CSC 142
 * Justin Byun No partner at this stage
 * HW#2 Last updated 09/29
 * appx. 5 hours total
 * Used IDE: VSCode

     1
    22
   333
  4444
 55555
 **/

public class EX08 {
/**
 * Similar yet different from prev excercise.
 * as we're printing out the blank first and add num next to them
 * outer loop will be the same as row/counter changes in sync
 * inner loop, j decreses from 5-i => 0, and print the blank
 * Finally, add another j loop to print the num
**/
  public static void main(String[] args) {
    System.out.println("Exercise 8.");
    for(int i=1; i<=5; i++) {
      for(int j=0; j<5-i; j++) {
        System.out.print(" ");
      }
      for(int j=0; j<i; j++) {
        System.out.print(i);
      }
      System.out.println();
    }
  }
}