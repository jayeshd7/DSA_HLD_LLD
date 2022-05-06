package AugustBatchProblem.Advanced.Backtracking;

import java.util.ArrayList;
/*
The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.

Given an integer A, return all distinct solutions to the n-queens puzzle.

Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a queen and an empty space respectively.
The final list should be generated in such a way that the indices of the queens in each list should be in reverse lexicographical order.



Problem Constraints

1 <= A <= 10


Input Format

First argument is an integer n denoting the size of chessboard


Output Format

Return an array consisting of all distinct solutions in which each element is a 2d char array representing a unique solution.


Example Input

Input 1:

A = 4

Input 2:

A = 1



Example Output

Output 1:

[
 [".Q..",  // Solution 1
  "...Q",
  "Q...",
  "..Q."],

 ["..Q.",  // Solution 2
  "Q...",
  "...Q",
  ".Q.."]
]

Output 1:

[
 [Q]
]
 */
public class NQueen {
    static ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();;


    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    public static ArrayList<ArrayList<String>> solveNQueens(int a) {

        boolean queen [][] = new boolean[a][a];


        nqueen(queen ,0, 0 , a, 0);

        return ans;

    }

    public static void nqueen(boolean queen[][], int i, int j,
                       int total, int q){

        if(total==q){

            ArrayList<String> tmp = new ArrayList<String>();
            for(int a = 0; a< queen.length; a++){
                StringBuilder sb = new StringBuilder();
                for(int b = 0; b< queen.length; b++){
                    if(queen[a][b]==true){
                        sb.append("Q");
                    }else
                        sb.append(".");
                }

                tmp.add(sb.toString());
            }
            ans.add(tmp);

            return;

        }
        if(j==queen[0].length){
            i++;
            j=0;
        }
        if(i>= queen.length){

            return;
        }
        if(isItTrue(queen,i,j)){
            //do

            queen[i][j] = true;
            //recurr

            nqueen(queen, i,j+1,total,q+1);
            //undo
            queen[i][j] = false;

        }

        nqueen(queen, i,j+1,total,q);


    }
    public static boolean isItTrue(boolean queen[][], int i , int j  ){

        int r = i-1;

        //vertical
        while(r>=0){
            if(queen[r][j] == true)
                return false;
            r--;
        }
        r = i;
        int c= j-1;
        //horizontal
        while(c >=0){

            if(queen[i][c] == true)
                return false;
            c--;
        }
        //leftDiagonal
        r = i-1;
        c = j-1;
        while(r>=0 && c>=0){

            if(queen[r][c] == true)
                return false;
            r--;
            c--;
        }
        //RightDiagonal
        r = i-1;
        c = j+1;
        while(r>=0 && c<queen[0].length){

            if(queen[r][c] == true)
                return false;
            r--;
            c++;
        }
        return true;

    }

}

