package AugustBatchProblem.MultiDimensionArray;

public class MaxiumSumOfSubArray {

    public static void main(String[] args) {
        int [] A = {2,3,-8,7,-1,2,3};
        //solve(A); //naive approach -o(n^n)
        solve1(A); // efficient solution
    }

    private static void solve1(int[] a) {

        int res = a[0];
        int maxEnding = a[0];
        int n = a.length;
        for(int i =1;i<n;i++){
            maxEnding = Math.max(maxEnding+a[i],a[i]);
            res = Math.max(res, maxEnding);

        }
        System.out.println(res);
    }

    private static int solve(int [] a) {

        int n = a.length;

        int res = a[0];

        for(int i =0;i<n;i++){
            int curr = 0;
            for(int j =i;j<n;j++){
                curr = curr + a[j];
                res = Math.max(curr, res);
            }
        }
        System.out.println(res);
        return res;

    }
}
