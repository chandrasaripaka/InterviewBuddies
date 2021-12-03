import java.util.Scanner;

public class GCDEffi {

    /**
     * ]923889,301755
     * 301755,18624
     * 18624,3771
     * 3771,3540
     * 3540,231
     * 231,75
     * 75,6
     * 6,3
     * 3,0
     * @param a
     * @param b
     * @return
     */
    private static int gcd_efficient(int a, int b) {
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
