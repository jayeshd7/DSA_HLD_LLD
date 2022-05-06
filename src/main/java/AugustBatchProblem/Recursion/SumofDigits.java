package AugustBatchProblem.Recursion;

public class SumofDigits {

    public static void main(String[] args) {
        int value  = solve(42);
        System.out.println(value);
    }

    private static int solve(int A) {

        return  A == 0 ? 0 : A%10 + solve(A/10) ;
    }
}
