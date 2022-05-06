package AugustBatchProblem.ProblemSolving;

public class LeetCode {

    public static void main(String[] args) {
        String s = "codeleet";
        int [] a = {4,5,6,7,0,2,1,3};

        System.out.println(solve(s,a));

    }

    private static String solve(String s, int[] a) {

        char[] charArr = new char[a.length];

        for(int i=0; i< a.length; i++){

            charArr[a[i]] = s.charAt(i);

        }

        return String.valueOf(charArr);
    }
}
