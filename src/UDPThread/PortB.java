package UDPThread;

import java.net.DatagramSocket;

public class PortB
{
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(8806);
        new Thread(new ReceiveMess2(socket)).start();
        new Thread(new SendMess2(socket)).start();

    }
}
