package AugustBatchProblem.MultiDimensionArray;

public class LongestConsequativeOnes {

    public static void main(String[] args) {


        int [] A1 = {0,0,1,1,1,0,1,1,1,1};
        solve1(A1);

    }

    private static int solve1(int [] a) {

        int n = a.length;

        int res = 0;
        int curr = 0;

        for(int i =0;i<n;i++){
            if(a[i]==0){
                curr = 0;
            }
            else{
                curr++;
                res = Math.max(res, curr);
            }
        }
        System.out.println(res);
        return res;
    }

    public static int solve(String s) {
        int n = s.length();
        int cnt_one = 0;

        int max_cnt = 0, temp=0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1')
            {
                cnt_one++;
                temp++;
            }
            else
            {
                max_cnt = Math.max(max_cnt, temp);
                temp = 0;
            }
        }
        max_cnt = Math.max(max_cnt, temp);

        // To store cumulative 1's
        int []left = new int[n];
        int right[]= new int[n];

        if (s.charAt(0) == '1')
            left[0] = 1;
        else
            left[0] = 0;

        if (s.charAt(n - 1) == '1')
            right[n - 1] = 1;
        else
            right[n - 1] = 0;

        // Counting cumulative 1's from left
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '1')
                left[i] = left[i - 1] + 1;

                // If 0 then start new cumulative
                // one from that i
            else
                left[i] = 0;
        }

        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '1')
                right[i] = right[i + 1] + 1;

            else
                right[i] = 0;
        }


        for (int i = 1; i < n - 1; i++) {
            // perform step 3 of the approach
            if (s.charAt(i) == '0') {

                // step 3
                int sum = left[i - 1] + right[i + 1];

                if (sum < cnt_one)
                    max_cnt = Math.max(max_cnt, sum+1);

                else
                    max_cnt = Math.max(max_cnt, sum);
            }
        }
        System.out.println(max_cnt);
        return max_cnt;
    }
}
