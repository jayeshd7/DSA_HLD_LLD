package Revision;

import java.util.Collections;
import java.util.PriorityQueue;

public class KsmallestProduct {
    public static void main(String[] args) {
        int arr [] = {8,7,6,5,7,5,2,1};
        System.out.println(ksmallestProductSolve(arr, 3));
        System.out.println(ksmallestProductSolveViaMaxHeap(arr, 3));


    }

    private static int ksmallestProductSolveViaMaxHeap(int[] arr, int k) {
        int size = arr.length-1;
        int i = 0;
        int product = 1;
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(i=size;i>=0;i--){
            pq.add(arr[i]);
        }
        i = 0;
        while(i<size & i<k){
           // pq.removeAt
            i -=1;

        }
        return product;
    }

    private static int ksmallestProductSolve(int[] arr, int k) {
        int size = arr.length;
        int i = 0;
        int product = 1;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(i=0;i<size;i++){
            pq.add(arr[i]);
        }
        i = 0;
        while(i<size && i<k){
            product *= pq.remove();
            i +=1;

        }
        return product;
    }
}
