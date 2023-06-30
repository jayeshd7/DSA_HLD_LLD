package LeetCodeDailyProblem.DailyStudyPlan.Jun23DailyStudy;

public class LastDayWhereYouCanStillCross {

    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        int [][] cells = {{1,1},{2,1},{1,2},{2,2}};
        System.out.println(latestDayToCross(row, col, cells));
    }

    private static int latestDayToCross(int row, int col, int[][] cells) {
        int left = 1;
        int right = cells.length;
        while(left < right){
            int mid = left + (right - left + 1) / 2;
            if(canCross(row, col, cells, mid)){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }

    private static boolean canCross(int row, int col, int[][] cells, int mid) {
        int [][] grid = new int[row][col];
        for(int i = 0; i < mid; i++){
            grid[cells[i][0] - 1][cells[i][1] - 1] = 1;
        }
        boolean [][] visited = new boolean[row][col];
        for(int i = 0; i < col; i++){
            if(grid[0][i] == 0){
                dfsCanCross(grid, 0, i, visited);
            }
        }
        for(int i = 0; i < col; i++){
            if(visited[row - 1][i]){
                return true;
            }
        }
        return false;
    }

    private static void dfsCanCross(int[][] grid, int i, int i1, boolean[][] visited) {
        if(i < 0 || i >= grid.length || i1 < 0 || i1 >= grid[0].length || visited[i][i1] || grid[i][i1] == 1){
            return;
        }
        visited[i][i1] = true;
        dfsCanCross(grid, i - 1, i1, visited);
        dfsCanCross(grid, i + 1, i1, visited);
        dfsCanCross(grid, i, i1 - 1, visited);
        dfsCanCross(grid, i, i1 + 1, visited);
    }
}
