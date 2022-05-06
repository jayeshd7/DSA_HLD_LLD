package AugustBatchProblem.MultiDimensionArray;

public class MaximumOnes {

    public static void main(String[] args) {
        int arr[][] = { { 1, 1, 1, 0},
                { 1, 1, 1, 1}};
        solve(arr);

    }
    public static int solve(int[][] A) {

        int R = A.length;
        int C = A[0].length;


        int j,max_row_index = 0;


        j = C - 1;

        int max_so_far = 0;

        for (int i = 0; i < R; i++) {
            int max_one_count = 0;
            // Move left until a 0 is found
            while (j >= 0) {
                if (A[i][j] == 1) {
                     // Update the index of leftmost 1
                    // seen so far
                    max_one_count ++;

                }
                    j = j-1;
            }
            if(max_so_far < max_one_count){
                max_so_far = max_one_count;
                max_row_index = i;
            }
            j = C-1;
        }
        if(max_row_index==0&&A[0][C-1]==0)
            return -1;

        System.out.println(max_row_index);

        return max_row_index;

    }
}
