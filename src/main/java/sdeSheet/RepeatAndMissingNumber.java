package sdeSheet;

public class RepeatAndMissingNumber {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] ans = findRepeatAndMissingNumber(nums);
        int[] ans1 = findRepeatAndMissingNumberUsingHashing(nums);
        System.out.println("Repeat and Missing number: ");
        for (int ele : ans) {
            System.out.print(ele + " ");
        }

        System.out.println("Repeat and Missing Number via Hashing");
        for(int ele: ans1){
            System.out.print(ele + " ");
        }
    }

    private static int[] findRepeatAndMissingNumberUsingHashing(int[] nums) {

        int n = nums.length;
        int [] hash = new int[n+1];
        for(int i = 0; i<n;i++){
            hash[nums[i]]++;
        }
        System.out.println("Hash array: ");
        for(int ele: hash){
            System.out.print(ele + " ");
        }

        int repeating = -1; int missing = -1;
        for(int i = 0; i<=n;i++){
            if(hash[i] == 2){
                repeating = i;
            } else if(hash[i] == 0){
                missing = i;
            }
            if(repeating != -1 && missing != -1){
                break;
            }

        }

        int [] ans = {repeating, missing};
        return ans;
    }

    private static int[] findRepeatAndMissingNumber(int[] nums) {
        // brute force
        int n = nums.length;

        int repeating = -1; int missing = -1;


        for (int i = 0; i<=n;i++) {

            int cnt = 0;

            for (int j = 0; j < n; j++) {

                if (nums[j] == i) {
                    cnt++;
                }

            }
            if (cnt == 2) {
                repeating = i;
            } else if (cnt == 0) {
                missing = i;
            }
            if (repeating != -1 && missing != -1) {
                break;
            }
        }
            int[] ans = {repeating, missing};


            return ans;

    }




}
