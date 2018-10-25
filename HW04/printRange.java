/*
CSC 142
Justin Byun No partner at this time
HW#04 Last updated 10/16
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
*/

// Here instead returning single value,
// we will be using print function directly
// if-else statement divide up the conditions and report accordingly

public static void printRange(int a, int b) {
  if (a < b) {
      for(int i = a; i <= b; i ++) {
          System.out.print(i + " ");
      }
  } else if (a > b) {
      for(int j = a; j >=b; j --) {
          System.out.print(j + " ");
      }
  } else {
      System.out.println(a);
  }
}