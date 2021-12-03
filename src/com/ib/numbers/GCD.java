package com.ib.numbers;

import java.util.*;

public class GCD {

    private static int gcd_naive(int a, int b) {
        int current_gcd = 1;
        for (int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }

    private static int gcd_efficient(int a, int b) {
        //int current_gcd = 1;
        int max_num = 1;
        int gcd = 1;
        if ( b != 0)
            gcd = a % b;
        else
            return a;
        max_num = b;
        return gcd_efficient(max_num, gcd);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(gcd_efficient(a, b));
    }
}
