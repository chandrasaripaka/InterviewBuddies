package com.ib.numbers;

import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(int n) {
    if (n <= 1)
      return n;

    return calc_fib(n - 1) + calc_fib(n - 2);
  }

  private static long calc_fibe(int n) {
    if (n <= 1)
      return n;
    else {
      long[] arr = new long[n+1];
      arr[0] = 0;
      arr[1] = 1;
      for (int j = 2; j <= n; j++) {
        arr[j] = arr[j - 1] + arr[j - 2];
      }
      return arr[n];
    }
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    //int n = in.nextInt();
    for (int i= 0; i<=10; i++) {
      long startTime1 = System.nanoTime();
      System.out.println(calc_fibe(i));
      long endTime1 = System.nanoTime();
      long startTime = System.nanoTime();
      System.out.println(calc_fib(i));
      long endTime = System.nanoTime();
      System.out.println(i+","+String.valueOf(endTime - startTime)+","+String.valueOf(endTime1 - startTime1));
    }
  }
}
