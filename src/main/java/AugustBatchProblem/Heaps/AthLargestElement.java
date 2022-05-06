package AugustBatchProblem.Heaps;

import java.util.PriorityQueue;

public class AthLargestElement {
    public static void main(String[] args) {
        int A = 4;
        int [] B = {1 ,2, 3, 4, 5, 6};
        
        solveAthLargestElement(B, A);
        
    }

    private static int [] solveAthLargestElement(int [] B, int A) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        int n=B.length;
        int[] ans=new int[n];
        int index=0;
        for(int ref:B){
            if(pq.size()<A){
                pq.add(ref);
            }

            else{
                if(ref>pq.peek()){
                    pq.poll();
                    pq.add(ref);
                }
            }
            if(pq.size()>=A){
                ans[index++]=pq.peek();
            }
            else{
                ans[index++]=-1;
            }
        }
        return ans;
    }
}
