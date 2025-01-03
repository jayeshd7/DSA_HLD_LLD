package sdeSheet;

import java.util.Arrays;

public class MergeOverlappingLargeInterval {

    public static void main(String[] args) {

        int[][] interval = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = mergeInterval(interval);
        for (int[] row : ans) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    private static int[][] mergeInterval(int[][] interval) {
        if(interval.length <=1 ) return interval;
        // sort the array
        Arrays.sort(interval, (a, b) -> Integer.compare(a[0], b[0]));

        int index = 0;
        for(int i = 1; i<interval.length;i++){
            if(interval[index][1] >= interval[i][0]){
                interval[index][1] = Math.max(interval[index][1], interval[i][1]);
            } else {
                index++;
                interval[index] = interval[i];
            }
        }
        return Arrays.copyOf(interval, index+1);

    }

}
