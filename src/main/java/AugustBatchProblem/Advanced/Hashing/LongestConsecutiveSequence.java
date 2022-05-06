package AugustBatchProblem.Advanced.Hashing;

import java.util.HashMap;
/*
Problem Description

Given an unsorted integer array A of size N.

Find the length of the longest set of consecutive elements from the array A.



Problem Constraints

1 <= N <= 106

-106 <= A[i] <= 106



Input Format

First argument is an integer array A of size N.


Output Format

Return an integer denoting the length of the longest set of consecutive elements from the array A.


Example Input

Input 1:

A = [100, 4, 200, 1, 3, 2]

Input 2:

A = [2, 1]



Example Output

Output 1:

 4

Output 2:

 2



Example Explanation

Explanation 1:

 The set of consecutive elements will be [1, 2, 3, 4].

Explanation 2:

 The set of consecutive elements will be [1, 2].

 */
public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int [] A = {100, 4, 200, 1, 3, 2};
        System.out.println(solveLongestCosecutiveSequence(A));
    }

    private static int solveLongestCosecutiveSequence(int [] nums) {

        HashMap<Integer, Boolean> hm = new HashMap<>();

        for(int i: nums){
            hm.put(i, true);
        }

        for(int i : nums){

            if(!hm.containsKey(i-1)){
                hm.put(i, true);
            }
        }

        int longest_subsequence = 0;

        for(int i: nums){
            int sequence = 0;
            if(hm.get(i)){
                while(hm.containsKey(i++)){
                    sequence++;
                }
            }
            longest_subsequence = Math.max(sequence, longest_subsequence);
        }
        return longest_subsequence;
    }
}
