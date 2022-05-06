package AugustBatchProblem.Advanced.BitManipulation;

import java.util.ArrayList;
/*
Problem Description

Given an array of numbers A , in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.

Note: Output array must be sorted.



Problem Constraints

2 <= |A| <= 100000
1 <= A[i] <= 109


Input Format

First argument is an array of interger of size N.


Output Format

Return an array of two integers that appear only once.


Example Input

Input 1:

A = [1, 2, 3, 1, 2, 4]

Input 2:

A = [1, 2]



Example Output

Output 1:

[3, 4]

Output 2:

[1, 2]

 */
public class SingleNumberIII {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);A.add(2);A.add(3);A.add(1);A.add(2);A.add(4);
        System.out.println(singleNumberIIISolve(A));
    }

    private static ArrayList<Integer> singleNumberIIISolve(ArrayList<Integer>A) {
        int xor = 0 , res1 =0,  res2 = 0;
        ArrayList<Integer> res = new ArrayList();

        for(int i =0 ; i< A.size();i++){
            xor = xor ^ A.get(i);
        }
        int sn = xor & ~(xor -1); // find Right most set bit { awesome concept}

        for(int i = 0; i< A.size();i++){
            if((A.get(i) & sn) != 0){
                res1 = res1 ^ A.get(i);

            }else{
                res2 = res2 ^ A.get(i);
            }
        }
        if(res1<res2){ res.add(res1);res.add(res2);}
        else { res.add(res2);res.add(res1);}
        return res;
    }
}
