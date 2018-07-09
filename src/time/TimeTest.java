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

    // string����ת��Ϊdate����
    // strTimeҪת����string���͵�ʱ�䣬formatTypeҪת���ĸ�ʽyyyy-MM-dd HH:mm:ss//yyyy��MM��dd��
    // HHʱmm��ss�룬
    // strTime��ʱ���ʽ����Ҫ��formatType��ʱ���ʽ��ͬ
    public static Date stringToDate(String strTime, String formatType)
            throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(formatType);
        Date date = null;
        date = formatter.parse(strTime);
        return date;
    }
}
