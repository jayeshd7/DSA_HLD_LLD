package AugustBatchProblem.Advanced.Hashing;

import java.util.*;

public class SortArrayInGivenOrder {

    public static void main(String[] args) {
        int [] A = {7,4,1,2,9};
        int [] B = {2,10,4,7};
        int [] C = solveSortArrayInGivenOrder(A, B);
        for(int i =0; i<C.length;i++){
            System.out.println(C[i]);
        }
    }

    private static int [] solveSortArrayInGivenOrder(int [] A, int [] B) {

        SortedMap<Integer, Integer> hm = new TreeMap<>();
        for(int i = 0; i<A.length;i++){
            hm.put(A[i], hm.getOrDefault(A[i],0)+1);

        }
        List<Integer> res = new ArrayList<>();

        for(int j = 0; j<B.length;j++){
            if(hm.containsKey(B[j])){
                int k =0;
                while (k<hm.get(B[j])){
                    res.add(B[j]);
                    k++;
                }
            }
            hm.put(B[j], 0);
        }

        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            int key = e.getKey();
            int i = 0;
            while(i<e.getValue()){
                res.add(key) ;
                i++;
            }
        }
        return res.stream().mapToInt(i->i).toArray();

    }
}
