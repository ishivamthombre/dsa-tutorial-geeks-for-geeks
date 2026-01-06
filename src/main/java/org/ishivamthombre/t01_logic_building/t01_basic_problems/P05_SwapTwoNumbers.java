package org.ishivamthombre.t01_logic_building.t01_basic_problems;

import java.util.ArrayList;
import java.util.List;

public class P05_SwapTwoNumbers {
  static List<Integer> get(int a, int b) {
    List<Integer> twoNumbers = new ArrayList<>();

    a = a + b;
    b = a - b;
    a = a - b;

    twoNumbers.add(a);
    twoNumbers.add(b);

    return twoNumbers;
  }

  public static void main(String[] args) {

    int[][] testCases = {{1, 2},                // normal positive numbers
        {0, 5},                // one zero
        {5, 0},                // other zero
        {-1, -2},              // both negative
        {-5, 10},              // mixed sign
        {10, -5},              // mixed sign reversed
        {7, 7},                // both numbers same
        {Integer.MAX_VALUE, 0},// boundary value (safe)
        {0, Integer.MIN_VALUE},// boundary value (safe)
        {100, 200}             // larger positive numbers
    };

    for (int[] test : testCases) {
      int a = test[0];
      int b = test[1];

      List<Integer> result = get(a, b);

      System.out.println("Before Swap: a = " + a + ", b = " + b + " | After Swap: a = " + result.get(0) + ", b = " + result.get(1));
    }
  }
}
