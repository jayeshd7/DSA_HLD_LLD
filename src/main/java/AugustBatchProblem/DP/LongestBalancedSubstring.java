package AugustBatchProblem.DP;

import java.util.Stack;

public class LongestBalancedSubstring {

    public static void main(String[] args) {
        System.out.println(solveLBT("([[]]()}["));
    }

    private static int solveLBT(String s) {
        /*int n = str.length();
       int [] dp = new int [n+1];

        dp[0]=1;
       for(int i =1; i<=n;i++){
          if(i -dp[i-1]-1>= 0 && str.charAt(i-dp[i-1]-1) == '('){
              dp[i]= dp[i-1]+2+((i-dp[i-1]-2)>=0 ?dp[i-dp[i-1]-2]:0);
          }
       }
       return dp[n];*/


        int[] dp = new int[s.length()+1];
        int currentMax = 0;
        for(int i = 1; i<s.length();i++){
            int j = i -dp[i]-1;
            //int k = i -dp[i]-2;
            if((s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') && j>=0
                    && ((s.charAt(j) == '(' && s.charAt(i) == ')') ||
                    (s.charAt(j) == '[' && s.charAt(i) == ']') ||
                    (s.charAt(j) == '{' && s.charAt(i) == '}'))){
                dp[i+1] = dp[i] + dp[j] +2;
                currentMax = Math.max(currentMax,dp[i+1]);
            }
        }
        return currentMax;
    }
}

