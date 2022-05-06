package AugustBatchProblem.ProblemSolving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DistinctNumbersInWindow {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(1);
        al.add(2);
        al.add(2);
       /* al.add(4);
        al.add(3);*/

        //1 2 1 3 4 3

        // 2 3 3 2
        int B = 1;
        System.out.println(dNums1(al, B));
    }

    private static ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        int n = A.size();
        int ans = 0;

        ArrayList<Integer> x = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();


        for (int i = 0; i < B; i++) {
            if (hm.containsKey(A.get(i))) {
                int value = hm.get(A.get(i));
                hm.put(A.get(i), value + 1);
            } else {
                hm.put(A.get(i), 1);
            }
        }
        x.add(hm.keySet().size());
        int j = 0;
        if (hm.get(A.get(j)) == 1) {
            hm.remove(A.get(j));
        } else {
            hm.put(A.get(j), hm.get(A.get(j)) - 1);
        }
        j++;
        for (int i = B; i < n; i++) {
            if (hm.containsKey(A.get(i))) {
                int value = hm.get(A.get(i));
                hm.put(A.get(i), value + 1);
            } else {
                hm.put(A.get(i), 1);
            }


            x.add(hm.keySet().size());
            if (hm.get(A.get(j)) == 1) {
                hm.remove(A.get(j));
            } else {
                hm.put(A.get(j), hm.get(A.get(j)) - 1);
            }
            j++;

        }


        return x;

    }




    public static ArrayList<Integer> dNums1(ArrayList<Integer> A, int B) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        ArrayList<Integer> op = new ArrayList<Integer>();
        while(j<A.size()){
            map.put(A.get(j), map.getOrDefault(A.get(j),0)+1);
            if((j-i+1) == B){
                op.add(map.keySet().size());
                // if(map.containsKey(A.get(i))){
                    if(map.get(A.get(i)) == 1){
                        map.remove(A.get(i));
                    }else{
                        map.put(A.get(i), map.get(A.get(i))-1);
                    }
                // }
                i++;
            }
            j++;
        }
        return op;
    }

}
