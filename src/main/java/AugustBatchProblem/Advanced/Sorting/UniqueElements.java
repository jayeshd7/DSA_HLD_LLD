package AugustBatchProblem.Advanced.Sorting;

import java.util.Arrays;
/*
Problem Description

You are given an array A of N elements. You have to make all elements unique, to do so in one step you can increase any number by one.

Find the minimum number of steps.



Problem Constraints

1 <= N <= 105
1 <= A[i] <= 109


Input Format

The only argument given is an Array A, having N integers.


Output Format

Return the Minimum number of steps required to make all elements unique.


Example Input

Input 1:

 A = [1, 1, 3]

Input 2:

 A = [2, 4, 5]



Example Output

Output 1:

 1

Output 2:

 0
 */
public class UniqueElements {

    public static void main(String[] args) {
        int [] A = {1,1,3};
        System.out.println(uniqueElement(A));
    }

    private static int uniqueElement(int [] A) {
        int n = A.length;
        int ans = 0;
        Arrays.sort(A);
        int tillMaximum = A[0];

        for(int i =1; i<n;i++){
            if(A[i] <=tillMaximum){
                ans += (tillMaximum - A[i]+1);
                tillMaximum++;
            }
            else {tillMaximum = A[i];}
        }
       return ans;
    }
}
