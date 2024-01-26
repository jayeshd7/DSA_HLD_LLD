package LeetCodeDailyProblem.DailyStudyPlan.Jan24StudyPlan;

public class OutOfBoundryPath {
    static Integer[][][] memo;
    static int m,n;
    static  int [] dirs = new int []{0,1,0,-1,0};
    static int mod = 1000000007;
    public static void main(String[] args) {
        int m = 2;
        int n = 2;
        int maxMove = 2;
        int startRow = 0;
        int startColumn = 0;
        System.out.println(findPaths(m, n, maxMove, startRow, startColumn));
    }

    private static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {

        memo = new Integer[m][n][maxMove+1];

        return helper(maxMove, startRow, startColumn);
    }
    private static int helper(int moves, int i, int j){
        if(i<0 || j<0 || i==m || j==n) return 1; //Reached outside
        if(moves == 0) return 0;
        if(memo[i][j][moves] != null) return memo[i][j][moves];
        int paths = 0;
        for(int l=0; l<4; l++){
            paths = (paths + helper(moves-1, i-dirs[l], j-dirs[l+1])) % mod;
        }
        return memo[i][j][moves] = paths;
    }


}
