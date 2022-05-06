package AugustBatchProblem.Heaps;

import java.util.PriorityQueue;

public class MishaAndCandies {
    public static void main(String[] args) {
        int [] A = {355, 667 };
        int B = 867;
        System.out.println(solveMishaAndCandies(A, B));
    }

    private static int solveMishaAndCandies(int[] A, int B) {
        if(B < 1 || A.length == 0) return 0;

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();


        for(int i = 0; i < A.length; i++) minHeap.add(A[i]);
        int ans = 0;
        while(minHeap.peek()<B) {

            int numChoc = minHeap.poll();
            int remainingCandy = (int) Math.floor(numChoc / 2);
            if(!(minHeap.size() ==0)) {
                int secondLargest = minHeap.peek();
                minHeap.remove();
                int addAgain = secondLargest + remainingCandy;
                minHeap.add(addAgain);
            }
            else {
                minHeap.add(remainingCandy);
            }
            ans++;
        }

        return ans;
    }
}
