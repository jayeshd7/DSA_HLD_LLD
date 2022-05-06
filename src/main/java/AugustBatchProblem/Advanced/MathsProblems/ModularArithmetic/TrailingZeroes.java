package AugustBatchProblem.Advanced.MathsProblems.ModularArithmetic;

public class TrailingZeroes {

    public static void main(String[] args) {
        System.out.println(trailingZeroesSolve(100));
    }

    private static int trailingZeroesSolve(int A) {

        int count = 0;
        for(int i = 5;i<=A; i*=5){
            count += A/i;
        }
        return count;
    }
}
