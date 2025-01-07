package sdeSheet;

import groovy.util.NodeList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementNBy3Times {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
        ArrayList<Integer> ans = majorityElement(arr);
        System.out.println("Majority element: " + ans);
    }

    private static ArrayList<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        if (n == 0) {
            return ans;
        }
        int mini = (int)(n / 3) + 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            if(map.get(arr[i]) == mini){
                ans.add(arr[i]);
            }
            if(ans.size() ==2) break;
        }


        return ans;



    }
}
