/*
fibo series, 0,1,1,2,3,5,8,13,21
*/


public class Main {

  public static void main(String[] args){
  }
// num is position
  public static int fibo(int num) {
  // double(2x) base case
    if(num==0) {
      return 0;
    } else if(num==1) {
      return 1;
    } else {
      return fibo(num-1) + fibo(num-2);
    }
  // define general case
  }
}

