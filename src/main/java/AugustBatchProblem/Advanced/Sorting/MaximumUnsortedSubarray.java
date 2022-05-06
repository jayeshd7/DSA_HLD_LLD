package AugustBatchProblem.Advanced.Sorting;
/*
Problem Description

Given an array A of non-negative integers of size N. Find the minimum sub-array Al, Al+1 ,…, Ar such that if we sort(in ascending order) that sub-array, then the whole array should get sorted. If A is already sorted, output -1.


Problem Constraints

1 <= N <= 1000000
1 <= A[i] <= 1000000


Input Format

First and only argument is an array of non-negative integers of size N.


Output Format

Return an array of length 2 where First element denotes the starting index(0-based) and second element denotes the ending index(0-based) of the sub-array. If the array is already sorted, return an array containing only one element i.e. -1.


Example Input

Input 1:

A = [1, 3, 2, 4, 5]

Input 2:

A = [1, 2, 3, 4, 5]



Example Output

Output 1:

[1, 2]

Output 2:

[-1]
 */
public class MaximumUnsortedSubarray {

    public static void main(String[] args) {
        int [] A = {1,3,2,4,5};
        int [] ans = subUnsort(A);
       for(int i =0; i<ans.length;i++){
           System.out.print(ans[i] + " ");
       }

    }
    public static int[] subUnsort(int[] A) {
        int start=-1;
        int n=A.length;
        int max=0;

        for(int i=1; i<n; i++){
            //max=Math.max(max,A[i]);
            if(A[i]<A[i-1]){
                start=i-1;
                break;
            }
        }
        if(start==-1)return new int[]{-1};

        int min=Integer.MAX_VALUE;
        for(int i=start; i<n; i++){
            min=Math.min(min,A[i]);
        }
        for(int i=0; i<start; i++){
            if(A[i]>min){
                start=i;
                break;
            }
        }
        int end=start+1;

        for(int i=n-2; i>start; i--){
            if(A[i]>A[i+1]){// || A[i+1]<max){
                end=i+1;
                break;
            }
        }

        for(int i=end; i>=start; i--){
            max=Math.max(max,A[i]);
        }
        for(int i=n-1; i>end; i--){
            if(A[i]<max){
                end=i;
                break;
            }
        }


        return new int[]{start,end};
    }
}
