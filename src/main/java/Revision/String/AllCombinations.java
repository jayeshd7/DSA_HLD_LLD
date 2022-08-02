package Revision.String;

public class AllCombinations {
    public static void main(String[] args) {
        String str = "geeks";
        StringBuilder sb = new StringBuilder(str);
        sb.append(str);
        for(int i = 0; i<str.length();i++){
            for(int j = 0; j<str.length();j++){
                System.out.print(sb.charAt((i+j)));
            }
            System.out.println();
        }
    }
}
