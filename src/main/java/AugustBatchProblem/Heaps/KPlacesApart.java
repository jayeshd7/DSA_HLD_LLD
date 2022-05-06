package AugustBatchProblem.Heaps;

import java.util.PriorityQueue;

public class KPlacesApart {

    public static void main(String[] args) {
        int [] A = {1,40,2,3};
        int B = 2;
        solveKPlaceApart(A, B);
    }

    private static int[] solveKPlaceApart(int [] A, int B) {
        int n = A.length;
        int [] ans = new int[n];
        PriorityQueue<Integer> pq =new PriorityQueue<>();
        for(int i=0;i<B+1;i++){
            pq.add(A[i]);
        }
        int index=0;
        for(int i=B+1;i<n;i++){
            ans[index++]=pq.poll();
            pq.add(A[i]);
        }
        while(!pq.isEmpty()){
            ans[index++]=pq.poll();
        }
        return ans;


    }

}
