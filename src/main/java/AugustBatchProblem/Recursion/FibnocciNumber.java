package AugustBatchProblem.Recursion;

public class FibnocciNumber {

    public static void main(String[] args) {
        int value = solve(9);
        System.out.println(value);
    }

    private static int solve(int A) {

        if(A < 2){
            return A;
        }

        return solve(A-1)+solve(A-2);



    }
}

