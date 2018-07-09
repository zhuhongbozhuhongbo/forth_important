package TCP_Tester;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;


public class Tcp_receiver implements Runnable{
    private Socket s;
    //该现成所处理的Socket所对应的输入流
    DataInputStream input = null;
    public Tcp_receiver(Socket s)
            throws IOException
    {
        this.s = s;

       input = new DataInputStream(s.getInputStream());
    }

    @Override
    public void run()
    {
        String str = null;
        while(true){
            try
            {
                byte[] cbuf = new byte[1024];
                int hasRead = 0;
                while((hasRead = input.read(cbuf)) > 0){
                    System.out.println("客户端收到：" + new String(cbuf, 0, hasRead, "utf-8"));

                }

            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }
}
