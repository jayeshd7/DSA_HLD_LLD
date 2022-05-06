package AugustBatchProblem.MultiDimensionArray;

import java.util.ArrayList;

public class AntiDiagonal {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arraylist2D = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list1=new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

// Create second list
        ArrayList<Integer> list2=new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

// Create third list
        ArrayList<Integer> list3=new ArrayList();
        list3.add(7);
        list3.add(8);
        list3.add(9);


// Add individual list to arraylist2D
        arraylist2D.add(list1);
        arraylist2D.add(list2);
        arraylist2D.add(list3);

        System.out.println(arraylist2D);

        diagonal(arraylist2D);

    }
    public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        int rowSize = a.size();

        for (int i = 0; i < rowSize*2-1; i++) {
            result.add(getDiagonal(i, a));
        }



        System.out.println(result);
        return result;
    }

    public static ArrayList<Integer> getDiagonal(int layer, ArrayList<ArrayList<Integer>> a) {
        ArrayList<Integer> result1 = new ArrayList<Integer>();
        for (int i = 0; i <= layer; i++) {
            int j = layer-i;
            if (i < a.size() && j < a.size()) {
                result1.add(a.get(i).get(j));
            }


        }
        int result1Size = result1.size();
        int rowSize = a.size();
        while(result1Size != rowSize){
            result1.add(0);
            result1Size = result1.size();
        }



        return result1;
    }

}
