/**
 * CSC 142
 * Justin Byun No partner at this stage
 * HW#2 Last updated 09/29
 * appx. 5 hours total
 * Used IDE: VSCode

*
**
***
****
*****

 **/

public class Star_pyramid {
 /**
From the given pattern,
display portion increases as row changes (1-> 5) ; hence becomes the outer loop same as counter(i) progresses
whilest inside the loop, columns will be displayed as * but it will be affected by outer loop (row counts and column counts will be the same)
therefore, inner iteration will be affected by outer iteration
**/
  public static void main(String[] args) {
    System.out.println("Exercise 5.");
    for(int i=1; i<=5; i++) {
      for(int j=1; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}