package AugustBatchProblem.Day1;

import java.util.Arrays;

public class sortArray {

    public static void main(String[] args) {
        int arr1 [] = {0,1,0,0,0,2,3};
        Integer arr2 [] = {0,1,0,2,3,0,1};
        int length = arr1.length;


        /*Arrays.sort(arr1);
        System.out.println("sorting Asc"+ Arrays.toString(arr1));

        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("sorting desc" +  Arrays.toString(arr2));*/


        //using counting sort
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                int tmp = 0;
                if (arr1[i] > arr1[j]) {
                    tmp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));



        // counting sort
        int low = 0;
        int mid = 0;
        int high = arr1.length-1;

        int temp;
        while (mid <= high){
            switch (arr1[mid]){
                case 0: {
                    temp = arr1[low];
                    arr1[low] = arr1[mid];
                    arr1[mid]= temp;
                    low ++;
                    mid ++;
                    break;

                }
                case 1: {
                    mid ++;
                    break;
                }
                case 2: {
                    temp = arr1[mid];
                    arr1[mid] = arr1[high];
                    arr1[high] = temp;
                    high--;
                    break;

                }


            }


        }
        System.out.println(Arrays.toString(arr1));
    }
}
