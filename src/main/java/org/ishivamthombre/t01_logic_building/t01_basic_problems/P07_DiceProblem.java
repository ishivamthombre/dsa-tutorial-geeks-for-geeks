package org.ishivamthombre.t01_logic_building.t01_basic_problems;

public class P07_DiceProblem {
  static int oppositeFaceOfDice(int n) {
    if (n == 1)
      return 6;
    if (n == 2)
      return 5;
    if (n == 3)
      return 4;
    if (n == 4)
      return 3;
    if (n == 5)
      return 2;
    if (n == 6)
      return 1;
    return 0;
  }

  public static void main(String[] args) {

    int[] testCases = {1,   // valid - minimum dice face
        2,   // valid
        3,   // valid
        4,   // valid
        5,   // valid
        6,   // valid - maximum dice face
        0,   // invalid - below range
        7,   // invalid - above range
        -1,  // invalid - negative number
        100  // invalid - large number
    };

    for (int n : testCases) {
      int result = oppositeFaceOfDice(n);

      if (result == 0) {
        System.out.println("Input: " + n + " → Invalid dice face");
      } else {
        System.out.println("Input: " + n + " → Opposite face: " + result);
      }
    }
  }
}
