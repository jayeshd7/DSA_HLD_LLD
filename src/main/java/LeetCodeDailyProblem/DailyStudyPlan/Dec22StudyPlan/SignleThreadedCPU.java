package LeetCodeDailyProblem.DailyStudyPlan.Dec22StudyPlan;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SignleThreadedCPU {
    public static void main(String[] args) {
        int[][] tasks = {{1,2},{2,4},{3,2},{4,1}};
        int[] ans = getOrder(tasks);
        for(int i:ans){
            System.out.println(i);
        }
    }

    private static int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int[] ans = new int[n];
        int[][] task = new int[n][3];
        for(int i=0;i<n;i++){
            task[i][0] = tasks[i][0];
            task[i][1] = tasks[i][1];
            task[i][2] = i;
        }
        Arrays.sort(task, (a, b)->a[0]-b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->a[1]-b[1]==0?a[2]-b[2]:a[1]-b[1]);
        int time = 0;
        int j=0;
        for(int i=0;i<n;){

            while(j<n && task[j][0]<=time){
                pq.add(task[j]);  j++;
            }

            if(pq.isEmpty()){
                time=task[j][0];  continue;
            }

            int[] arr=pq.peek();  pq.remove();

            ans[i]=arr[2];
            i++;
            time+=(long)arr[1];
        }
        return ans;
    }
}
