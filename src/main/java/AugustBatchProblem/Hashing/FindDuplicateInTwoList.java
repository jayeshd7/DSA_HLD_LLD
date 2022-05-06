package AugustBatchProblem.Hashing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class FindDuplicateInTwoList {

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(7);

        ArrayList<Integer> B = new ArrayList<>();
        B.add(2);
        B.add(3);
        B.add(1);
        B.add(2);



        solve(A,B);
    }

    public static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {


       /* HashMap<Integer, Integer> mapA = add(A);
        ArrayList<Integer>al = new ArrayList<>();
        for(int b:B){
            if(mapA.getOrDefault(b,0)>0){
                mapA.put(b,mapA.get(b)-1);
            }
        }
        return al;
    }

    private static HashMap<Integer, Integer> add(ArrayList<Integer> a) {
        HashMap<Integer, Integer> mapI = new HashMap<>();
        for(int i :a){
            mapI.put(i,mapI.getOrDefault(i,0)+1);
        }
        return mapI;
    }*/


        ArrayList<Integer> result = new ArrayList<>();
        int value = 1;
        int n = A.size();
        int m = B.size();

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < n; i++) {

            if (hashMap.containsKey(A.get(i))) {
                value = value + 1;
                hashMap.put(A.get(i), value);
            } else {
                hashMap.put(A.get(i), value);
            }

        }

        for (int j = 0; j < m; j++) {
            if (hashMap.containsKey(B.get(j)) && hashMap.get(B.get(j)) >= 1) {
                hashMap.put(B.get(j), hashMap.get(B.get(j)) - 1);
                result.add(B.get(j));
            }
        }

        //System.out.println(hashMap);
        Comparator<Integer> temp = (s1, s2) -> s1.intValue() - s2.intValue();
        result.sort(temp);
        System.out.println(result);
        return result;


    }

}
