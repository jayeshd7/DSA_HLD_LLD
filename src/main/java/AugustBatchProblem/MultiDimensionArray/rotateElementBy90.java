package AugustBatchProblem.MultiDimensionArray;

public class rotateElementBy90 {


    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };


        solve(arr);
    }
    public static void solve(int[][] a) {
        int N = a.length;


        for (int i = 0; i < N / 2; i++)
        {
            for (int j = i; j < N - i - 1; j++)
            {

                // Swap elements of each cycle
                // in clockwise direction
                int temp = a[i][j];
                a[i][j] = a[N - 1 - j][i];
                a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
                a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
                a[j][N - 1 - i] = temp;
            }
        }


    }
}
