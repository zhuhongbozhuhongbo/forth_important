package TCP_Tester;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

import TCPThread.Clientxian;

public class Used_tcp_tester {

    public static void main(String[] args)
    throws IOException
    {
        System.out.println("Tcp传输客户端程序");

        Socket s = new Socket("120.79.24.19", 8080);//
        new Thread(new Tcp_receiver(s)).start();



        DataOutputStream output = new DataOutputStream(s.getOutputStream());


        String line = null;
        //不断读取键盘输入并输出
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((line = br.readLine()) != null)
        {
            line = line + System.getProperty("line.separator");
            byte[] clientbuf = line.getBytes();
            output.write(clientbuf, 0, clientbuf.length);
            output.flush();

        }

    }

}
