package Aumni;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CheckingDuplicateInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        chekcingNonDuplicate(str);

    }

    private static void chekcingNonDuplicate(String str) {
        if (str == null || str.length() == 0){
            System.out.println("String is empty");
    }

        HashMap<Character, Integer> map = new HashMap<>();

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i]) + 1);
            }else {
                map.put(ch[i], 1);
            }
        }
        System.out.println(map);
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) == 1){
                list.add(ch[i]);
            }
        }

        System.out.println(list);


    }
}
/*
TC - o(n)
SC - o(n)
*/