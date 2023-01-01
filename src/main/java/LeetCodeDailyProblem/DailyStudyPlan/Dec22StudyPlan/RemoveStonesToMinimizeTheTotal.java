package LeetCodeDailyProblem.DailyStudyPlan.Dec22StudyPlan;

import java.util.Collections;
import java.util.PriorityQueue;

public class RemoveStonesToMinimizeTheTotal {
    public static void main(String[] args) {
        int[] piles = {5, 4, 9};
        int k = 2;
        System.out.println(minStoneSum(piles, k));
    }

    private static int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int pile : piles) {
            pq.add(pile);
        }
        while(!pq.isEmpty() && k-->0){
            int x=pq.poll();
            int a=x-(int)Math.floor(x/2);// divide the element and add again to queue
            pq.add(a);
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();//sum the total answer
        }
        return sum;
    }
}
