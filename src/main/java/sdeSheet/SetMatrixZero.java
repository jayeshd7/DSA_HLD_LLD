package sdeSheet;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZero {


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

        int n = matrix.size();
        int m = matrix.get(0).size();


        ArrayList<ArrayList<Integer>> ans = setZeroes(matrix, n, m);
        System.out.println("Matrix after setting zeroes: ");

        for(ArrayList<Integer> row: ans) {
            for(int ele: row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }




    }

    private static ArrayList<ArrayList<Integer>> setZeroes(ArrayList<ArrayList<Integer>> matrix, int n, int m) {

        int col0 = 1;
        // step -1 Traverse the matrix and set the 1st row
        for(int i =0;i<n;i++){
            for (int j = 0; j < m; j++) {
                if(matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0);
                    if(j !=0) matrix.get(0).set(j, 0);
                    else col0 = 0;
                }
            }
        }
        // step - 2 mark with 0 from 1st row and 1st column

        for(int i = 1; i<n;i++) {
            for(int j = 1; j<m;j++) {

                if(matrix.get(i).get(j) !=0){
                    if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                        matrix.get(i).set(j, 0);
                    }
                }
            }
        }

        // step - 3 finally set the first row and col

        if(matrix.get(0).get(0) == 0){
            for(int j = 0;j<m;j++) {
                matrix.get(0).set(j, 0);
            }
        }
        if(col0 == 0){
            for(int i = 0;i<n;i++) {
                matrix.get(i).set(0, 0);
            }
        }
        return matrix;
    }
}
