package com.ib.numbers;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciLastDigitEffi {

    private static long getFibonacciLastDigitEfficient(int n) {
        BigInteger b1 = BigInteger.ZERO;
        BigInteger b2 = BigInteger.ONE;
        BigInteger b = BigInteger.ZERO;
        if (n <= 1)
            return n;
        else {
            for (int j = 2; j <= n; j++) {
                b = b1.add(b2);
                b2 = b1;
                b1 = b;
            }
            return b.mod(BigInteger.TEN).longValue();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long c1 = getFibonacciLastDigitEfficient(n);
        System.out.println(c1);
    }
}

