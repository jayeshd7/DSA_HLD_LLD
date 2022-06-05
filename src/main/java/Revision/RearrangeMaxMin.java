package Revision;

import java.util.Arrays;

public class RearrangeMaxMin {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int size = arr.length;
        maxMinArr(arr, size);
        printArray(arr, size);
    }

    private static void printArray(int [] arr , int size) {
        for (int a:arr) {
            System.out.println(a);

        }
    }

    private static void maxMinArr(int[] arr, int size) {
        int [] aux = Arrays.copyOf(arr,size);
        int start = 0;
        int end = size-1;
        for(int i = 0; i<size-1;i++){
            if(i % 2 ==0){
                arr[i] = aux[end];
                end -=1;
            }else {
                arr[i] = aux[start];
                start +=1;
            }
        }
    }
}

/*
time - o(n)
space - o(n)
 */
