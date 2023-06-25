package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

public class CountAllPossibleRoutes {
    public static void main(String[] args) {
        int[] locations = {2,3,6,8,4};
        int start = 1;
        int finish = 3;
        int fuel = 5;
        System.out.println(countAllPossibleRoutes(locations, start, finish, fuel));
    }

    private static int countAllPossibleRoutes(int[] locations, int start, int finish, int fuel) {
        int n = locations.length;
        int mod = (int)1e9+7;
        int [][] dp = new int[n][fuel+1];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=fuel;j++){
                dp[i][j] = -1;
            }
        }
        return dfsCount(locations, start, finish, fuel, dp, mod);
    }

    private static int dfsCount(int[] locations, int start, int finish, int fuel, int[][] dp, int mod) {
        if(dp[start][fuel]!=-1) return dp[start][fuel];
        int n = locations.length;
        int ans = 0;
        if(start == finish) ans++;
        for(int i = 0;i<n;i++){
            if(i!=start){
                int cost = Math.abs(locations[i]-locations[start]);
                if(fuel>=cost){
                    ans = (ans+dfsCount(locations, i, finish, fuel-cost, dp, mod))%mod;
                }
            }
        }
        return dp[start][fuel] = ans;
    }
}
