package UDPThread;

import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendMess2 implements Runnable{
    DatagramSocket socket;
    public SendMess2(DatagramSocket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try{
            //从键盘输入取得需要发送的信息，通过socket发送出去
            //InputStream is = System.in;
            byte[] buffer = new byte[1024];
            DatagramPacket packet = null;
            //while(true){
                //int length = is.read(buffer);

            //注：以下代码用于模拟安全帽项目下位机发送
            //                   心率         低压          高压      线速度     电量       空      日期时间
            String sendString = "000000" + "000000" + "000000" + "000000" + "111111" + "000000" + "000000" + "000000000000" + "000000000000" + "000000000000" + "000000000000"
            //                  北斗                                              位移      标识
                    + "000000000000000000000000000000000000000000000000" + "000000000000" + "1";
                buffer = sendString.getBytes();


           String name = "120.79.24.19";
            //String name = "10.10.10.132";
            //String name = "192.168.1.104";
            //String name = "192.168.43.206";
            InetAddress address=InetAddress.getByName(name);
            packet =  new DatagramPacket(buffer,buffer.length, address,8805);
                socket.send(packet);
                String str = new String(packet.getData(),0,packet.getLength());
                System.out.println("UDPsendMessage :" + str);
                Thread.sleep(100);
           // }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}