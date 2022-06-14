package Revision;

import java.util.ArrayList;

public class ConvertPattern {
    public static void main(String[] args) {
        String str = "ABCDE12345";
        covertPatternSolver(str);

        // result : A1B2C3D4E5
    }

    private static void covertPatternSolver(String str) {

        int mid = str.length()/2;
        int size = str.length();

        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();

        for(int i = 0; i<mid;i++){
            l1.add(String.valueOf(str.charAt(i)));
        }
        for(int i = mid; i<size;i++){
            l2.add(String.valueOf(str.charAt(i)));
        }
        ArrayList<String>l = new ArrayList<>();
        for(int i = 0; i<mid;i++){
            l.add(l1.get(i));
            l.add(l2.get(i));
        }
        String delim = "";

        String res = String.join(delim, l);
        System.out.println(res);
    }



}

