import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

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

    /**
     *  [[1,1][1,0]]
     *  f(n) = Floor(phi^n / sqrt(5) + 1/2)
     *  phi = (1 + sqrt(5)) / 2
     *
     * @param n
     * @param m
     * @return
     */
    private static long FibonaciiHuge1(long n , long m) {
        double invSqrt5 = 0.44721359549995793928183473374626;
        double phi = 1.6180339887498948482045868343656;
        long fib = (long) (Math.floor((Math.pow(phi, n) * invSqrt5) + 0.5));
        return fib%m;
    }

    private static long getFibonacciHuge(long n, long m) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        if (n <= 1)
            return n;
        for (int j=2 ; j<=n ; j++)
        {
            c =  a.add(b);
            a = b;
            b = c;
        }
        return b.mod(BigInteger.valueOf(m)).longValue();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long m = scanner.nextLong();
        System.out.println(FibonaciiHuge1(n, m));
    }
}

