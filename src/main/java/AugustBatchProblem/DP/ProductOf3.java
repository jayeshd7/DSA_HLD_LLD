package AugustBatchProblem.DP;

import java.util.Collections;
import java.util.PriorityQueue;

public class ProductOf3 {

    public static void main(String[] args) {
        int [] A = {1,2,3,4,5};
        int [] result = solveProductOf3(A);
        for(int i =0; i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    private static int[] solveProductOf3(int[] A) {
        int n = A.length;

        int [] ans = new int [n];
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i<n;i++){
            pq.add(A[i]);
            if(i<2){
                ans[i] = -1;
            }
            else{
                int a = pq.peek();
                pq.poll();
                int b = pq.peek();
                pq.poll();
                int c = pq.peek();
                pq.poll();

                pq.add(a);
                pq.add(b);
                pq.add(c);
                ans[i]= a*b*c;

            }
        }
        return ans;
    }
}
