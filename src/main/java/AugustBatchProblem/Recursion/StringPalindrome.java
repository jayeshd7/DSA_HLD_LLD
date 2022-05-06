package AugustBatchProblem.Recursion;

public class StringPalindrome {

    public static void main(String[] args) {
        int value = solve("jayesh");
        System.out.println(value);
    }


    public static int solve(String str) {
        int n = str.length();
        if (n == 0)
            return 1;

        return isPalRec(str, 0, n - 1);
    }
    public static int isPalRec(String str,
                               int s, int e)
    {
        if (s == e)
            return 1;

        if ((str.charAt(s)) != (str.charAt(e)))
            return 0;

        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return 1;
    }
}
