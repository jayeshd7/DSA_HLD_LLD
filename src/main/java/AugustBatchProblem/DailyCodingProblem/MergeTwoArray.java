package AugustBatchProblem.DailyCodingProblem;

import java.util.Arrays;

public class MergeTwoArray {


    public static void main(String[] args) {
        int a [] = {5,6,9,8, 7};
        int b [] = {1,3,2,4};
        int n = a.length;
        int m = b.length;

        int c [] = new int[n+m];

        sortTwoArray(a, b, n, m, c);
        System.out.print("Sorted merged list :\n");
        for (int i = 0; i < n + m; i++)
            System.out.print(" " + c[i]);


    }

    private static void sortTwoArray(int[] a, int[] b, int n, int m, int[] c) {

        int i = 0; int j = 0; int k = 0;

        while(i <n){
            c[k] = a[i];
            i++;
            k++;

        }
        while(j <m){
            c[k] = b [j];
            j++;
            k++;
        }
        Arrays.sort(c);
    }


}
