package AugustBatchProblem.Revision;

public class NQueen {

    public static void main(String[] args) {
        int board [][] = {{}};
        nQueenSolve(board, 0);
    }

    private static boolean nQueenSolve(int[][] board, int row) {
        int n = board.length;
        int m = board[0].length;
        if(row == n){
            return true;
        }
        for(int col = 0; col<n;col++){
            if(isSafe(board,row,col)){
                board[row][col] =1;
            }
            if(nQueenSolve(board,row+1)) return true;
            board[row][col]=0;
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col) {

        int n = board.length;
        boolean isConflicting = false;

        //check for row conflicts
        for(int i = 0; i < n; i++) {
            if(i == col)
                continue;
            if(board[row][i] == '1') {
                isConflicting = true;
                break;
            }
        }

        if(isConflicting)
            return isConflicting;

        //check for column conflicts
        for(int i = 0; i < n; i++) {
            if(i == row)
                continue;
            if(board[i][col] == '1') {
                isConflicting = true;
                break;
            }
        }

        if(isConflicting)
            return isConflicting;

        return checkDiagonalConflicts(board, row, col);
    }

    private static boolean checkDiagonalConflicts(int[][] board, int row, int col) {

        int n = board.length;

        //LEFT UP Diagonal
        int i = row - 1;
        int j = col - 1;
        while(i >= 0 && j >= 0) {
            if(board[i][j] == '1') {
                return true;
            }
            i--;
            j--;
        }


        //LEFT DOWN Diagonal
        i = row + 1;
        j = col - 1;
        while(i < n && j >= 0) {
            if(board[i][j] == '1') {
                return true;
            }
            i++;
            j--;
        }

        //RIGHT UP Diagonal
        i = row - 1;
        j = col + 1;
        while(i >= 0 && j < n) {
            if(board[i][j] == '1') {
                return true;
            }
            i--;
            j++;
        }

        //RIGHT DOWN Diagonal
        i = row + 1;
        j = col + 1;
        while(i < n && j < n) {
            if(board[i][j] == '1') {
                return true;
            }
            i++;
            j++;
        }

        return false;
    }
}

