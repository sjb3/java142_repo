/**
 * CSC 142
 * Justin Byun No partner at this stage
 * HW#2 Last updated 09/29
 * appx. 5 hours total
 * Used IDE: IntelliJIDEA(Eclipse)
 **/

 /**
From the given pattern,
display portion increases as row changes (1-> 5) ; hence becomes the outer loop same as counter(i)
whilest undisplaying part decreases (4 -> 0); hence it becomes 5-i(counter)
for print,
you can print i of *
print 5-1 blank
print new line
**/

public class Star_pyramid {
 /**
From the given pattern,
display portion increases as row changes (1-> 5) ; hence becomes the outer loop same as counter(i)
whilest undisplaying part decreases (4 -> 0); hence it becomes 5-i(counter)
for print,
you can print i of *
print 5-1 blank
print new line
**/
  public static void main(String[] args) {
    System.out.println("Exercise 5.");
    for(int i=1; i<=5; i++) {
      for(int j=0; j<i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}