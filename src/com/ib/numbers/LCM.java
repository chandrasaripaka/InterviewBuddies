package com.ib.numbers;

import java.util.*;

public class LCM {

  private static long lcm_naive(int a, int b) {
    for (long l = 1; l <= (long) a * b; ++l)
      if (l % a == 0 && l % b == 0)
        return l;

    return (long) a * b;
  }

  /**
   * LCM = 20 = 2 * 2 * 5
   * LCM =  56 = 2 * 2 * 2 * 7
   * @param a
   * @param b
   * @return
   */
  private static long lcm_efficient(long a, long b) {
    int i=1;
    long lcm = Math.max(a,b);
    while ( lcm % Math.min(a,b)  > 0) {
         i++;
         lcm = b*i;
    }
    return lcm;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in) ;
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    long mills = System.currentTimeMillis();
    //System.out.println(lcm_naive(a, b));
    long mills1 = System.currentTimeMillis()-mills;
    mills = System.currentTimeMillis();
    System.out.println(lcm_efficient(a, b));
    long mills2 = System.currentTimeMillis() - mills;
    System.out.println("Diff "+(mills1-mills2));

  }
}
