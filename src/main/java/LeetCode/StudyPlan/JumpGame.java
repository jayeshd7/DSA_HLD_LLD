package LeetCode.StudyPlan;

public class JumpGame {
    public static void main(String[] args) {
        int [] arr = {3,2,1,0,4};
        System.out.println(canJump(arr));
    }

    private static boolean canJump(int[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i = 0; i<n;i++){
            if(i>max){
                return false;
            }
            max = Math.max(max,i+arr[i]);
        }
        return true;
    }
}
