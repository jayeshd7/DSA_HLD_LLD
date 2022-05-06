package AugustBatchProblem.Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class HotelProblem {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(1);
        al.add(2);
        al.add(3);
        al.add(2);
        al.add(5);
        al.add(3);
        al.add(2);
        al.add(4);
        solve(al);
    }

    private static ArrayList<Integer> solve(ArrayList<Integer> A) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i =0;i<A.size();i++){
            hm.put(A.get(i),i);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i =0;i<A.size();i++){
            if(hm.get(A.get(i)) == i){
                al.add(A.get(i));
            }
        }
        System.out.println(al);
        return  al;
    }}
