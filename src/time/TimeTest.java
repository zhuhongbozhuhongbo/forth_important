package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
    public static void main(String[] args){

    Date date =new Date();
    SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd HH:00:00");
    String mtime = formatter.format(date);

        try {
            date = formatter.parse(formatter.format(date));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("" + date);
}

    // string类型转换为date类型
    // strTime要转换的string类型的时间，formatType要转换的格式yyyy-MM-dd HH:mm:ss//yyyy年MM月dd日
    // HH时mm分ss秒，
    // strTime的时间格式必须要与formatType的时间格式相同
    public static Date stringToDate(String strTime, String formatType)
            throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(formatType);
        Date date = null;
        date = formatter.parse(strTime);
        return date;
    }
}
