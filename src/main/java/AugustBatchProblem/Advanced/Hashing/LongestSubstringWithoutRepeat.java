package AugustBatchProblem.Advanced.Hashing;
/*
Problem Description

Given a string A, find the length of the longest substring without repeating characters.

Note: Users are expected to solve in O(N) time complexity.



Problem Constraints

1 <= size(A) <= 106

String consists of lowerCase,upperCase characters and digits are also present in the string A.



Input Format

Single Argument representing string A.


Output Format

Return an integer denoting the maximum possible length of substring without repeating characters.


Example Input

Input 1:

 A = "abcabcbb"

Input 2:

 A = "AaaA"



Example Output

Output 1:

 3

Output 2:

 2



Example Explanation

Explanation 1:

 Substring "abc" is the longest substring without repeating characters in string A.

Explanation 2:

 Substring "Aa" or "aA" is the longest substring without repeating characters in string A.
 */
import java.util.HashMap;

public class LongestSubstringWithoutRepeat {

    public static void main(String[] args) {

        System.out.println(solveLongestSubstringWithoutRepeat("abcabcbb"));
    }

    private static int solveLongestSubstringWithoutRepeat(String A) {

        int n = A.length();

        HashMap<Character, Integer> hm = new HashMap<>();
        int max_value = 0;

        int start = 0;
        for(int end = 0; end<n;end++ ){
            if(hm.containsKey(A.charAt(end))){

                start = Math.max(start, hm.get(A.charAt(end))+1);
            }
            hm.put(A.charAt(end),end);
            max_value = Math.max(max_value, end-start+1);
        }
       return max_value;
    }
}

