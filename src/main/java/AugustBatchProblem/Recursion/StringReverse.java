package AugustBatchProblem.Recursion;

public class StringReverse {

    public static void main(String[] args) {
        String s =solve("jayesh");
        System.out.println(s);
    }

    private static String solve(String A) {
        if(A.equals("")) {return ""; }
        return solve(A.substring(1)) + A.charAt(0);
    }
}
