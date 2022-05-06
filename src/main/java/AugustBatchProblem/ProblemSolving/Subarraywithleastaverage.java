package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;

public class Subarraywithleastaverage {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);al.add(2);al.add(5);al.add(7);al.add(10);al.add(1);al.add(9);

        // 2 2 5 7 1 1
        int k = 3;
        // 2, 2,5,1,1
        System.out.println(solve1(al,k));

    }

    public static int solve1(ArrayList<Integer> A, int k) {
        int n = A.size();
        if (n < k)
            return -1;


        int res_index = 0;

        int max_value = Integer.MIN_VALUE;
        int min_value_k = 0;
        for (int i = 1; i < k; i++)
        {
            if(A.get(i)<A.get(i-1)){
                min_value_k = A.get(i);
            }
            else{ min_value_k = A.get(i-1);}
        }

        int min_value = min_value_k;

        for (int i = k; i < n; i++)
        {
            if(A.get(i)<A.get(i-k+1)){
                if(min_value < A.get(i)){
                    min_value = A.get(i);
                }

            }
            else{
                min_value = A.get(i-k+1);
            }
            max_value = Math.max(min_value, max_value);
        }
        System.out.println(max_value);
        return res_index;

        //System.out.println("Subarray between [" +
        // res_index + ", " + (res_index + k - 1) +
        // "] has minimum average");
    }


    public static int solve(ArrayList<Integer> A, int k) {
        int n = A.size();
        if (n < k)
            return -1;

        // Initialize beginning index of result
        int res_index = 0;

        // Compute sum of first subarray of size k
        int curr_sum = 0;
        for (int i = 0; i < k; i++)
            curr_sum += A.get(i);

        // Initialize minimum sum as current sum
        int min_sum = curr_sum;

        // Traverse from (k+1)'th element to n'th element
        for (int i = k; i < n; i++)
        {
            // Add current item and remove first
            // item of previous subarray
            curr_sum += A.get(i) - A.get(i-k);

            // Update result if needed
            if (curr_sum < min_sum) {
                min_sum = curr_sum;
                res_index = (i - k + 1);
            }
        }
        return res_index;

        //System.out.println("Subarray between [" +
        // res_index + ", " + (res_index + k - 1) +
        // "] has minimum average");
    }

}
