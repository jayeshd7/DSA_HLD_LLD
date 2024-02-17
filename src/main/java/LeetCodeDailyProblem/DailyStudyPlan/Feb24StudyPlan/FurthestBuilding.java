package LeetCodeDailyProblem.DailyStudyPlan.Feb24StudyPlan;

import java.util.PriorityQueue;

public class FurthestBuilding {

    public static void main(String[] args) {
        int [] heights = {4,2,7,6,9,14,12};
        int bricks = 5 ;
        int ladders = 1 ;

        System.out.println(furthestBuilding(heights,bricks,ladders));
    }

    private static int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        int i =0; int diff = 0;
        for(i =0 ; i<heights.length-1;i++){
            diff = heights[i+1]-heights[i];

            if(diff<=0) continue;
            bricks -= diff;
            pq.offer(diff);

            if(bricks<0){
                bricks += pq.poll();
                ladders--;
            }
            if(ladders <0){
                break;
            }
        }
        return  i;
    }
}
