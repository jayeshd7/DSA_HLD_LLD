package AugustBatchProblem.StringProblems;

public class RotateString {
    public static void main(String[] args) {
        String ans = solve("academy", 14);
        System.out.println(ans);
        //scaler
        //erscal - expected
    }

    private static String solve(String str, int d) {
        int k = d % str.length();

        return str.substring(str.length()-k) + str.substring(0, str.length()-k);
    }





}
