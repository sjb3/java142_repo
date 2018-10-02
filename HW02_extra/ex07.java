/*
$$$$1
$$$2
$$3
$4
5
*/
public class _07 {
  public static void main(String[] args) {
    for(int i=1; i<=5; i++) {
      for(int j=4; j>=i; j--) {
        System.out.print("$");
      }
      System.out.print(i);
      System.out.println();
    }
  }
}