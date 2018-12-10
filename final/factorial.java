public class Main{
  public static void main(String[] args){
      System.out.println(factorial(4));
  }

  public static int factorial(int num) {
  // define base case
      if(num==0 || num==1) {
          return 1;
      } else {
          return num * factorial(num-1);
      }
  // define general case
  }
  // power series
  public static int facgtorial2(int base, int num) {
    // define base case
        if(num==1) {
            return (base);
        } else {
            return (base * factorial2(base, num-1));
        }
    // define general case
    }
}