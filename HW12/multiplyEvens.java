/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 12/09
Used IDE: MS VS_Code
Test: passed
*/


public static Main {
  public static void main(String[] args) {
    multiplyEvens();
  }
  public static int multiplyEvens(int n) {
    // int curr = 2;
    if(n<1) {
      throw new IllegalArgumentException();
    } else if(n==1) {
      return 2;
    } else {
      return multiplyEvens(n-1) * (2*n);
    }
  }
}
