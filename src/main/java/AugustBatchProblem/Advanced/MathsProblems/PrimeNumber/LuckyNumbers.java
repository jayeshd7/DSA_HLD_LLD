package AugustBatchProblem.Advanced.MathsProblems.PrimeNumber;


/*
A lucky number is a number which has exactly 2 distinct prime divisors.

You are given a number A and you need to determine the count of lucky numbers between the range 1 to A (both inclusive).
 */
public class LuckyNumbers {

    public static void main(String[] args) {
        System.out.println(luckyNumberSolve(12));
    }

    private static int luckyNumberSolve(int A) {
        int[] op = sieve(A);
        int cnt = 0;
        for(int o:op){
            if(o==2){
                cnt++;
            }
        }
        return cnt;

    }

    private static int[] sieve(int n) {
        int ans[] = new int[n + 1];
        ans[0] = 0;
        ans[1] = 1;
        for (int i = 2; i< n+1; i++)
        {
            // If ans[p] is not changed, then it is a
            // ans
            if (ans[i] == 0)
            {

                // Update all multiples of p
                for (int j = i ; j < n+1; j = j+i)
                    ans[j]++;
            }
        }
        return ans;
    }


}
