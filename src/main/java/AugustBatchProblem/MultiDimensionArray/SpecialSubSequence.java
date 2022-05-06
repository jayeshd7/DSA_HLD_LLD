package AugustBatchProblem.MultiDimensionArray;

public class SpecialSubSequence {
    public static void main(String[] args) {
        String A = "GGGTGANAGGJGAG";
        solve(A);
    }

    private static int solve(String A) {
    int count = 0;
    int g_count = 0;
    int n = A.length();
    for(int i =n-1;i>=0;i--) {
        if (A.charAt(i) == 'G') {
            g_count++;
        }

        if(A.charAt(i) == 'A'){
            count = count + g_count;
        }
    }
        System.out.println(count);
    return count;
    }
}
