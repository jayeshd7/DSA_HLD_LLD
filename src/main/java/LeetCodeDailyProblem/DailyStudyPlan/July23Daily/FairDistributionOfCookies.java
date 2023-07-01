package LeetCodeDailyProblem.DailyStudyPlan.July23Daily;

public class FairDistributionOfCookies {
    static int ans ;
    static int count [];

    public static void main(String[] args) {
        int [] cookies = {8,15,10,20,8};
        int k = 2;
        System.out.println(fairDistributionOfCookies(cookies, k));
    }

    private static int fairDistributionOfCookies(int[] cookies, int k) {
        int n = cookies.length;
        ans = Integer.MAX_VALUE;
        count = new int[k];
        backtrackFairDistribution(0,cookies,k);


        return ans;
    }

    private static void backtrackFairDistribution(int cookieNumber, int[] cookies, int k) {
        if(cookieNumber == cookies.length){
            int max = 0;
            for(int i = 0; i < k; i++){
                max = Math.max(max, count[i]);

            }
            ans = Math.min(ans, max);
            return;
        }
        for(int i = 0; i < k; i++){
            count[i] += cookies[cookieNumber];
            backtrackFairDistribution(cookieNumber + 1, cookies, k);
            count[i] -= cookies[cookieNumber];
            if(count[i] == 0){
                break;
            }
        }


    }
}
