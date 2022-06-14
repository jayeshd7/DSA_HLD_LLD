package Revision;

public class MaxiumContSubArraySum {
    public static void main(String[] args) {
        int [] arr = {1, 2, -3, 4, 5, -10, 6, 7};
        int size = arr.length;
        System.out.println(solveMaxiumContSubArraySum(arr,size));
    }

    private static int solveMaxiumContSubArraySum(int[] arr, int size) {
        int currMax = 0;
        int maxium = 0;

        for(int i = 0; i<size;i++){
            currMax = Math.max(arr[i], currMax+arr[i]);
            if(currMax <0){
                currMax = 0;
            }
            if(maxium <currMax){
                maxium = currMax;
            }
        }
        return maxium;
    }
}
