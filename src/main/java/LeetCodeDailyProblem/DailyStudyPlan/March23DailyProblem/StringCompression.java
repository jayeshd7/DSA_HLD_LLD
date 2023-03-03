package LeetCodeDailyProblem.DailyStudyPlan.March23DailyProblem;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compressSolution(chars));
    }

    private static int compressSolution(char[] chars) {
        int count = 1;
        String str = "";
        str+=chars[0];


        for(int i=1; i<chars.length; i++){
            char curr = chars[i];
            char prev = chars[i-1];
            if(prev != curr){
                if(count>1){
                    str+=Integer.toString(count);
                    count = 1;
                }
                str+=curr;
            }
            else
                count++;
        }

        if(count>1){
            str+=Integer.toString(count);
        }

        System.out.println(str);
        char[] c = new char[str.length()];
        for(int i=0; i<str.length(); i++){
            c[i] = str.charAt(i);
        }
        System.out.println(c.length);
        return str.length();

    }
}
