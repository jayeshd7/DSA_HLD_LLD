package AugustBatchProblem.Advanced.MathsProblems.Combinator;

import java.util.ArrayList;
import java.util.Arrays;

/*
Q1. Sorted Permutation Rank
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given a string A. Find the rank of the string amongst its permutations sorted lexicographically.
Assume that no characters are repeated.

Note: The answer might not fit in an integer, so return your answer % 1000003



Problem Constraints

1 <= |A| <= 1000


Input Format

First argument is a string A.


Output Format

Return an integer denoting the rank of the given string.


Example Input

Input 1:

A = "acb"

Input 2:

A = "a"



Example Output

Output 1:

2

Output 2:

1
 */
public class SortedPermutationRank {
    public static void main(String[] args) {
        findRank("acb");
    }
    public static int findRank(String A) {
        ArrayList<Integer> list = new ArrayList<>();
        int n=A.length();
        factorial(list,n);
        int ans=0,index=0;
        String s=A;

        char[] c=s.toCharArray();
        Arrays.sort(c);

        int[] checked = new int[n];
        Arrays.fill(checked,1);   //checked 0,0,0,0

        for(int i=0;i<n;i++) {
            if(checked[i]==-1) continue;
            else if(c[i]!=A.charAt(index)) {
                ans+=list.get(n-index-1);
            } else {
                checked[i]=-1;
                index++;
                i=-1;
            }
        }
        return (ans+1)%1000003;



    }

    private static void factorial(ArrayList<Integer> list, int n) {
        list.add(1);
        list.add(1);
        for(int i=2;i<n;i++) {
            list.add((i*list.get(i-1))%1000003);
        }
    }
}
