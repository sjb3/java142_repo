public class ReverseString{

  public static void main(String []args){
     printBinary(2);
  }
  
 public static void printBinary(int b) {
 // base case
   if (b>0) {
     printBinary(b/2);
     System.out.printf("%d", b%2);
   }
 }
}