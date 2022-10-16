package Revision.String;

import java.util.Arrays;
import java.util.Comparator;

public class SortStringArrayBasedOnLength {
    public static void main(String[] args) {
        String [] str = {"Ihlhjl","the","like", "coding"};
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() < o2.length() ? -1 : 1;
            }
        });
        for(int i =0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
