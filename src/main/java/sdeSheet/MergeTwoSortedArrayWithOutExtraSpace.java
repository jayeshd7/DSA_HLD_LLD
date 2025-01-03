package sdeSheet;

import java.util.Arrays;

public class MergeTwoSortedArrayWithOutExtraSpace {

    public static void main(String[] args) {
        int [] nums1 = {1};
        int [] nums2 = {2};
        int m = 1;
        int n = 0;
        mergedArray(nums1, m, nums2, n);

        System.out.println("The merged arrays are:");
        System.out.print("nums1[] = ");
        for (int i = 0; i <= n; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.print("\nnums2[] = ");
        for (int i = 0; i < m; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }

    private static void mergedArray(int[] nums1, int m, int[] nums2, int n) {

        long[] nums3 = new long[n + m];
        int left = 0;
        int right = 0;
        int index = 0;

        while (left < m && right <n){
            if(nums1[left] <nums2[right]){
                nums3[index] = nums1[left];
                left++;
                index++;
            }else {
                nums3[index] = nums2[right];
                right++;
                index++;

            }
        }
        // if right pointer reached to end
        while(left<m){
            nums3[index] = nums1[left];
            index++;
            left++;

        }

        // if left pointer reached to end

        while(right<n){
            nums3[index] = nums2[right];
            index++;
            right++;
        }

        // fill the value

        for(int i = 0; i<n+m; i++){
            if(i<n) {
                nums1[i] = (int) nums3[i];
            }else {
                nums2[i-n] = (int) nums3[i];
            }

        }
    }







    }

