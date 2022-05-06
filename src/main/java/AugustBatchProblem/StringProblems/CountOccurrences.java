package AugustBatchProblem.StringProblems;


public class CountOccurrences {

    public static void main(String[] args) {
        int ans =solve("bobob");
        System.out.println(ans);
    }

    public static int solve(String str) {
        int N = str.length();
        String findStr = "bob";
        int M = findStr.length();

        int res = 0;

        /* A loop to slide pat[] one by one */
        for (int i = 0; i <= N - M; i++) {
            /* For current index i, check for
        pattern match */
            int j;
            for (j = 0; j < M; j++) {
                if (str.charAt(i + j) != findStr.charAt(j)) {
                    break;
                }
            }

            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            if (j == M) {
                res++;
                j = 0;
            }
        }
        return res;
    }

}
