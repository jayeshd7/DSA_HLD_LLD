package AugustBatchProblem.Revision;

public class isPalindromeUsingRecursion {

    public static void main(String[] args) {
        String s = "abacaba";
        int l = 0;
        int r = s.length()-1;
        System.out.println(isPalindromeUsingRecursionSolve(s,l,r));
    }

    private static Boolean isPalindromeUsingRecursionSolve(String s, int l, int r) {

        if(l>=r) return true;
        if(s.charAt(l) != s.charAt(r)) return false;
        return isPalindromeUsingRecursionSolve(s,l+1,r-1);

    }
}
