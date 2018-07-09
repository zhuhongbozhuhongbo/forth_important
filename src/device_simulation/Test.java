package device_simulation;

public class Test {

    public static void main(String[] args){
        int a = 0xfafbfcfd;
        int a1 = 0x11110000;
        char b = (char)((a>>24)&0x0f);
        System.out.println("hello");
        System.out.println("aaa " + Integer.toBinaryString(a));
        System.out.println("aaa " + Integer.toHexString(a));
        System.out.println("aaa " + Integer.toBinaryString((a >>> 24)&0xff));
        System.out.println("aaa " + Integer.toHexString((a >>> 24)&0xff));
        System.out.println("aaa " + Integer.toBinaryString((a >>> 16)&0xff));
        System.out.println("aaa " + Integer.toHexString((a >>> 16)&0xff));
        System.out.println("aaa " + Integer.toBinaryString((a >>> 8)&0xff));
        System.out.println("aaa " + Integer.toHexString((a >>> 8)&0xff));
        System.out.println("aaa " + Integer.toBinaryString((a)&0xff));
        System.out.println("aaa " + Integer.toHexString((a)&0xff));
    }
}
