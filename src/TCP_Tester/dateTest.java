package TCP_Tester;

import java.util.Calendar;
import java.util.Date;

public class dateTest {
    public static void main(String args[]){
   /*     Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        Calendar calendar1 = Calendar.getInstance();
        calendar1.setTime(date);
        System.out.println(calendar1.getTime());
        calendar1.add(Calendar.SECOND, 63);


        //Date basicDate = new Date();

        System.out.println(calendar1.getTime());*/

   Calendar calendar = Calendar.getInstance();
   java.util.Date ud = new java.util.Date();
   java.sql.Date sd = new java.sql.Date(ud.getTime());
   java.sql.Time st = new java.sql.Time(ud.getTime());
        System.out.println(ud);
        System.out.println(sd);
        System.out.println(st);
        calendar.setTime(ud);
        calendar.add(Calendar.SECOND, 86400);


        ud = calendar.getTime();
        sd = new java.sql.Date(ud.getTime());
        st = new java.sql.Time(ud.getTime());

        System.out.println(ud);
        System.out.println(sd);
        System.out.println(st);

    }

/*    java.util.Date utilDate = new java.util.Date(); //获取当前时间
System.out.println(utilDate);
    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
System.out.println(sqlDate);

    // sql.date转换成util.date
    java.sql.Date sqlDate1 = new java.sql.Date(new java.util.Date().getTime());
System.out.println(sqlDate1);
    java.util.Date utilDate1 = new java.util.Date(sqlDate1.getTime());
System.out.println(utilDate1);*/

}
