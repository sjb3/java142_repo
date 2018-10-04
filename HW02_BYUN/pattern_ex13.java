/**
 * CSC 142
 * Justin Byun No partner at this stage
 * HW#2 Last updated 09/29
 * appx. 5 hours total
 * Used IDE: VSCode(MS)

999998888877777666665555544444333333222221111100000
999998888877777666665555544444333333222221111100000
999998888877777666665555544444333333222221111100000
999998888877777666665555544444333333222221111100000
999998888877777666665555544444333333222221111100000

Very outer loop will be the rows(5)
inside the loop will be the columns;
To have it repeated, inside the middle loop, use another nested loop
for repetition
 **/

public class EX13 {
  public static void main(String[] args) {
    System.out.println("Exercise 13.");
    for(int i=1; i <=5; i++) {
      for(int j=9; j>=0; j--) {
        for(int k=1; k<=5; k++) {
          System.out.print(j);
        }
      }
      System.out.println();
    }

  }
}