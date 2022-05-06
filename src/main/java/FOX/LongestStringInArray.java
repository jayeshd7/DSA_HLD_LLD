package FOX;

import java.util.ArrayList;
import java.util.Comparator;

public class LongestStringInArray {

    public static void main(String[] args) {


        ArrayList<String> al = new ArrayList<>();
        al.add("onee");
        al.add("two");
        al.add("a");
        Comparator<String> temp = (s1, s2) -> s1.length() - s2.length();

       al.stream().sorted(temp).forEach(s -> System.out.println(s));


    }
}
