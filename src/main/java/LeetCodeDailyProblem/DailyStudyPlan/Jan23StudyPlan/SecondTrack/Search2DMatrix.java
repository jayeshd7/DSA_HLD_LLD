package LeetCodeDailyProblem.DailyStudyPlan.Jan23StudyPlan.SecondTrack;

public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,3));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row*col-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int midVal = matrix[mid/col][mid%col];
            if(midVal==target)return true;
            else if(midVal<target)start=mid+1;
            else end=mid-1;
        }
        return false;
    }
}
