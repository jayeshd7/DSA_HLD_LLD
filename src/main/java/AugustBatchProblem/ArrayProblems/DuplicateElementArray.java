package AugustBatchProblem.ArrayProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateElementArray {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,1,1,2,2,3,4,4,4,6));
        duplicate(al);
    }

    private static void duplicate(List<Integer> A) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int j = 0;
        for(int i =0; i<A.size()-1;i++){
            if(A.get(i) != A.get(i+1)){
                arrayList.add(j,A.get(i));
                j++;
            }
        }
        arrayList.add(j,A.get(A.size()-1));
        A.clear();
        A.addAll(arrayList);

        System.out.println(A);
    }
}
