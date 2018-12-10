/*
 * make a method that parses given int and
 * add for each and returna single #
 */

public static int parseNadd(int num) {
  // as NOT decrementing the given numbers, need different approach for base case
  // for base case, if single digit given, return it and DONE
  if(num <9) {
    return num;
  } else {
    return num%10 + parseNnum(num/10);
  }
  }