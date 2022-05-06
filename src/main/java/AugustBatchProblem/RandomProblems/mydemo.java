package AugustBatchProblem.RandomProblems;

import java.util.ArrayList;
import java.util.HashMap;

public class mydemo {

    public static void main(String[] args) {
        list2Map();

    }

    private static void list2Map() {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(3);
        System.out.println(arrayList);

        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(Integer i : arrayList){
        hashMap.put(arrayList.indexOf(i), i);

        }
        System.out.println(hashMap);

        //java -8



    }
}
