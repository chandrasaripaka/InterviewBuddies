import java.math.BigInteger;
import java.util.Scanner;

public class LCMEffi {
  /**
   * LCM = 20 = 2 * 2 * 5
   * LCM =  56 = 2 * 2 * 2 * 7
   * @param a
   * @param b
   * @return
   */
  private static long lcm_efficient(long a, long b) {
    int i=1;
    long a1 = Math.max(a,b);
    long lcm = a1;
    while ( lcm % Math.min(a,b)  > 0) {
      i++;
      lcm = a1*i;
    }
    return lcm;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    System.out.println(lcm_efficient(a, b));
  }
}
