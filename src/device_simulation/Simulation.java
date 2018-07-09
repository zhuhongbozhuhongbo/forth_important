package device_simulation;
/*
Î´ÏëºÃ
 */
public class Simulation {
    private static char[] dataBuffer = new char[156];
    /*public static String generate(){

    }*/
    public static void setMag_X(char x0, char x1, char x2, char x3, char x4, char x5){
        dataBuffer[0] = x0;
        dataBuffer[1] = x1;
        dataBuffer[2] = x2;
        dataBuffer[3] = x3;
        dataBuffer[4] = x4;
        dataBuffer[5] = x5;
    }

    public static void setMag_Y(char y0, char y1, char y2, char y3, char y4, char y5){
        dataBuffer[6] = y0;
        dataBuffer[7] = y1;
        dataBuffer[8] = y2;
        dataBuffer[9] = y3;
        dataBuffer[10] = y4;
        dataBuffer[11] = y5;
    }

    public static void setMag_Z(char z0, char z1, char z2, char z3, char z4, char z5){
        dataBuffer[12] = z0;
        dataBuffer[13] = z1;
        dataBuffer[14] = z2;
        dataBuffer[15] = z3;
        dataBuffer[16] = z4;
        dataBuffer[17] = z5;
    }

    public static void setGyro_X(char x0, char x1, char x2, char x3, char x4, char x5){
        dataBuffer[18] = x0;
        dataBuffer[19] = x1;
        dataBuffer[20] = x2;
        dataBuffer[21] = x3;
        dataBuffer[22] = x4;
        dataBuffer[23] = x5;
    }

    public static void setGyro_Y(char y0, char y1, char y2, char y3, char y4, char y5){
        dataBuffer[24] = y0;
        dataBuffer[25] = y1;
        dataBuffer[26] = y2;
        dataBuffer[27] = y3;
        dataBuffer[28] = y4;
        dataBuffer[29] = y5;
    }

    public static void setGyro_Z(char z0, char z1, char z2, char z3, char z4, char z5){
        dataBuffer[30] = z0;
        dataBuffer[31] = z1;
        dataBuffer[32] = z2;
        dataBuffer[33] = z3;
        dataBuffer[34] = z4;
        dataBuffer[35] = z5;
    }

    public static void setSpeed(char s0, char s1, char s2, char s3, char s4, char s5){
        dataBuffer[36] = s0;
        dataBuffer[37] = s1;
        dataBuffer[38] = s2;
        dataBuffer[39] = s3;
        dataBuffer[40] = s4;
        dataBuffer[41] = s5;
    }


    public static void setAcc_X(char x0, char x1, char x2, char x3, char x4, char x5){
        dataBuffer[42] = x0;
        dataBuffer[43] = x1;
        dataBuffer[44] = x2;
        dataBuffer[45] = x3;
        dataBuffer[46] = x4;
        dataBuffer[47] = x5;
    }

    public static void setAcc_Y(char y0, char y1, char y2, char y3, char y4, char y5){
        dataBuffer[48] = y0;
        dataBuffer[49] = y1;
        dataBuffer[50] = y2;
        dataBuffer[51] = y3;
        dataBuffer[52] = y4;
        dataBuffer[53] = y5;
    }

    public static void setAcc_Z(char z0, char z1, char z2, char z3, char z4, char z5){
        dataBuffer[54] = z0;
        dataBuffer[55] = z1;
        dataBuffer[56] = z2;
        dataBuffer[57] = z3;
        dataBuffer[58] = z4;
        dataBuffer[59] = z5;
    }

    public static void setFuel(char f0, char f1, char f2, char f3, char f4, char f5){
        dataBuffer[60] = f0;
        dataBuffer[61] = f1;
        dataBuffer[62] = f2;
        dataBuffer[63] = f3;
        dataBuffer[64] = f4;
        dataBuffer[65] = f5;
    }

    public static void setBattery(char b0, char b1, char b2, char b3, char b4, char b5){
        dataBuffer[66] = b0;
        dataBuffer[67] = b1;
        dataBuffer[68] = b2;
        dataBuffer[69] = b3;
        dataBuffer[70] = b4;
        dataBuffer[71] = b5;
    }

    public static void setDateTime(char year, char month, char day, char hour, char minute, char second){
        dataBuffer[72] = year;
        dataBuffer[73] = month;
        dataBuffer[74] = day;
        dataBuffer[75] = hour;
        dataBuffer[76] = minute;
        dataBuffer[77] = second;
    }

    public static void setRotation(char r0, char r1, char r2, char r3, char r4, char r5){
        dataBuffer[78] = r0;
        dataBuffer[79] = r1;
        dataBuffer[80] = r2;
        dataBuffer[81] = r3;
        dataBuffer[82] = r4;
        dataBuffer[83] = r5;
    }

    public static void setWork(char w0, char w1, char w2, char w3, char w4, char w5){
        dataBuffer[84] = w0;
        dataBuffer[85] = w1;
        dataBuffer[86] = w2;
        dataBuffer[87] = w3;
        dataBuffer[88] = w4;
        dataBuffer[89] = w5;
    }

