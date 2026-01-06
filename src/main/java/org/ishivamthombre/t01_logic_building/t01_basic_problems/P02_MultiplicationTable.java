package org.ishivamthombre.t01_logic_building.t01_basic_problems;

import java.util.ArrayList;

public class P02_MultiplicationTable {
  static ArrayList<Integer> getTable(int n) {
    ArrayList<Integer> table = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
      table.add(n * i);
    }
    return table;
  }

  public static void main(String[] args) {

    int[] inputs = {2, 5, 7, 10, 12}; // 5 different inputs

    for (int n : inputs) {
      System.out.println("Multiplication Table of " + n + ":");

      ArrayList<Integer> table = getTable(n);
      for (int value : table) {
        System.out.print(value + " ");
      }

      System.out.println("\n----------------------");
    }
  }
}
