package AugustBatchProblem.Advanced.MathsProblems.PrimeNumber;

import java.util.HashMap;

/*
Groot has an array A of size N. Boring right? Groot thought so too, so he decided to construct another array B of the same size and defined elements of B as:

B[i] = factorial of A[i] for every i such that 1<= i <= N.

factorial of a number X denotes (1 x 2 x 3 x 4......(X-1) x (X)).

Now Groot is interested in the total number of non-empty subsequences of array B such that every element in the subsequence has the same non empty set of prime factors.

Since the number can be very large, return it modulo 109 + 7.

NOTE: A set is a data structure having only distinct elements. Eg : the set of prime factors of Y=12 will be {2,3} and not {2,2,3}
 */
public class FactorialArray {

    public static void main(String[] args) {
        int [] A = {2, 3, 4, 5, 6};
        System.out.println(factorialArraySolve(A));
    }

    private static int factorialArraySolve(int [] A) {

        final int mod = (int) (10e9+7);
        int max = A[0];
        for(int a :A){
            max = Math.max(a, max);
        }
        int [] mpf =findPrimeNumberBysieve(max);

        HashMap<Integer, Integer>hm = new HashMap<>();

        for(int a :A){
            if(a == 1) continue;
            hm.put(mpf[a], hm.getOrDefault(mpf[a],0)+1);
        }
        long ans = 0;
        for(Integer i :hm.keySet()){
            int m = hm.get(i);
            if(i == 0) continue;
            if(m == 1) ans = ans + 1;
            else ans = (ans %mod + (int)((Math.pow(2L,m)%mod)-1));
        }


        return (int) (ans % mod);
    }

    private static int[] findPrimeNumberBysieve(int n) {
        int ans[] = new int[n + 1];
         ans[0] = 0;
         ans[1] = 1;
        for (int i = 2; i<= n; i++)
        {
            // If ans[p] is not changed, then it is a
            // ans
            if (ans[i] == 0)
            {
                ans[i] = i;
                // Update all multiples of p
                for (int j = i + i; j <= n; j = j+i)
                    ans[j] = -1;
            }
        }
        int prev = ans[0];
        for(int i = 1;i<n+1;i++){
            if(ans[i] == -1){
                ans[i] = prev;
            }
            prev = ans[i];
        }
        return ans;
    }
}
