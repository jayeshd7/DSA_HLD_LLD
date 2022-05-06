package AugustBatchProblem.Hashing;

import java.util.*;

public class DateProblem {

    public static void main(String[] args) {
        String A = "6th Mar 2068";
        solve(A);
        //output format - 2068-03-06
    }



    public static String solve(String date)  {

            HashMap<String, String> hm = new HashMap<>();
            hm.put("Jan", "01"); hm.put("Feb", "02"); hm.put("Mar", "03"); hm.put("Apr", "04");
            hm.put("May", "05"); hm.put("Jun", "06"); hm.put("Jul", "07"); hm.put("Aug", "08");
            hm.put("Sep", "09"); hm.put("Oct", "10"); hm.put("Nov", "11"); hm.put("Dec", "12");

            int len = date.length();
            StringBuilder sb = new StringBuilder();
            for (int i = len - 4; i < len; i++) {
                sb.append(date.charAt(i));
            }
            sb.append("-");
            sb.append(hm.get(date.substring(len - 8, len - 5)));
            sb.append("-");
            if (len == 12) {
                sb.append('0');
                sb.append(date.charAt(0));
            } else {
                sb.append(date.charAt(0));
                sb.append(date.charAt(1));
            }
        System.out.println(sb.toString());
            return sb.toString();

    }
}
