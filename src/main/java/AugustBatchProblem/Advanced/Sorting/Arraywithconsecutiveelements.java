package AugustBatchProblem.Advanced.Sorting;

/*
Problem Description
Given an array of positive integers A, check and return whether the array elements are consecutive or not.

NOTE: Try this with O(1) extra space.



Problem Constraints

1 <= length of the array <= 100000
1 <= A[i] <= 10^9


Input Format

The only argument given is the integer array A.


Output Format

Return 1 if the array elements are consecutive else return 0.


Example Input

Input 1:

 A = [3, 2, 1, 4, 5]

Input 2:

 A = [1, 3, 2, 5]



Example Output

Output 1:

 1

Output 2:

 0



Example Explanation

Explanation 1:

 As you can see all the elements are consecutive, so we return 1.

Explanation 2:

 Element 4 is missing, so we return 0.
 */
public class Arraywithconsecutiveelements {

    public static void main(String[] args) {
        int [] A = {3, 2, 1, 4, 5};
        System.out.println(solveArraywithconsecutiveelements(A));
    }
    public static int solveArraywithconsecutiveelements(int[] arr) {
        int n = arr.length;
        if(n<1) return 0;
        int min = getMinimum(arr, n);
        int max = getMaximum(arr, n);

        if (max - min  + 1 == n)
        {
            int[] visited=new int[arr.length];
            for (int i = 0; i < n; i++)
            {
                if ( visited[arr[i] - min] != 0 )
                    return 0;

                visited[arr[i] - min] = 1;
            }

            return 1;
        }
        return 0;
    }
    private static int getMinimum(int arr[], int n)
    {
        int min = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] < min)
                min = arr[i];
        return min;
    }

    /* Method return maximum value*/
    private static int getMaximum(int arr[], int n)
    {
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }
}
