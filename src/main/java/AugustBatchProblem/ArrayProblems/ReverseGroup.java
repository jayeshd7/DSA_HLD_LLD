package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;

public class ReverseGroup {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        int n = al.size();
        int k = 2;

        reverseInGroups1(al,n, k );
        System.out.println(al);
    }
    public  static void reverseInGroups1(ArrayList<Integer> arr, int n, int k) {
        // code here

        for (int i = 0; i < n; i += k) {

            //If (ith index +k) is less than total number of elements it means
            //k elements exist from current index so we reverse k elements
            //starting from current index.
            if(i+k < n){
                //reverse function called to reverse any part of the array.
                reverse(arr,n,i,i+k-1);

            }
            //Else k elements from current index doesn't exist.
            //In that case we just reverse the remaining elements.
            else{
                //reverse function called to reverse any part of the array.
                reverse(arr,n,i,n-1);
            }

        }

    }

    static void reverse(ArrayList<Integer> arr, int n,int left, int right)
    {
        //reversing the sub-array from left index to right index.
        while (left < right) {
            //swapping values at index stored at left and right index.
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);

            //updating values of left and right index.
            left+=1;
            right-=1;
        }
    }

    public static class DuplicatesArray {

        public static void main(String[] args) {
            int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
            int n = arr.length;

            n = removeDuplicates(arr, n);

            // Print updated array
            for (int i=0; i<n; i++)
                System.out.print(arr[i]+" ");
        }



        private static int removeDuplicates(int[] arr, int n) {

            if (n==0 || n==1)
                return n;

            int[] temp = new int[n];

            // Start traversing elements
            int j = 0;
            for (int i=0; i<n-1; i++)
                // If current element is not equal
                // to next element then store that
                // current element
                if (arr[i] != arr[i+1]) //
                    temp[j++] = arr[i];

            // Store the last element as whether
            // it is unique or repeated, it hasn't
            // stored previously
            temp[j++] = arr[n-1];

            // Modify original array
            for (int i=0; i<j; i++)
                arr[i] = temp[i];

            return j;

        }


    }
}


