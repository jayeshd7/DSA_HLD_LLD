package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

import java.util.PriorityQueue;

public class TotalCostHireKWorkers {

    public static void main(String[] args) {

        int [] costs = {17,12,10,2,7,2,11,20,8};
        int k = 3;
        int candidate = 8;
        System.out.println(totalCostHireKWorkers(costs, k, candidate));

    }

    private static long totalCostHireKWorkers(int[] costs, int k, int candidate) {

        int n = costs.length;
        int i = 0;
        int j = n-1;
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        long ans = 0;

        while(k-->0){
            while(pq1.size()< candidate && i<=j ){
                pq1.offer(costs[i++]);
            }
            while(pq2.size()< candidate && i<=j ){
                pq2.offer(costs[j--]);
            }

            int t1 = pq1.size() >0 ? pq1.peek() : Integer.MAX_VALUE;
            int t2 = pq2.size() >0 ? pq2.peek() : Integer.MAX_VALUE;

            if(t1<t2){
                ans+=t1;
                pq1.poll();
        }else {
                ans+=t2;
                pq2.poll();
            }
        }
        return ans;
        }

}
