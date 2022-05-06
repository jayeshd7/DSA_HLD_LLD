package AugustBatchProblem.RandomProblems;

public class KadaneAlgo {

    public static void main(String[] args) {
        int arr [] = {11, 10, -20, 5, -3, -5, 8, -13, 10};
        int n = arr.length;
        int value = maxCircularSum(arr);
        System.out.println("total max Circular sum  is " + value);
    }

    private static int kadane(int[] arr, int n) {


        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        for(int i =0; i<n ;i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here = 0;
            }
        }

        return max_so_far;

    }

    static int maxCircularSum(int a[])
    {
        int n = a.length;

        // Case 1: get the maximum sum using standard kadane'
        // s algorithm
        int max_kadane = kadane(a, n);

        // Case 2: Now find the maximum sum that includes
        // corner elements.
        int max_wrap = 0;
        for (int i = 0; i < n; i++) {
            max_wrap += a[i]; // Calculate array-sum
            a[i] = -a[i]; // invert the array (change sign)
        }

        // max sum with corner elements will be:
        // array-sum - (-max subarray sum of inverted array)
        max_wrap = max_wrap + kadane(a,n);

        // The maximum circular sum will be maximum of two sums
        return (max_wrap > max_kadane) ? max_wrap : max_kadane;
    }
}
