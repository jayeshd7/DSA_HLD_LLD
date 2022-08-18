package AugustBatchProblem.Day1;

import java.util.ArrayList;

public class SubSet {

    public static void main(String[] args) {
        int [] nums = {3,2,1};
        ArrayList<ArrayList<Integer>> subset = subset(nums);
        System.out.println(subset);
    }

    public static <T> T method(T t ){
        return t;
    }

    private static ArrayList<ArrayList<Integer>> subset(int[] nums) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //Arrays.sort(nums);
        backtrack(list,new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
