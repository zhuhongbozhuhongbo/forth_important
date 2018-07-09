package UDPThread;

import java.net.DatagramSocket;

public class PortA
{
    public static void main(String[] args) throws Exception{
        //use the multi-thread .
        //one thread response for sneding message ,in this field you should use the System.in as the inputStream
        //the other response for receiveing the message
        System.out.println("PortA started!");
        DatagramSocket socket = new DatagramSocket(5683);//指定端口号，用于别的端口向这里发送信息用
        new Thread(new ReceiveMess1(socket)).start();//起线程接收信息
        new Thread(new SendMess1(socket)).start();//起线程发送信息

    }
}

//client A :  Port 5684
//client B :  Port 7050