/**
 * CSC 142
 * Justin Byun No partner at this stage
 * HW#2 Last updated 09/29
 * appx. 5 hours total
 * Used IDE: IntelliJIDEA(Eclipse)
 **/

public class Fibonacci {
/**
 * From the def of the fib,
 * first and second value will dictate the third value,
 * after print out, the int value will be re-assigned to calculate the next number,
 * here, n1 and n2 values are set and printed to start off the fib
 * then, n3 value will be calculated and printed to 10th n3, total 12 fib
 * **/
  public static void main(String[] args) {
    System.out.println("Excercise 3.");

    int n1=1, n2=1, n3=0, counter=10;
    System.out.print(n1 + " " +  n2);
    for(int i=1; i<=counter;i++) {
      n3 = n1 + n2;
      System.out.print(" " + n3 + " ");
      n1=n2;
      n2=n3;
    }
  }
}