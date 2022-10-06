package AugustBatchProblem.ExaBeam;

public class ChoppingWord {

    public static void main(String[] args) {
        String s = "COMBINATION";
        choppingString(s);
    }

    private static String choppingString(String s) {

        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb);
        int start = 0;
        int end = sb.length()-1;


        while(start<end){
            sb.deleteCharAt(end);
            System.out.println(sb);
            sb.deleteCharAt(start);
            System.out.println(sb);
            end = sb.length()-1;


        }
        return sb.toString();
    }
}

