package sdeSheet;

import java.util.List;
import java.util.ArrayList;

public class PascalTriangle {

    public static void main(String[] args) {
        int n = 5;
        

        List<List<Integer>> ans = generatePascalTriangle(n);
        System.out.println("Pascal Triangle: ");
        for(List<Integer> row: ans) {
            for(int ele: row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    private static List<List<Integer>> generatePascalTriangle(int n) {
         List<List<Integer>> ans = new ArrayList<>();

         for(int row = 1;row <=n;row++){
             ans.add(generateRow(row));
         }

         return ans;


    }

    private static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRows = new ArrayList<>();
        ansRows.add(1);

        for(int col=1; col<row;col++){
            ans = ans * (row - col) / col;
            ansRows.add((int)ans);
        }
        return ansRows;
    }


}
