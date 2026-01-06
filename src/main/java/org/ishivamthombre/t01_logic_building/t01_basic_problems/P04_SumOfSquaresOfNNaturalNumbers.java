package org.ishivamthombre.t01_logic_building.t01_basic_problems;

public class P04_SumOfSquaresOfNNaturalNumbers {
  // Function to calculate the sum of squares of first 'number' natural numbers
  public int sumOfSquares(int number) {
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      sum += (i * i);
    }
    return sum;
  }

  public static void main(String[] args) {

    P04_SumOfSquaresOfNNaturalNumbers obj = new P04_SumOfSquaresOfNNaturalNumbers();

    int[] testCases = {1,    // smallest natural number
        2,    // small value
        5,    // normal case
        10,   // common input
        25,   // medium input
        50,   // larger input
        0,    // boundary case (no natural numbers)
        -1,   // negative input
        -10,  // larger negative input
        100   // stress test (still safe for int)
    };

    for (int n : testCases) {
      System.out.println("Input n = " + n + " → Sum of Squares = " + obj.sumOfSquares(n));
    }
  }
}
