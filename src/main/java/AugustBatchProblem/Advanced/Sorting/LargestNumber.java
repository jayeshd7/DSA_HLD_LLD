package AugustBatchProblem.Advanced.Sorting;

import java.util.Arrays;
import java.util.Comparator;

/*
Problem Description

Given a array A of non negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.



Problem Constraints

1 <= len(A) <= 100000
0 <= A[i] <= 2*109


Input Format

First argument is an array of integers.


Output Format

Return a string representing the largest number.


Example Input

Input 1:

 A = [3, 30, 34, 5, 9]

Input 2:

 A = [2, 3, 9, 0]



Example Output

Output 1:

 "9534330"

Output 2:

 "9320"
 */
public class LargestNumber {

    public static void main(String[] args) {
        int [] A = {3, 30, 34, 5, 9};
        System.out.println(solveLargestNumber(A));

    }
    static String solveLargestNumber(int [] A){
        int n = A.length;
        String [] arr = new String[n];
        for(int i =0; i<n ;i++){
            arr[i] = String.valueOf(A[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(String s : arr){
            sb.append(s);
        }
        while(sb.charAt(0)=='0'&& sb.length()>1){
            sb.deleteCharAt(0);
        }
        return sb.toString();

    }
}
