package LeetCode.StudyPlan;

public class PivotIndex {
      public static void main(String[] args) {
            int [] arr = {1,7,3,6,5,6};
            System.out.println(pivotIndex(arr));
        }

        private static int pivotIndex(int[] arr) {
            int n = arr.length;
            int [] leftSum = new int[n];
            int [] rightSum = new int[n];
            leftSum[0] = arr[0];
            rightSum[n-1] = arr[n-1];
            for(int i = 1; i<n;i++){
                leftSum[i] = leftSum[i-1]+arr[i];
                rightSum[n-i-1] = rightSum[n-i]+arr[n-i-1];
            }
            for(int i = 0; i<n;i++){
                if(leftSum[i] == rightSum[i]){
                    return i;
                }
            }
            return -1;
        }
    }



