public static void gcd(int x, int y) {
  if(y==0) {
    // base case for the great common demoninator
    return x;
  } else {
    // recursive case
    return gcd(y, x%y); 
  }
}
