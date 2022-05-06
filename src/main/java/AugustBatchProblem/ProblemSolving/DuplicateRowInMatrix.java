package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRowInMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arraylist2D = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list1=new ArrayList();
        list1.add(1);
        list1.add(0);
        list1.add(0);

// Create second list
        ArrayList<Integer> list2=new ArrayList();
        list2.add(0);
        list2.add(1);
        list2.add(0);

// Create third list
        ArrayList<Integer> list3=new ArrayList();
        list3.add(0);
        list3.add(1);
        list3.add(0);


// Add individual list to arraylist2D
        arraylist2D.add(list1);
        arraylist2D.add(list2);
        arraylist2D.add(list3);

        Set<String> set = new HashSet<>();
        ArrayList<Integer>arrayList = new ArrayList<>();


        for (int i = 0; i < arraylist2D.size(); i++)
        {
            String decimal = "";


            for (int j = 0; j < arraylist2D.get(i).size(); j++) {
                decimal += String.valueOf(arraylist2D.get(i).get(j));
            }

            // if the decimal value is seen before
            if (set.contains(decimal)) {
                arrayList.add(i+1);
            }
            else {
                set.add(decimal);
            }
        }
        System.out.println(arrayList);
    }
}

