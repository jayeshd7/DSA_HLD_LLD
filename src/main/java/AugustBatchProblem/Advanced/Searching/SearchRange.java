package AugustBatchProblem.Advanced.Searching;
/*
Given a sorted array of integers A(0 based index) of size N, find the starting and ending position of a given integar B in array A.

Your algorithm's runtime complexity must be in the order of O(log n).

Return an array of size 2, such that first element = starting position of B in A and second element = ending position of B in A, if B is not found in A return [-1, -1].



Problem Constraints

1 <= N <= 106

1 <= A[i], B <= 109



Input Format

The first argument given is the integer array A.
The second argument given is the integer B.



Output Format

Return an array of size 2, such that first element = starting position of B in A and second element = ending position of B in A, if B is not found in A return [-1, -1].



Example Input

Input 1:

 A = [5, 7, 7, 8, 8, 10]
 B = 8

Input 2:

 A = [5, 17, 100, 111]
 B = 3
 */
public class SearchRange {

    public static void main(String[] args) {
        int [] A = {5, 7, 7, 8, 8, 10};
        int B = 8;
        int [] ans = seachRangeSolve(A, B);
        for(int j = 0; j<ans.length;j++) {
            System.out.println(ans[j]);
        }
    }

    private static int [] seachRangeSolve(int[] A, int B) {

        int res[]=new int[2];

        int low=0,high=A.length-1;

        int find=0;

        //First checking wheather number is present or not.
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(A[mid]==B)
            {
                find=1;
                break;
            }
            else if(A[mid]<B)
                low=mid+1;
            else if(A[mid]>B)
                high=mid-1;
        }

        if(find==0)
        {
            res[0]=-1;
            res[1]=-1;
            return res;
        }

        //Finding first occurrence of number(search only in the left half of array if element is found).
        low=0;high=A.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(A[mid]==B)
                high=mid-1;
            else if(A[mid]<B)
                low=mid+1;
            else if(A[mid]>B)
                high=mid-1;
        }
        res[0]=low;

        //Finding last occurrence of number(search only in the right half of array if element is found.)
        low=0;high=A.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(A[mid]==B)
                low=mid+1;
            else if(A[mid]<B)
                low=mid+1;
            else if(A[mid]>B)
                high=mid-1;
        }
        res[1]=high;

        return res;
    }
}
