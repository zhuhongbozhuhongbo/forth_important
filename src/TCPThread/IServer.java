package TCPThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class IServer
{
    public static void main(String[] args) 
		throws IOException
    {

/*
		DatagramSocket socket = new DatagramSocket(7000);//指定端口号，用于别的端口向这里发送信息用
		new Thread(new ReceiveMess1(socket)).start();//起线程接收信息
		new Thread(new SendMess1(socket)).start();//起线程发送信息
*/

		System.out.println("TCP服务器程序");
		ServerSocket ss = new ServerSocket(8080);

		while(true)
		{
			//此行代码会阻塞，将一直等待别人的连接
			Socket s = ss.accept();

			System.out.println("a Client has connected!");
			//每当客户端连接后启动一条ServerThread线程为该客户端服务
			new Thread(new Serverxian(s)).start();
		}

	}
}