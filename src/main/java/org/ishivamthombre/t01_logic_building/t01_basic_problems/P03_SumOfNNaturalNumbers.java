package org.ishivamthombre.t01_logic_building.t01_basic_problems;

public class P03_SumOfNNaturalNumbers {
  public static int findSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  public static void main(String[] args) {

    int[] testCases = {1,    // smallest valid natural number
        2,    // small value
        5,    // normal case
        10,   // typical input
        50,   // medium input
        100,  // large input
        0,    // boundary case (no natural numbers)
        -1,   // negative input
        -10,  // larger negative input
        Integer.MAX_VALUE / 1000 // large but safe value (avoids overflow)
    };

    for (int n : testCases) {
      System.out.println("Input n = " + n + " → Sum = " + findSum(n));
    }
  }
}
