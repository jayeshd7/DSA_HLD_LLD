package AugustBatchProblem.Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

    public static void main(String[] args) {
        int [] A = {1,2,5,4,3};
        solveRunningMedian(A);
    }

    private static int[] solveRunningMedian(int[] A) {
        PriorityQueue<Integer> min_heap=new PriorityQueue<Integer>();
        PriorityQueue<Integer> max_heap=new PriorityQueue<Integer>(Collections.reverseOrder());
        int n=A.length;
        int[] ans=new int[n];
        int index=0;
        for(int ref:A){
            if(max_heap.isEmpty() || max_heap.peek()>ref){
                max_heap.add(ref);
            }
            else{
                min_heap.add(ref);
            }
            //check for difference in sizes
            if(max_heap.size()>min_heap.size()+1){
                min_heap.add(max_heap.peek());
                max_heap.poll();
            }
            else if(min_heap.size()>max_heap.size()+1){
                max_heap.add(min_heap.peek());
                min_heap.poll();
            }

            //fill the answers
            if(min_heap.size()>max_heap.size()){
                ans[index++]=min_heap.peek();
            }
            else if(max_heap.size()>min_heap.size()){
                ans[index++]=max_heap.peek();
            }
            else{
                ans[index++]=max_heap.peek();
            }
        }
        return ans;
    }
}
