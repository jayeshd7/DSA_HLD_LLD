package LeetCodeDailyProblem.DailyStudyPlan.Nov22StudyPlan;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestUsingPQ {
    public static void main(String[] args) {
        int [] arr = {1,5,4,7,6};
        int k = 2;
        System.out.println(kthLargestElement(arr,k));
    }

    private static int kthLargestElement(int[] arr, int k) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<k;i++){
            minheap.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if(arr[i]>minheap.peek()){
                minheap.poll();
                minheap.add(arr[i]);
            }
        }

        return minheap.peek();
    }
}
