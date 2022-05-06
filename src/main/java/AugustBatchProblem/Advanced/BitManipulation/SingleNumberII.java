package AugustBatchProblem.Advanced.BitManipulation;

import java.util.ArrayList;
import java.util.List;

/*
Problem Description

Given an array of integers, every element appears thrice except for one which occurs once.

Find that element which does not appear thrice.

NOTE: Your algorithm should have a linear runtime complexity.

Could you implement it without using extra memory?



Problem Constraints

    2 <= A <= 5*106

    0 <= A <= INTMAX



Input Format

First and only argument of input contains an integer array A.


Output Format

Return a single integer.


Example Input

Input 1:

 A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]

Input 2:

 A = [0, 0, 0, 1]



Example Output

Output 1:

 4

Output 2:

 1
 */
public class SingleNumberII {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(1);A.add(2);A.add(4);A.add(3);A.add(2);A.add(1);
        System.out.println(singleNumberIISolve(A));
    }

    private static int singleNumberIISolve(List<Integer> A) {

        int num = 0;
        int count = 0;
        for(int i=0;i<32;++i) {
            count = 0;
            for(int a : A) {
                if((a & 1 << i) != 0) {
                    count++;
                }
            }
            if(count%3 != 0) {
                num+=1<<i;
            }
        }
        return num;
    }
    // fast one
    /*
     int one=0,two=0;
        for(int i=0;i<A.size();i++){
          one=(one^A.get(i))&(~two);
          two=(two^A.get(i))&(~one);
        }
        return one;
     */
}
