package org.ishivamthombre.t01_logic_building.t01_basic_problems;

public class P08_SeriesAP {
  public static int nthTermOfAP(int a1, int a2, int n) {
    int gap = a2 - a1;
    int nthTerm = a1;
    for (int i = 2; i <= n; i++) {
      nthTerm += gap;
    }
    return nthTerm;
  }

  public static void main(String[] args) {

    int[][] testCases = {{1, 3, 5},      // positive AP, positive gap
        {2, 4, 1},      // n = 1 (first term)
        {5, 5, 10},     // zero gap (constant series)
        {10, 7, 4},     // negative gap
        {-5, -3, 6},    // negative numbers, positive gap
        {-2, -5, 3},    // negative numbers, negative gap
        {0, 0, 7},      // all zeros
        {1, 2, 0},      // invalid n (0)
        {1, 2, -3},     // invalid n (negative)
        {100, 200, 50}  // large n, large values
    };

    for (int[] test : testCases) {
      int a1 = test[0];
      int a2 = test[1];
      int n = test[2];

      int result = nthTermOfAP(a1, a2, n);

      System.out.println("a1 = " + a1 + ", a2 = " + a2 + ", n = " + n + " → nth Term = " + result);
    }
  }
}
