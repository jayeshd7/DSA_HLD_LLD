package AugustBatchProblem.Advanced.Recursion;

import java.util.HashSet;

/*
Problem Description

Given an array of integers A, the array is squareful if for every pair of adjacent elements, their sum is a perfect square.

Find and return the number of permutations of A that are squareful. Two permutations A1 and A2 differ if and only if there is some index i such that A1[i] != A2[i].



Problem Constraints

1 <= length of the array <= 12

1 <= A[i] <= 109



Input Format

The only argument given is the integer array A.


Output Format

Return the number of permutations of A that are squareful.


Example Input

Input 1:

 A = [2, 2, 2]

Input 2:

 A = [1, 17, 8]



Example Output

Output 1:

 1

Output 2:

 2



Example Explanation

Explanation 1:

 Only permutation is [2, 2, 2], the sum of adjacent element is 4 and 4 and both are perfect square.

Explanation 2:

 Permutation are [1, 8, 17] and [17, 8, 1].
 */
public class NumberofSquarefulArrays {
    private static int count;

    public static void main(String[] args) {
        int []A = {2,2,2};
        System.out.println(solve(A));
    }
    public static int solve(int[] A) {
        count = 0;
        int length = A.length;
        if(length < 2) return count;

        permute(A, length, 0);
        return count;
    }
    // The idea is to fix the position (0, 1, 2, ....n-1) and then permute the remaining elements on the right
    private static void permute(int[] A, int length, int fixedIndex) {
        if(fixedIndex == length)  {
            count++;
        }

        // We create a hashset to avoid placing the same number on the same position again.
        HashSet<Integer> visited = new  HashSet<>();
        for(int i = fixedIndex; i < length; i++) {
            if(!visited.contains(A[i]) && (i == fixedIndex || A[i] != A[fixedIndex])) {
                swap(A, fixedIndex, i);

                if(fixedIndex == 0 || isSquareful(A[fixedIndex], A[fixedIndex-1])) {
                    permute(A, length, fixedIndex + 1);
                }

                // backtrack
                swap(A, fixedIndex, i);

                visited.add(A[i]);
            }
        }

    }

    private static void swap(int A[], int index1, int index2) {
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    private static boolean isSquareful(int currentElement, int adjacentElement)
    {
        int sum = currentElement + adjacentElement;
        double sqrt = Math.sqrt(sum);

        return ((sqrt - (int)sqrt) != 0) ? false : true;

    }

}
