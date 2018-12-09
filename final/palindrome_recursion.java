public class Main{

  public static void main(String []args){
     System.out.println(isPalindrom("H"));
  }
 public static boolean isPalindrom(String str) {
  // base case: single value seq shoul dbe palindrom
  // if not equal stops,
  // compare the first and last item for each time
  if(str.length() ==0 || str.length() ==1) {
  return true;
  } else {
    char first = str.charAt(0);
    char last = str.charAt(str.length()-1);
    if(first != last) {
      return false;
    } else {
    //   str = str.substring(1, str.length()-1);
      return (isPalindrom(str.substring(1, str.length()-1)));
    }
  }
}
}