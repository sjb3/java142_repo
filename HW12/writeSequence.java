/*
CSC142
Justin Byun,  No partner at this time
HW#09 Last updated 12/09
Used IDE: MS VS_Code
Test: passed
*/


  public class Main{

    public static void main(String[] args) {
        writeSequence(10);
    }
    public static void writeSequence(int n) {
      int num = (int) Math.round(n/2.0);
      String flag = "";
      if(n%2==0) {
        flag = "even";
      } else {
        flag == "odd";
      }
    }
    public static void String writeSequence(int n, String flag) {
      if(n<1) {
        throw new IllegalArgumentException("Passing value can\'t be less than 1");
      } else if (n==1 && flag.equals("odd")) {
        return "1";
      } else if (n==1 && flag.equals("even")) {
        return "1 1";
      } else {
        return n + " " + writeSequence(n-1, flag) + " " + n;
      }
    }
}
