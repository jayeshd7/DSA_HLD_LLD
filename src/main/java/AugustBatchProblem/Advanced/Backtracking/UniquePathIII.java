package AugustBatchProblem.Advanced.Backtracking;

/*
Problem Description

Given a matrix of integers A of size N x M . There are 4 types of squares in it:

1. 1 represents the starting square.  There is exactly one starting square.
2. 2 represents the ending square.  There is exactly one ending square.
3. 0 represents empty squares we can walk over.
4. -1 represents obstacles that we cannot walk over.

Find and return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.

Note: Rows are numbered from top to bottom and columns are numbered from left to right.



Problem Constraints

2 <= N * M <= 20
-1 <= A[i] <= 2


Input Format

The first argument given is the integer matrix A.


Output Format

Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.


Example Input

Input 1:

A = [   [1, 0, 0, 0]
        [0, 0, 0, 0]
        [0, 0, 2, -1]   ]

Input 2:

A = [   [0, 1]
        [2, 0]    ]



Example Output

Output 1:

2

Output 2:

0
 */
public class UniquePathIII {
    public static void main(String[] args) {
        int [][] A = {{0, 1},
                {2, 0}};
        solveUniquePath(A);
    }
    public static  int solveUniquePath(int[][] grid) {

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1)
                    return find(grid, i, j);
            }
        }
        return 0;
    }

    public static int find(int[][] grid, int i, int j) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == -1)
            return 0;
        if(grid[i][j] == 2) {
            if(isValid(grid))
                return 1;
            else
                return 0;
        }

        int ans = 0;
        grid[i][j] = -1;
        ans += find(grid, i + 1, j);
        ans += find(grid, i - 1, j);
        ans += find(grid, i, j + 1);
        ans += find(grid, i, j - 1);
        grid[i][j] = 0;
        return ans;
    }

    public static boolean isValid(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
}
