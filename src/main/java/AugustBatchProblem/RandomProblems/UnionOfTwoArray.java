package AugustBatchProblem.RandomProblems;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoArray {

    public static void main(String[] args) {
        int arr1 [] = {4,4};
        int arr2 [] = {1,4,2,3,5,4};




        System.out.println("Intersection of two arrays is : ");
        printIntersection(arr1, arr2);


    }

    static void printIntersection(int arr1[], int arr2[])
    {

        HashSet<Integer> hs = new HashSet<Integer>();

        int count =0;
        if (arr1.length >arr2.length){
            for (int i = 0; i < arr1.length; i++)
                hs.add(arr1[i]);

            for (int i = 0; i < arr2.length; i++){

                if (hs.contains(arr2[i]))
                {
                    count++;
                }}
            System.out.println("total count is " + count);
    }
        else{
            for (int i = 0; i < arr2.length; i++)
                hs.add(arr2[i]);

            for (int i = 0; i < arr1.length; i++){

                if (hs.contains(arr1[i]))
                {
                    count++;
                }}
            System.out.println("total count is " + count);

        }
        ArrayList<Integer>x = new ArrayList<>(hs);
        System.out.println(x);



    }
}
