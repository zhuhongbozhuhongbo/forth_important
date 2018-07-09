package time;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest2 {
    public static void main(String[] args){
        sumTime();
    }


    private static void sumTime(){
        int result = 6;

        System.out.println(new java.sql.Time(strToTime("00:00:00").getTime() + (long)result * 1000 * 10));
        int result2 = 60;

        System.out.println(new java.sql.Time(strToTime("00:00:00").getTime() + (long)result2 * 1000 * 10));
        //return new java.sql.Time(strToTime("00:00:00").getTime() + (long)result * 1000 * 10);

    }

    public static Time strToTime(String strTime) {

        String str = strTime;
        SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss");
        Date d = null;
        try {
            d = format.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        Time time = new Time(d.getTime());
        return Time.valueOf(str);
    }
}
