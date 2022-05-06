package AugustBatchProblem.StringProblems;

public class StringModification {

    public static void main(String[] args) {
        String s = "jayesw";
        solve(s);
    }

    private static void solve(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.replace(5,6,"h");
        //sb.deleteCharAt(5);
        //sb.insert(5,"h");

        System.out.println(sb);
    }
}
