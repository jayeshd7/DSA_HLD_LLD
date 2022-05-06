package AugustBatchProblem.RandomProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {
    private final int MAX_VALUE = 1000000;
    private final int ARRAY_SIZE = 100;
    private List<List<Integer>> parentList;
    boolean[] arr;

    public MyHashSet() {
        arr = new boolean[1000001];
        parentList = new ArrayList<>(ARRAY_SIZE);
        for(int i = 0; i < ARRAY_SIZE; i++){
            parentList.add(null);
        }
    }
    public void add(int key){
        arr[key] = true;
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        if(childList == null){
            List<Integer> list = new LinkedList<>();
            list.add(key);
            parentList.set(index,list);
        }
        else{
            if(!childList.contains(key)){
                childList.add(key);
            }
        }
    }
    public void remove(int key){
        arr[key] = false;
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        if(childList != null){
            childList.remove(Integer.valueOf(key));
        }
    }
    public boolean conatins(int key){

        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        return childList != null && childList.contains(key);
    }

}
