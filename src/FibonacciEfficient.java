import java.util.Scanner;

public class FibonacciEfficient {

    private static long calc_fib(int n) {
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
        int n = in.nextInt();
        System.out.println(calc_fib(n));
    }
}