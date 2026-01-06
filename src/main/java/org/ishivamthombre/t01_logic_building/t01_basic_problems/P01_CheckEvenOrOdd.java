package org.ishivamthombre.t01_logic_building.t01_basic_problems;

public class P01_CheckEvenOrOdd {
  static boolean isEven(int n) {
    return n % 2 == 0;
  }

  public static void main(String[] args) {

    int[] inputs = {0, 1, 2, 7, 10}; // 5 different inputs

    for (int n : inputs) {
      if (isEven(n)) {
        System.out.println(n + " is Even");
      } else {
        System.out.println(n + " is Odd");
      }
    }
  }
}
