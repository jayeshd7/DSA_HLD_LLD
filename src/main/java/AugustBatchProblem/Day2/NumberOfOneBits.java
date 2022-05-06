package AugustBatchProblem.Day2;

public class NumberOfOneBits {

    public static void main(String[] args) {
        System.out.println(numSetBits(3));
    }

    private static int numSetBits(int x) {
        int bitCount = 0;

        for (int i = 1; i <= x; i++) {
            bitCount += numSetBitsUntil(i);
        }

        return bitCount % 1000000007;

    }
    static int numSetBitsUntil( int x)
    {
        if (x <= 0)
            return 0;
        return (x % 2 == 0 ? 0 : 1) +
                numSetBitsUntil(x / 2);
    }
}
