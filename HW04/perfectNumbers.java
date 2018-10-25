/*
CSC 142
Justin Byun No partner at this time
HW#04 Last updated 10/16
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
*/

// By definition, the sum of the factors should be equal to max, given number
// from the starting 0, if you add up all the factors it will be the max not including itself
//

public static int perfectNumbers(int max) {
  int sum =0;
  for(int i=0; i < max; i ++) {
      if(max%i == 0) {
          sum += i;
      }
  }
  return sum;
}