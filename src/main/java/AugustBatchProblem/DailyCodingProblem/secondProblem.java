package AugustBatchProblem.DailyCodingProblem;

import java.util.Arrays;
import java.util.Scanner;

public class secondProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] a = new int[length];
        System.out.println("Enter the elements of the array:");

        for(int i=0; i<length; i++ ) {
            a[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(a));

        System.out.println("enter value of k");
        int k = sc.nextInt();

        //int a [] = {2,3,4,5,6,7,8};
        int count = 0;
        int n = a.length;
        for (int i =0; i< n ;i++){
            int value =a[i]%k;
            if(value % 2 == 0){
                count ++;
            }
        }
        System.out.println(count);
    }

}
