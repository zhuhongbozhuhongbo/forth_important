package TCPThread;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

//负责处理每个线程通信的线程类
public class Serverxian implements Runnable 
{
	private Socket ss = null;//其实不用他直接初始化input、output也行
	DataInputStream input = null;
	DataOutputStream output = null;

	public Serverxian(Socket s)
		throws IOException
	{
		this.ss = s;
		//初始化该Socket对应的输入流
		input = new DataInputStream(ss.getInputStream());
		output = new DataOutputStream(ss.getOutputStream());
	}

	@Override
	public void run()
	{
		while (true){
			try{
				byte[] cbuf = new byte[1024];
				int hasRead = 0;
				while((hasRead = input.read(cbuf)) > 0){
					String msg = new String(cbuf, 0, hasRead, "utf-8");
					System.out.println("客户端收到：" + msg);

					byte[] serverbuf = msg.getBytes();
					output.write(serverbuf, 0, serverbuf.length);
					output.flush();
				}
			}catch (Exception e){
			}

		}
	}

}
