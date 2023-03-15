package a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class findEpoch {
    public static void main(String[] args) throws ParseException {
        System.out.println(getEndTime());
        System.out.println(getStartTime());
    }

    public static String getEndTime() throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");
        String endTime = df.format(new Date());
        Date date = df.parse(endTime);
        long epochEndTime = date.getTime();
        return String.valueOf(epochEndTime);
    }

    public static String getStartTime() throws ParseException {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.YEAR, -1); // to get previous year add -1
        Date nextYear = cal.getTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyyMM");
        String startTime = df.format(nextYear);
        Date date = df.parse(startTime);
        long epochStartTime = date.getTime();
        return String.valueOf(epochStartTime);
    }


}
