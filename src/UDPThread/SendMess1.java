package UDPThread;

import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendMess1 implements Runnable{   //起线程发送信息
    DatagramSocket socket;
    public SendMess1(DatagramSocket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try{
            //从键盘输入取得需要发送的信息，通过socket发送出去
            InputStream is = System.in;
            byte[] buffer = new byte[1024];
            DatagramPacket packet = null;
            while(true){
                int length = is.read(buffer);
                packet =  new DatagramPacket(buffer,length, InetAddress.getByName("10.10.10.132"),8800); // "localhost""120.79.24.19"   发送给目标主机的5683端口
                socket.send(packet);
                String str = new String(packet.getData(),0,packet.getLength()).trim();
                System.out.println("UDPsendMessage :" + str);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}