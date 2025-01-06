package sdeSheet;

public class SearchInSorted2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        int target = 12;
        boolean ans = searchMatrix(matrix, target);
        System.out.println("Element found: " + ans);
    }

    private static boolean searchMatrix(int[][] matrix, int target) {

        int n = matrix.length;
        int m = matrix[0].length;
        // brute force approach
//        for(int i = 0; i<n;i++){
//            if(matrix[i][0] <= target && matrix[i][m-1] >= target){
//                for(int j = 0;j<m;j++){
//                    if(matrix[i][j] == target){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] <= target && matrix[i][m - 1] >= target) {
                return binarySearch(matrix, i, target);
            }
        }
        return false;
    }



    private static boolean binarySearch(int[][] matrix, int i, int target) {
        int left = 0;
        int right = matrix[0].length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[i][mid] == target) {
                return true;
            } else if (matrix[i][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
