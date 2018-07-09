package TCPThread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.DatagramSocket;
import java.net.Socket;

import UDPThread.ReceiveMess2;
import UDPThread.SendMess2;

public class IClient
{
    public static void main(String[] args)
		throws IOException 
    {


		System.out.println("下面执行TCP部分");
		Socket s  = new Socket("120.79.24.19" , 8080);//"10.10.10.134"
		//客户端启动ClientThread线程不断读取来自服务器的数据
		new Thread(new Clientxian(s)).start();



		//获取该Socket对应的输出流
		PrintStream ps = new PrintStream(s.getOutputStream());
		String line = null;
		//不断读取键盘输入并输出
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while ((line = br.readLine()) != null)
		{
			//将用户的键盘输入内容写入Socket对应的输出流
			ps.println(line);
		}

    }
}
/*
<query><userid>001</userid><passwd>aaa</passwd><field>numberPlate</field><type>DSI</type><querymode>findByProjectInformation</querymode><p0>empty</p0><p1>empty</p1><p2>empty</p2><p3>太湖隧道项目</p3><p4>empty</p4><p5>empty</p5></query>
 */

/*
<query><userid>001</userid><passwd>aaa</passwd><field>all</field><type>PDI</type><querymode>findByProjectProvince</querymode><p0>empty</p0><p1>江苏</p1><p2>empty</p2><p3>null</p3><p4>null</p4><p5>null</p5></query>
 */
/*
<query><userid>001</userid><passwd>aaa</passwd><field>all</field><type>DSI</type><querymode>findByProjectInformation</querymode><p0>empty</p0><p1>empty</p1><p2>empty</p2><p3>太湖隧道项目</p3><p4>empty</p4><p5>empty</p5></query>
 */

/*
<query><userid>001</userid><passwd>aaa</passwd><field>numberPlate</field><type>DSI</type><querymode>findByProjectInformation</querymode><p0>empty</p0><p1>empty</p1><p2>empty</p2><p3>太湖隧道项目</p3><p4>empty</p4><p5>empty</p5></query>
 */