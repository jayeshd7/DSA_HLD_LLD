package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {2,5};
        int[][] res = insert(intervals,newInterval);
        for(int[] arr : res){
            for(int i : arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res = new ArrayList<>();
        int i = 0;

        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            res.add(intervals[i++]);
        }
        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
       res.add(newInterval);
        while(i < intervals.length){
            res.add(intervals[i++]);
        }

        return res.toArray(new int[res.size()][]);
    }
}
