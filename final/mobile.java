/*
We have mobile phones numbered 1,2,3...
even numbered mobiles have 2 speakers, while odd ones have single
Send the number of mobile to a function and return total # of  speakers of all mobiles
*/


public static int mobileSpeakers(int mobile) {
  // double(2x) base case
  if(mobile ==0) {
    return 0;
  } else {
    if(mobile%2==0) {
      return 2 + mobileSpeakers(mobile -1);
    } else {
      return 1 + mobileSpeakers(mobile -1);
    }
  }
  // define general case
  }