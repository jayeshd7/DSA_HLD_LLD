package AugustBatchProblem.Hashing;

import java.util.ArrayList;
import java.util.List;

public class FindTarget {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(2);
        A.add(7);
        A.add(4);
        A.add(5);
        A.add(11);
        A.add(15);

        int target = 9;
        solve(A, target);


    }

    private static ArrayList<Integer> solve(final List<Integer> A, int B) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i =0; i<A.size()-1;i++){
            int value = A.get(i)+A.get(i+1);
            if(value == B){
                arrayList.add(A.get(i));
                arrayList.add(A.get(i+1));
            }
        }
        if(arrayList.size() >2){
            for(int j = 1; j<arrayList.size()-1 ;j++){
                if(arrayList.get(j) > arrayList.get(j+2)){
                    arrayList.remove(j);
                    arrayList.remove(j-1);
                }
            }
        }
        System.out.println(arrayList);
        return arrayList;
    }
}
