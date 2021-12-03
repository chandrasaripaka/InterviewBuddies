import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciLastDigitEffi {

    private static long getFibonacciLastDigitEfficient(int n) {
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
        return b.mod(BigInteger.TEN).longValue();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long c1 = getFibonacciLastDigitEfficient(n);
        System.out.println(c1);
    }
}

