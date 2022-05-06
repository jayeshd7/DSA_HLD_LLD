package AugustBatchProblem.RandomProblems;

import java.util.ArrayList;

public class Bitwise {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
         int arr[] = {9, 12, 2, 11, 2, 2, 10, 9, 12, 10, 9, 11, 2};
         int n = arr.length;

         int m =5;
        System.out.println(m & (m-1) );

         int x = fun(arr,n);
        System.out.println(x);

    }

    static int fun(int arr[], int n)
    {
        int x = arr[0];
        for (int i = 1; i < n; i++)
            x = x ^ arr[i];
        return x;
    }
}
