package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }

    private static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        for (int stone : stones) {
            pq.add(stone);
        }
        while (pq.size() > 1) {
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            if (stone1 != stone2) {
                pq.add(stone1 - stone2);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
