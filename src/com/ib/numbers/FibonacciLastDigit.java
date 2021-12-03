package com.ib.numbers;

import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }

    private static long getFibonacciLastDigitEfficient(int n) {
        if (n <= 1)
            return n;
        else {
            long[] arr = new long[n+1];
            arr[0] = 0;
            arr[1] = 1;
            for (int j = 2; j <= n; j++) {
                arr[j] = arr[j - 1] + arr[j - 2] ;
            }
            return arr[n]%10;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int n = scanner.nextInt();
        for (int i= 0; i<=60; i++) {
            long startTime = System.nanoTime();
            long c1 = getFibonacciLastDigitEfficient(i);
            System.out.println(c1);
            long endTime = System.nanoTime();
            long startTime1 = System.nanoTime();
            int c = getFibonacciLastDigitNaive(i);
            System.out.println(c);
            long endTime1 = System.nanoTime();
            System.out.println(i + "," + (endTime - startTime) + "," + (endTime1 - startTime1));
        }
    }
}

