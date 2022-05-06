package AugustBatchProblem.Advanced.MathsProblems.ModularArithmetic;

import java.util.ArrayList;

public class PairDivisibleByM {
    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(1);A.add(2);A.add(3);A.add(4);A.add(5);
        int B =2;
        System.out.println(solve(A,B));
    }

    private static int solve(ArrayList<Integer> A, int B) {
        long n = A.size();
        long freq [] = new long[B];

        // count the  occurrences of all remainders
        for(int i =0;i<n;i++){
            freq[A.get(i) % B]++;
        }

        int sum = (int) (freq[0] * (freq[0] - 1) / 2);

        if (B % 2 == 0)
            sum += (int) (freq[B / 2] * (freq[B / 2] - 1) / 2);

        for (int i = 1; i <= B / 2 && i != (B - i); i++) {
            sum += (int) freq[i] * freq[B - i];
        }
        return sum;
    }
}
