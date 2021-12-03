public class SumOfTwo {

    public static void main(String [] args) throws Exception {
        if (args.length !=2 ) {
            throw new Exception("Exactly 2 inputs needed");
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c  = a + b;
        System.out.println(c);
    }
}
