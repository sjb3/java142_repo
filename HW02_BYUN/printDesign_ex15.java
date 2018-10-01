/**
 * CSC 142
 * Justin Byun No partner at this stage
 * HW#2 Last updated 09/30
 * appx. 5 hours total
 * Used IDE: IntelliJIDEA(Eclipse)
 **/

/**
  * Outer loop will be the same as it progress from 1 upto 5(th row)
  however inner loop, the first and last loop will be displaying the space that
  from the initial space(5), decresed by 1 for each iteration

  between th einner loop,
  odd numbers should be displayed, hence, set another int var odd and after each iteration add by 2
  to get the odd number and print out
**/
public class PrintDesign {
  public static void main(String[] args) {
    int odd = 1;
    int initialSpace = 5;

    for(int i=1; i<=5; i++) {
      // int k = 0;
      for(int j=1; j<=initialSpace; j++) {
        System.out.print("-");
      }
      for(int j=1; j<=odd; j++) {
        System.out.print(odd);
      }
      for(int j=1; j<=initialSpace; j++) {
        System.out.print("-");
      }
      System.out.println();
      odd+=2;
      initialSpace-=1;
    }
  }
}