package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.firstTrack;

public class ClimbingStair {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(climbStairs(n));
    }

    private static int climbStairs(int n) {
        int arr [] = new int[46];
        if(n<=3){
            return n;
        }else{
            arr[1] = 1;
            arr[2] = 2;
            arr[3] = 3;
            for(int i=4;i<=n;i++){
                arr[i] = arr[i-1]+arr[i-2];
            }
            return arr[n];
        }
    }
}
