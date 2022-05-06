package AugustBatchProblem.Advanced.Searching;

import java.util.ArrayList;

/*
Problem Description

There are two sorted arrays A and B of size N and M respectively.

Find the median of the two sorted arrays ( The median of the array formed by merging both the arrays ).

NOTE:

The overall run time complexity should be O(log (m+n)).
IF the number of elements in the merged array is even, then the median is the average of (n/2)th and (n/2+1)th element. For example, if the array is [1 2 3 4], the median is (2 + 3) / 2.0 = 2.5.



Problem Constraints

1 <= N, M <= 106


Input Format

First argument is an integer array A of size N.
Second argument is an integer array B of size M.


Output Format

Return a decimal value denoting the median of two sorted arrays.


Example Input

Input 1:

 A = [1, 4, 5]
 B = [2, 3]

Input 2:

 A = [1, 2, 3]
 B = [4]



Example Output

Output 1:

 3.0

Output 2:

 2.5



Example Explanation

Explanation 1:

 The median of both the sorted arrays will be 3.0.

Explanation 2:

 The median of both the sorted arrays will be (2+3)/2 = 2.5.
 */
public class MedianArray {

    public static void main(String[] args) {
        ArrayList<Integer>A = new ArrayList<>();
        A.add(1);A.add(4);A.add(5);
        ArrayList<Integer>B = new ArrayList<>();
        B.add(2);B.add(3);
        System.out.println(solveMedianArray(A, B));
    }

    private static double solveMedianArray(ArrayList<Integer>a, ArrayList<Integer>b) {

        if(a.size()>b.size()) return solveMedianArray(b,a);

        int x = a.size();
        int y = b.size();

        int low = 0; int high = x;

        while(low<=high){
            int partitionX = low + (high - low)/2;
            int partitionY = (x+y+1)/2 - partitionX;

            int leftMaxX = (partitionX==0)? Integer.MIN_VALUE: a.get(partitionX-1);
            int leftMaxY = (partitionY==0)? Integer.MIN_VALUE:b.get(partitionY-1);

            int rightMinX = (partitionX==x)? Integer.MAX_VALUE:a.get(partitionX);
            int rightMinY = (partitionY==y)? Integer.MAX_VALUE:b.get(partitionY);

            if((leftMaxX<=rightMinY)&& (leftMaxY<=rightMinX)){
                if((x+y)%2==0){
                    return ((double)Math.max(leftMaxX,leftMaxY)+Math.min(rightMinX, rightMinY))/2;
                }else{
                    return ((double)Math.max(leftMaxX, leftMaxY));
                }
            }else if(leftMaxX>rightMinY) {
                high = partitionX-1;

            }
            else low = partitionX+1;
        }
        return -1;

    }


}
