package AugustBatchProblem.ArrayProblems;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int sizeOfArray = a.length;
        revereArray(a,sizeOfArray);



    }

    private static void revereArray(int a[], int n) {

        int low = 0;
        int high = n-1;

        while(low <high){
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        System.out.println(Arrays.toString(a));
    }
}
