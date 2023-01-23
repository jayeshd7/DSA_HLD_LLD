package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class FindTheTownJudge {
    public static void main(String[] args) {
        int N = 3;
        int[][] trust = {{1,3},{2,3}};
        System.out.println(findJudge(N,trust));
    }

    private static int findJudge(int N, int[][] trust) {
        int[] trustCount = new int[N+1];
        for(int[] t:trust){
            trustCount[t[0]]--;
            trustCount[t[1]]++;
        }
        for(int i = 1;i<=N;i++){
            if(trustCount[i]==N-1) return i;
        }
        return -1;
    }
}
