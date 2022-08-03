package AugustBatchProblem.Day1;

public class MoveZeros {
    public static void main(String[] args) {
        int nums []= {0,1,0,3,12};
        int endIndex = 0;
        for(int i = 0; i< nums.length; i++) {
            if(nums[i] != 0) {
                nums[endIndex] = nums[i];
                if(endIndex != i) nums[i] = 0;

                endIndex++;
            }
        }
        for(int i =0; i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
