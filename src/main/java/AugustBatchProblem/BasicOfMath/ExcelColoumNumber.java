package AugustBatchProblem.BasicOfMath;

public class ExcelColoumNumber {

    public static void main(String[] args) {
        System.out.println(solve("AB"));
    }

    private static int solve(String a) {

        if(a.length()==0){
            return 0;
        }
        int num=0;
        int alpha=1;
        for(int i=a.length()-1;i>=0;i--){
            int val = a.charAt(i)-64;
            num = num + val*alpha;
            alpha=alpha*26;
        }
        return num;
    }
}
