package Aumni;

import java.util.ArrayList;

public class LexicographicOrder {
    public static void main(String[] args) {
       String [] str = {"ABCDEF", "AA", "BEF", "A", "AABB"};
        lexicographicOrder(str);
    }

    private static void lexicographicOrder(String [] str) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].compareTo(str[j]) > 0){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            list.add(str[i]);
        }
        System.out.println(list);


    }
}
