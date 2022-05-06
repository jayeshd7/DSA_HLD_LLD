package AugustBatchProblem.Advanced.Sorting;

/*
Inversion count in an array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA & get it resolved
Get help from TA

Problem Description

Given an array of integers A. If i < j and A[i] > A[j] then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).



Problem Constraints

1 <= length of the array <= 100000

1 <= A[i] <= 10^9



Input Format

The only argument given is the integer array A.



Output Format

Return the number of inversions of A modulo (109 + 7).



Example Input

Input 1:

A = [3, 2, 1]

Input 2:

A = [1, 2, 3]



Example Output

Output 1:

3

Output 2:

0



 */
public class InversionCountInArray {

    private  static final long mod = 1000000007;
    public static void main(String[] args) {
        int [] A = {3,2,1};
        System.out.println(inversionCountSolve(A));
    }

    private static int inversionCountSolve(int [] A) {
        int n = A.length;
        long ans = mergeSort(A, 0, n - 1);
        return (int) (ans % mod);
    }
    private static int merge(int arr[], int left, int mid, int right) {
        int i = left, j = mid, k = 0;
        int invCount = 0;
        int temp[] = new int[(right - left + 1)];

        while ((i < mid) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                ++k;
                ++i;
            }
            else {
                temp[k] = arr[j];
                invCount += (mid - i);
                ++k;
                ++j;
            }
        }

        while (i < mid) {
            temp[k] = arr[i];
            ++k;
            ++i;
        }

        while (j <= right) {
            temp[k] = arr[j];
            ++k;
            ++j;
        }

        for (i = left, k = 0; i <= right; i++, k++) {
            arr[i] = temp[k];
        }

        return invCount;
    }
    private static long mergeSort(int arr[], int left, int right) {
        long invCount = 0;

        if (right > left) {
            int mid = (left + (right-left) / 2);

            invCount = mergeSort(arr, left, mid);
            invCount += mergeSort(arr, mid + 1, right);
            invCount += merge(arr, left, mid + 1, right);
        }
        return invCount;
    }
}
