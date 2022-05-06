package AugustBatchProblem.Recursion;



public class SumTillNumber {

    public static void main(String[] args) {
        int ans = solve(10);
        System.out.println(ans);
    }

    private static int solve(int number) {
        if(number <= 1 ) return number;

        return number + solve(number-1);

    }
}
