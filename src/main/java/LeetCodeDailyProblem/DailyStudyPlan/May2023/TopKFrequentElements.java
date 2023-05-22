package LeetCodeDailyProblem.DailyStudyPlan.May2023;

import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int [] nums = {1,3,3,4,4,4,5,6};
        int k  = 2;
        int [] ans = topKFrequent(nums, k);
        for (int i =0; i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }

    private static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> counter = new HashMap<>();
        for(int num:nums){
            counter.put(num,counter.getOrDefault(num, 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->counter.get(b)- counter.get(a));
        for(int num: counter.keySet()){
            pq.offer(num);
        }

        int [] result = new int[k];

        for(int i =0; i<k;i++){
            result[i] = pq.poll();
        }

        return result;
    }
}
