/*
CSC 142
Justin Byun No partner at this time
HW#04 Last updated 10/16
appx. 4hours elapsed
Used IDE: IntelliJ(Eclipse)/VSCode(MS)
*/

public static double fractionSum(int n) {
// initialize the value of sum here
// to convert int to double, just simple used 1.0 instead int 1
// for each iteration, calculated value will be added up to sum and return later
  double sum = 0;

  for(int i = 1; i <=n; i ++) {
      sum += (1.0/i);
  }
  return sum;
}