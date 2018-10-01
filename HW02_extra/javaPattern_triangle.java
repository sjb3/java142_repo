/**1
121
12321
1234321
**/

public class Triangle {
  public static void main(String[] args) {
    int odd = 1;
    for(int i=1; i<=4; i++) {
      int k = 0;
      for(int j=1; j<=odd; j++) {
        if(j<=i) {
          k+=1;
        } else {
           k-=1;
        }
        System.out.print(k);
      }
      System.out.println();
      odd+=2;
    }

  }
}

/*
   1
  121
 12321
1234321
*/

public class Triangle2 {
  public static void main(String[] args) {
    int odd = 1;
    int initialSpace = 3;

    for(int i=1; i<=4; i++) {
      int k = 0;
      for(int j=1; j<=initialSpace; j++) {
        System.out.print("*");
      }
      for(int j=1; j<=odd; j++) {
        if(j<=i) {
          k+=1;
        } else {
           k-=1;
        }
        System.out.print(k);
      }
      System.out.println();
      odd+=2;
      initialSpace-=1;
    }

  }
}
