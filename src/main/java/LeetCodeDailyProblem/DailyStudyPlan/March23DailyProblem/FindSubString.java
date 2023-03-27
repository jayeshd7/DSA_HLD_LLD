package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;



public class FindSubString {
    public static void main(String[] args) {
        String s = "sbccccabcxsjbkbmnoxsaxyz";
        //System.out.println(findLognestSubString(s));
        System.out.println(findSubStringBasedOnASCII(s));
    }

    private static String findLognestSubString(String s) {
        HashMap<Character, Integer>map = new HashMap<>();

        String output = "";
        for(int start = 0, end = 0; end < s.length(); end++){
            char currChar = s.charAt(end);
            if(map.containsKey(currChar)){
                start = Math.max(map.get(currChar)+1,start);
            }
            if(output.length()<end-start+1){
                output = s.substring(start,end+1);
            }
            map.put(currChar,end);
        }
        return output;
    }

    private static String findSubStringBasedOnASCII(String S){
        ArrayList<String> list = new ArrayList<>();
        int n = S.length();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j <= n; j++){
                String subString = S.substring(i,j);
                if(isInOrderOfString(subString)){
                    list.add(subString);
                    System.out.println(list);
                    return subString;
                }
            }
        }
        return "";
    }

    private static boolean isInOrderOfString(String subString) {
        int [] arr = new int [26];
        for(int i = 0; i < subString.length(); i++){
            arr[subString.charAt(i)-'a']++;
        }
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
