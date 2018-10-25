/*
CSC 142
Justin Byun No partner at this time
HW#04 Last updated 10/16
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
*/

// pretty much similar case but instead adding up to sum,
// here, you need to use multiplication
// and return the final value for proper reporting

public static int pow(int a, int b) {
  int result = 1;
  for(int i = 1; i <= b; i ++) {
      result *= a;
  }
  return result;
}
}