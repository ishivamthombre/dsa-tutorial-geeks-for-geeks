package org.ishivamthombre.t01_logic_building.t01_basic_problems;

public class P06_ClosestNumber {
  static int closestNumber(int n, int m) {
    int closest = 0;
    int minDiff = Integer.MAX_VALUE;

    for (int i = n - Math.abs(m); i <= n + Math.abs(m); ++i) {
      if (i % m == 0) {
        int diff = Math.abs(n - i);

        if (diff < minDiff || (diff == minDiff && Math.abs(i) > Math.abs(closest))) {
          closest = i;
          minDiff = diff;
        }
      }
    }
    return closest;
  }

  public static void main(String[] args) {

    int[][] testCases = {{13, 4},     // normal case, positive n & m
        {15, 5},     // exact multiple
        {17, 6},     // two closest values, choose larger absolute
        {-15, 6},    // negative n, tie case (-12, -18 → -18)
        {0, 7},      // n is zero
        {5, 1},      // m = 1 (always divisible)
        {-5, 2},     // negative n, positive m
        {5, -2},     // negative m
        {-10, -5},   // both negative
        {100, 30}    // larger numbers
    };

    for (int[] test : testCases) {
      int n = test[0];
      int m = test[1];

      int result = closestNumber(n, m);

      System.out.println("n = " + n + ", m = " + m + " → Closest Number = " + result);
    }
  }
}
