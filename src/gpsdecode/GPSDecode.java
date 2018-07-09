package gpsdecode;

import java.util.Base64;

public class GPSDecode {
    public static void main(String[] args){
        String haha = "LLEs8FV95tI=";
        byte[] haha1 = Base64.getDecoder().decode(haha);

        System.out.println("size:" + haha1.length + "   " + haha1[0]);
        System.out.println("after"+ByteCompile.byte2Int(haha1[0], haha1[1], haha1[2],haha1[3]
        )*90.0/Integer.MAX_VALUE);
        System.out.println("after"+ByteCompile.byte2Int(haha1[4], haha1[5], haha1[6],haha1[7]
        )*180.0/Integer.MAX_VALUE);

    }
}
