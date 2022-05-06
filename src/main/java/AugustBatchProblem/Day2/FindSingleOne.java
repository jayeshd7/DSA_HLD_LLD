package AugustBatchProblem.Day2;
/*
Problem Description

Given an array of integers A, every element appears twice except for one. Find that single one.

NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?


Problem Constraints

    2 <= |A| <= 2000000

    0 <= A[i] <= INTMAX



Input Format

First and only argument of input contains an integer array A.


Output Format

Return a single integer denoting the single element.


Example Input

Input 1:

 A = [1, 2, 2, 3, 1]

Input 2:

 A = [1, 2, 2]



Example Output

Output 1:

 3

Output 2:

 1
 */
import java.util.ArrayList;
import java.util.List;

public class FindSingleOne {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<Integer>();
        al.add(1);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(3);

        singleNumber(al);
    }

    public static int singleNumber(final List<Integer> A) {
        int ans = 0;

        for(int i =0 ; i< A.size();i++){
            ans = ans ^ A.get(i);
        }
        System.out.println("ans :" +ans);
        return ans;

    }
}
