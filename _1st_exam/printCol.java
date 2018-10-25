/*
1...2...3...4...5...6...
*/

public static void printCol(int max, int spacer) {
  for (int i = 1; i <= max; i ++) {
      System.out.print(i);
      for (int j = 1; j <=spacer; j++) {
        System.out.print(".");
      }
      // System.out.println();
  }
}
