package AugustBatchProblem.Advanced.Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MedianOfArray {

    public static void main(String[] args) {
        ArrayList<Integer>nums1 = new ArrayList<>();
        nums1.add(0);nums1.add(23);
        ArrayList<Integer>nums2 = new ArrayList<>();


        findMedianSortedArrays(nums1,nums2);

    }
    public static double findMedianSortedArrays(final List<Integer> nums1, final List<Integer> nums2) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int j=0; j<nums1.size(); j++) {
            arr.add(j,nums1.get(j));
        }
        for (int k=0; k<nums2.size(); k++) {
            arr.add(nums1.size()+k,nums2.get(k));

        }

        Collections.sort(arr);
        int start = 0;
        int end = arr.size() - 1;
        int mid = start + (end-start)/2;
        if (arr.size()%2==1) {
            return arr.get(mid);
        }
        else {
            return (double) ( arr.get(mid) +  arr.get(mid+1))/2;


        }
    }
}
