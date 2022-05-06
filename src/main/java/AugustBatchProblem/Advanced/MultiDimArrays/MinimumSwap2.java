package AugustBatchProblem.Advanced.MultiDimArrays;

public class MinimumSwap2 {

    public static void main(String[] args) {
        int [] A = {1, 2, 3, 4, 0};
        System.out.println(solveMinimumSwap2(A));
    }

    private static int solveMinimumSwap2(int [] a) {

        int n = a.length;
        int [] b = new int[n];
        for(int i = 0; i < n; i++)  {
            b[a[i]] = i;
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            if(a[i] != i) {
                int t = a[i];
                a[i] = i;
                a[b[i]] = t;
                b[t] = b[i];
                b[i] = i;
                ans++;
            }
        }
        return ans;
    }
    }

