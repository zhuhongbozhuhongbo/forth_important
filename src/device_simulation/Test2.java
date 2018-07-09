package device_simulation;

public class Test2 {

    public static String byte2Id(byte b1,byte b2,byte b3,byte b4,byte b5,byte b6){

        long i = (((((long)b1 & 0xff) << 40)
                | (((long)b2 & 0xff) << 32)
                | ((long)(b3 & 0xff) << 24)
                | (((long)b4 & 0xff) << 16)
                | (((long)b5 & 0xff) << 8)
                | (((long)b6 & 0xff) << 0)));
        return "" + i;
    }
}
