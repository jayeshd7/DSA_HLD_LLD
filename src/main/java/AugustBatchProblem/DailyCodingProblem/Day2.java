package AugustBatchProblem.DailyCodingProblem;


public class Day2 {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int length = a.length;
        findSquare(a, length);
    }

    private static void findSquare(int [] arr, int n) {

        if (n == 1) {
            System.out.print("0");
            return;
        }

        int i, temp = 1;


        int prod[] = new int[n];

        for (int j = 0; j < n; j++)
            prod[j] = 1;
           // prod = {1,1,1,1,1};
        // 1st loop -
        /*
        temp = 1
        1 st loop - [1,1,1,1,1}
        temp = 1
        2nd loop - [1,1,1,1,1]
        temp = 2
        3rd loop - [1,2,6,24,120]
         */

        /* In this loop, temp variable contains product of
           elements on left side excluding arr[i] */
        for (i = 0; i < n; i++) {
            prod[i] = temp;
            temp *= arr[i];
        }

        /* Initialize temp to 1 for product on right side */
        temp = 1;

        /* In this loop, temp variable contains product of
           elements on right side excluding arr[i] */
        for (i = n - 1; i >= 0; i--) {
            prod[i] *= temp;
            temp *= arr[i];
        }

        for (i = 0; i < n; i++)
            System.out.print(prod[i] + " ");

        return;
    }
}
