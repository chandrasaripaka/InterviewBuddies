package com.ib.numbers;

import java.math.BigInteger;
import java.util.*;

public class FibonacciHuge {
    private static long getFibonacciHugeNaive(long n, long m) {
        if (n <= 1)
            return n;

        long previous = 0;
        long current  = 1;

        for (long i = 0; i < n - 1; ++i) {
            long tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % m;
    }

    private static long getFibonacciHuge(long n, long m) {
        BigInteger b1 = BigInteger.ZERO;
        BigInteger b2 = BigInteger.ONE;
        BigInteger b = BigInteger.ZERO;
        BigInteger longer = BigInteger.ZERO;
        if (n <= 1)
            return n;
        else {
            for (int j = 0; j <= n; j++) {
                b = b1.add(b2);
                b2 = b1;
                b1 = b;
            }
            return b.mod(BigInteger.valueOf(m)).longValue();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(getFibonacciHuge(n, m));
    }
}

