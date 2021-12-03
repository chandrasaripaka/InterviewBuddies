public class ArrayUtility {

    public int duplicate(int numbers[]) {
        int length = numbers.length;
        int sum1 = 0;
        for (int i = 0; i < length; ++i) {
            if (numbers[i] < 0 || numbers[i] > length - 2)
                throw new IllegalArgumentException("Invalid numbers.");
            sum1 += numbers[i];
        }
        int sum2 = ((length - 1) * (length - 2)) >> 1;
        return sum1 - sum2;
    }
}
