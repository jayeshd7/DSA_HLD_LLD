package LeetCode;

import java.util.PriorityQueue;

public class NropesWithMinimumCost {

    public static void main(String[] args) {
        int [] arr = {1,3,4,6,7};
        System.out.println(nRopesWithMinCost(arr));
    }

    private static int nRopesWithMinCost(int[] arr) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i =0; i<arr.length;i++){
            minheap.add(arr[i]);

        }
        int ans = 0;
        while(minheap.size()>1){
            int first =  minheap.poll();
            int second = minheap.poll();
            int sum = first+second;
            ans += sum;
            minheap.add(ans);

        }

        return ans;
    }
}