    public static void setID(long id){
        dataBuffer[90] = (char)((id>>>40)&0xff);
        dataBuffer[91] = (char)((id>>>32)&0xff);
        dataBuffer[92] = (char)((id>>>24)&0xff);
        dataBuffer[93] = (char)((id>>>16)&0xff);
        dataBuffer[94] = (char)((id>>>8)&0xff);
        dataBuffer[95] = (char)((id)&0xff);
    }

    /*
       System.out.println("aaa " + Integer.toBinaryString((a >>> 8)&0xff));
        System.out.println("aaa " + Integer.toHexString((a >>> 8)&0xff));
     */

    public static void setLatitude(int Lati0, int Lati1, int Lati2, int Lati3, int Lati4, int Lati5){
        dataBuffer[96] = (char)((Lati0>>>24)&0xff);
        dataBuffer[97] = (char)((Lati0>>>16)&0xff);
        dataBuffer[98] = (char)((Lati0>>>8)&0xff);
        dataBuffer[99] = (char)((Lati0)&0xff);

        dataBuffer[104] = (char)((Lati1>>>24)&0xff);
        dataBuffer[105] = (char)((Lati1>>>16)&0xff);
        dataBuffer[106] = (char)((Lati1>>>8)&0xff);
        dataBuffer[107] = (char)((Lati1)&0xff);

        dataBuffer[112] = (char)((Lati2>>>24)&0xff);
        dataBuffer[113] = (char)((Lati2>>>16)&0xff);
        dataBuffer[114] = (char)((Lati2>>>8)&0xff);
        dataBuffer[115] = (char)((Lati2)&0xff);

        dataBuffer[120] = (char)((Lati3>>>24)&0xff);
        dataBuffer[121] = (char)((Lati3>>>16)&0xff);
        dataBuffer[122] = (char)((Lati3>>>8)&0xff);
        dataBuffer[123] = (char)((Lati3)&0xff);

        dataBuffer[128] = (char)((Lati4>>>24)&0xff);
        dataBuffer[129] = (char)((Lati4>>>16)&0xff);
        dataBuffer[130] = (char)((Lati4>>>8)&0xff);
        dataBuffer[131] = (char)((Lati4)&0xff);

        dataBuffer[136] = (char)((Lati5>>>24)&0xff);
        dataBuffer[137] = (char)((Lati5>>>16)&0xff);
        dataBuffer[138] = (char)((Lati5>>>8)&0xff);
        dataBuffer[139] = (char)((Lati5)&0xff);
    }

    public static void setLongitude(int Logi0, int Logi1, int Logi2, int Logi3, int Logi4, int Logi5){
        dataBuffer[100] = (char)((Logi0>>>24)&0xff);
        dataBuffer[101] = (char)((Logi0>>>16)&0xff);
        dataBuffer[102] = (char)((Logi0>>>8)&0xff);
        dataBuffer[103] = (char)((Logi0)&0xff);

        dataBuffer[108] = (char)((Logi1>>>24)&0xff);
        dataBuffer[109] = (char)((Logi1>>>16)&0xff);
        dataBuffer[110] = (char)((Logi1>>>8)&0xff);
        dataBuffer[111] = (char)((Logi1)&0xff);

        dataBuffer[116] = (char)((Logi2>>>24)&0xff);
        dataBuffer[117] = (char)((Logi2>>>16)&0xff);
        dataBuffer[118] = (char)((Logi2>>>8)&0xff);
        dataBuffer[119] = (char)((Logi2)&0xff);

        dataBuffer[124] = (char)((Logi3>>>24)&0xff);
        dataBuffer[125] = (char)((Logi3>>>16)&0xff);
        dataBuffer[126] = (char)((Logi3>>>8)&0xff);
        dataBuffer[127] = (char)((Logi3)&0xff);

        dataBuffer[132] = (char)((Logi4>>>24)&0xff);
        dataBuffer[133] = (char)((Logi4>>>16)&0xff);
        dataBuffer[134] = (char)((Logi4>>>8)&0xff);
        dataBuffer[135] = (char)((Logi4)&0xff);

        dataBuffer[140] = (char)((Logi5>>>24)&0xff);
        dataBuffer[141] = (char)((Logi5>>>16)&0xff);
        dataBuffer[142] = (char)((Logi5>>>8)&0xff);
        dataBuffer[143] = (char)((Logi5)&0xff);
    }

    public static void setDistance(char dis0, char dis1, char dis2, char dis3, char dis4, char dis5){
        dataBuffer[144] = (char)((dis0>>>8)&0xff);
        dataBuffer[145] = (char)((dis0)&0xff);

        dataBuffer[146] = (char)((dis1>>>8)&0xff);
        dataBuffer[147] = (char)((dis1)&0xff);

        dataBuffer[148] = (char)((dis2>>>8)&0xff);
        dataBuffer[149] = (char)((dis2)&0xff);

        dataBuffer[150] = (char)((dis3>>>8)&0xff);
        dataBuffer[151] = (char)((dis3)&0xff);

        dataBuffer[152] = (char)((dis4>>>8)&0xff);
        dataBuffer[153] = (char)((dis4)&0xff);

        dataBuffer[154] = (char)((dis5>>>8)&0xff);
        dataBuffer[155] = (char)((dis5)&0xff);

    }


}
