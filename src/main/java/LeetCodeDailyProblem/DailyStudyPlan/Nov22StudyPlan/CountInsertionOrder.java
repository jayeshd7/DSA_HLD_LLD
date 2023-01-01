package LeetCodeDailyProblem.DailyStudyPlan.Nov22StudyPlan;

public class CountInsertionOrder {

    public static void main(String[] args) {
        String s = "aabbbccccaaaaa";

        System.out.println(countInsertionOrder(s));
    }

    private static String countInsertionOrder(String s) {
        int n = s.length();
        String ans = "";
        int count = 0;
        for(int i =0; i<n;i++){
            for(int j = i; j<n;j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }else {
                    ans += String.valueOf(s.charAt(i))+String.valueOf(count);
                    i =j;
                    count = 1;
                    break;
                }


            }
        }
        return ans;
    }
}

/*
StringBuilder sb = new StringBuilder();
        char[] mychar = s.toCharArray();
        int count = 1;
        for(int i=0; i< (mychar.length)-1;i++) {
            if(mychar[i] == mychar[i+1]) {
                count = count+1;
            }
            else {
                sb.append(mychar[i]);
                sb.append(count);
                count = 1;

            }
            if(i==(mychar.length)-2) {
                sb.append(mychar[i+1]);
                sb.append(count);
            }

        }

        return sb.toString();

    }
 */