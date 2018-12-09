/*
 * make a method that parses given int and
 * find a specific # and return the occurence
 */

public static int parseNadd2(int num) {
  // base case
  // counting 5
  if(num <= 9) {
    if(num == 5) {
      return 1;
    } else {
      return 0;
    }
  } else {
    if(num % 10 == 5) {
      return 1 + parseNadd2(num/10);
    } else {
      return 0 + parseNadd2(num/10);
    }
  }
}