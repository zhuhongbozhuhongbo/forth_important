package UDPThread;


import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveMess1 implements Runnable{  //收信息线程
    DatagramSocket socket;
    public ReceiveMess1(DatagramSocket socket){   //在构造函数中得到socket
        this.socket = socket;
    }
    @Override
    public void run(){
        try{
            byte[] buffer = new byte[1024];
            DatagramPacket packet =  new DatagramPacket(buffer,buffer.length);   //生成一个packet接收信息
            while(true){
                socket.receive(packet);
          //      int[] a = (int)packet.getData();

                String str = new String(packet.getData(),0,packet.getLength());
               // System.out.println("HEX:       " + CHexConver.str2HexStr(str));
                System.out.println("STRING:      " + str);

                byte[] send_buf = new byte[1024];
                send_buf = "1".getBytes();
                DatagramPacket packet2 = new DatagramPacket(send_buf,1, packet.getAddress(), packet.getPort()); // "localhost""120.79.24.19" 从packet中读取出目标端口号
                socket.send(packet2);

            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }


}