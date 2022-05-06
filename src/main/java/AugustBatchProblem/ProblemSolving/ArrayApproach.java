package AugustBatchProblem.ProblemSolving;

public class ArrayApproach {

    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { 1, 7, 3, 4, 9 };
        int Q[][] = { { 1, 2 }, { 2, 4 } };

        int N = arr.length;

        // Function Call
        checkSorted(arr, N, Q);
    }

    static void checkSorted(int[] arr, int N, int[][] Q)
    {

        // Stores count of indices up to i
        // such that arr[i] > arr[i + 1]
        int[] pre = new int[N];

        // Traverse the array
        for (int i = 1; i < N; i++)
        {

            // Update pre[i]
            if((arr[i - 1] > arr[i]))
                pre[i] = pre[i - 1] + 1;
            else
                pre[i] = pre[i - 1];
        }

        // Traverse the array Q[][]
        for (int i = 0; i < Q.length; i++)
        {
            int l = Q[i][0];
            int r = Q[i][1] - 1;

            // If pre[r] - pre[l-1] exceeds 0
            if (pre[r] - pre[l - 1] == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }



}

