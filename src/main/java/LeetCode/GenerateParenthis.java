package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthis {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthis(n, n , new StringBuilder(), new ArrayList<>()));
    }

    private static List<String> generateParenthis(int open, int close, StringBuilder s, List<String> res) {

        if(open == 0 && close == 0){
            res.add(s.toString());
            return res;

        }

        if(open>0){
            generateParenthis(open-1,close,s.append('('), res);
            s.deleteCharAt(s.length()-1);
        }
        if(open<close){
            generateParenthis(open,close-1,s.append(')'), res);
            s.deleteCharAt(s.length()-1);
        }

        return res;
    }
}
