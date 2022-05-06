package AugustBatchProblem.DP;
/*
Problem Description

A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26

Given an encoded message denoted by string A containing digits, determine the total number of ways to decode it modulo 109 + 7.



Problem Constraints

1 <= length(A) <= 105



Input Format

The first and the only argument is a string A.



Output Format

Return an integer, representing the number of ways to decode the string modulo 109 + 7.



Example Input

Input 1:

 A = "12"

Input 2:

 A = "8"



Example Output

Output 1:

 2

Output 2:

 1



Example Explanation

Explanation 1:

 Given encoded message "8", it could be decoded as only "H" (8).
 The number of ways decoding "8" is 1.

Explanation 2:

 Given encoded message "12", it could be decoded as "AB" (1, 2) or "L" (12).
 The number of ways decoding "12" is 2.
 */
public class WaysToDecode {
    public int numDecodings(String A) {
        int n = A.length();
        int[] dp = new int[n+1];
        return decode(A, n, dp);
    }


    int decode(String A, int n,int[] dp)
    {
        if(n == 0)
            return 1;

        if(dp[n] != 0)
            return dp[n];

        int num = 0;
        for(int i=0; i<2 && i<n; i++)
        {
            num = num*10 + (A.charAt(i)-'0');
            if(num < 10 && i == 1)
                break;
            else if(num == 0)
                continue;
            else if(num <= 26 && num > 0)
                dp[n] = (dp[n] + decode(A.substring(i+1, n), n-1-i, dp))%1000000007;
        }

        return dp[n];
    }
}
