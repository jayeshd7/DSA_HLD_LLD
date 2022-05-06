package AugustBatchProblem.Day2;

public class CountsBits {

    public static void main(String[] args) {
        System.out.println(countSetBits(19));
    }
    static long countSetBits(int A) {

        long C = 0;
        for(int i = 30; i >= 0; i--) {
            if((A & (1 << i)) > 0) {
                // bit is set
                long x = i;
                x = x * (1 << (i - 1));
                C += x + 1; // total set bit count up to 2^i
                A -= 1 << i;
                C += A; // extra bits
            }
        }

        return (int)(C);

    }



}
