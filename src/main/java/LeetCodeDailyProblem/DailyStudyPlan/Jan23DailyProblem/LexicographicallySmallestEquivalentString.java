package LeetCodeDailyProblem.DailyStudyPlan.Jan23DailyProblem;

public class LexicographicallySmallestEquivalentString {
    public static void main(String[] args) {
        String A = "parker";
        String B = "morris";
        String S = "parser";
        System.out.println(smallestEquivalentString(A,B,S));
    }

    private static String smallestEquivalentString(String A, String B, String S) {
        int[] parent = new int[26];
        for(int i=0;i<26;i++){
            parent[i] = i;
        }
        for(int i=0;i<A.length();i++){
            int a = A.charAt(i)-'a';
            int b = B.charAt(i)-'a';
            int parentA = findParent(parent,a);
            int parentB = findParent(parent,b);
            if(parentA<parentB){
                parent[parentB] = parentA;
            }else{
                parent[parentA] = parentB;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<S.length();i++){
            int index = S.charAt(i)-'a';
            sb.append((char)(findParent(parent,index)+'a'));
        }
        return sb.toString();
    }

    private static int findParent(int[] parent, int index) {
        if(parent[index]==index)return index;
        return parent[index] = findParent(parent,parent[index]);
    }
}
