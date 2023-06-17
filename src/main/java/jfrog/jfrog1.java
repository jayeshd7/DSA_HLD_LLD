package jfrog;



/*
 s = "asdaqdsfqod"

 o/p = "f"

  brute force - to traverse in full string 0(n^n)
  SC - o(1)

  map here -
  a - 2
  s - 2
  d - 2
  f - 1
  o - 1

  TC - o(n)
  SC - o(n)



 */
import java.util.HashMap;


public class jfrog1 {
    public static void main(String[] args) {

        System.out.println(findFirstUnique("asdaqdsqd"));
        System.out.println(findFirstUnique1("asdaqdsfqod"));
    }

    private static String findFirstUnique1(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i =0; i<s.length();i++){
            char c = s.charAt(i);
            if(sb.indexOf(String.valueOf(c)) == sb.lastIndexOf(String.valueOf(c))){
                return String.valueOf(c);
            }
        }
        return "";

    }

    private static String findFirstUnique(String A) {

        int n = A.length();
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i =0; i<n;i++){
            if(hm.containsKey(A.charAt(i))){
                int count = hm.get(A.charAt(i));
                hm.put(A.charAt(i), count+1);
            }
            else{
                hm.put(A.charAt(i), 1);
            }
        }
        for(int i=0; i<A.length();i++){
            char ch = A.charAt(i);
            if(hm.get(ch).equals(1)){
                return String.valueOf(ch);
            }
        }
        return "";
    }




}
