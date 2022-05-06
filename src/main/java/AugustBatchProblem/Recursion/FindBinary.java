package AugustBatchProblem.Recursion;

public class FindBinary {

    public static void main(String[] args) {
        String ans = solve(233,"");
        System.out.println(ans);
    }

    private static String solve(int decimal, String result) {
        if(decimal == 0) return result;

        result = decimal % 2 +result;
        return solve(decimal/2, result);
    }
}
