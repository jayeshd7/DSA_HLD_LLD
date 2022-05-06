package AugustBatchProblem.ArrayProblems;

import java.util.Scanner;

public class RotationGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int [] a = new int[length];


        for(int i=0; i<length; i++ ) {
            a[i] = sc.nextInt();
            System.out.print(a[i] + " ");
        }
        System.out.println("right :");
        int rightRotation = sc.nextInt();

        rightRotate(a, rightRotation, length);

        printArray(a, length);
    }

    private static void printArray(int[] arr, int n) {
        {
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
    }

    private static void rightRotate(int[] arr, int d, int n) {

            // if arr is rotated n times then
            // you get the same array
            while (d > n) {
                d = d - n;
            }

            // create temp array of size d
            int temp[] = new int[n - d];

            // copy first N-D element in array temp
            for (int i = 0; i < n - d; i++)
                temp[i] = arr[i];

            // move the rest element to index
            // zero to D
            for (int i = n - d; i < n; i++) {
                arr[i - n + d] = arr[i];
            }

            // copy the temp array element
            // in origninal array
            for (int i = 0; i < n - d; i++) {
                arr[i + d] = temp[i];
            }


    }





}
