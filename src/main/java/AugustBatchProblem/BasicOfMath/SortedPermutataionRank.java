package AugustBatchProblem.BasicOfMath;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedPermutataionRank {
    public static void main(String[] args) {
        System.out.println(findRank("abdc"));
        // abcd
        // abdc
        // acbd - 3
        // acdb
        // adbc
        // adcb
        // aaaaba - 2


        //abcd
        //abdc
        //acbd
        //

        // abc
        // acb  - 2
        // bac
        // bca
        // cab
        // cba

    }
    public static int findRank(String A) {

        ArrayList<Integer> list = new ArrayList<>();
        int n=A.length();
        factorial(list,n);
        int ans=0,index=0;
        String s=A;

        char[] c=s.toCharArray();
        Arrays.sort(c);

        int[] checked = new int[n];
        Arrays.fill(checked,1);   //checked 0,0,0,0

        for(int i=0;i<n;i++) {
            if(checked[i]==-1) continue;
            else if(c[i]!=A.charAt(index)) {
                ans+=list.get(n-index-1);
            } else {
                checked[i]=-1;
                index++;
                i=-1;
            }
        }
        return (ans+1)%1000003;



    }

    private static void factorial(ArrayList<Integer> list, int n) {
        list.add(1);
        list.add(1);
        for(int i=2;i<n;i++) {
            list.add((i*list.get(i-1))%1000003);
        }
    }

}
