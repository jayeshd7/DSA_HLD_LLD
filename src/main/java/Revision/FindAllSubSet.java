package Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindAllSubSet {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int k = 6;

        System.out.println(findAllSubSet(arr,k));
    }

    private static List<ArrayList> findAllSubSet(int[] arr, int k) {
        ArrayList<ArrayList> result = new ArrayList<>();
        int size = arr.length;
        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if(arr[i] + arr[j] <= k){
                    result.add(new ArrayList<>(List.of(arr[i],arr[j])));
                }
            }
        }
        return Collections.singletonList(result);
    }



}
