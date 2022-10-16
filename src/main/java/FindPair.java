import java.util.ArrayList;
import java.util.HashMap;

public class FindPair {

    public static void main(String[] args) {
        int [] input = {2,1,3,4,7,6,9,8,5};
        int k = 7;
        findPair(input, k);
    }

    private static void findPair(int[] input, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = input.length;
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i =0;i<n;i++){
            hm.put(input[i],1);
        }
        ArrayList<Integer> temp = null;
        for(int j = 0; j<n;j++){
            int b = k-input[j];
            if(hm.containsKey(b)){
                temp = new ArrayList<>();
                temp.add(input[j]);
                temp.add(b);
                ans.add(temp);
                hm.remove(input[j]);
            }

        }

        System.out.println(ans);
    }
}
