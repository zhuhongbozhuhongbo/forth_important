package UDPThread;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveMess2 implements Runnable{



    DatagramSocket socket;
    public ReceiveMess2(DatagramSocket socket){
        this.socket = socket;
    }

    @Override
    public void run(){
        try{
            byte[] buffer = new byte[1024];
            DatagramPacket packet =  new DatagramPacket(buffer,buffer.length);
            while(true){
                socket.receive(packet);
                String str = new String(packet.getData(),0,packet.getLength()).trim();
                System.out.println("UDPreceiveMessage : " + str);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}






/*




            if (str == null || command.equals("QUIT")) {// 命令quit结束本次连接
                    done = true;
                    // ReceiveServer.socketlist.remove(this.clientRequest);//把socket从列表中移除
                    // ReceiveServer.addresslist.remove(this.clientRequest.getInetAddress());//移除设备ip
                    //ReceiveServer.addresslist.remove(this.clientRequest.getInetAddress().getHostAddress());//移除设备ip
                    }
                    else if (command.equals("HELP")) { // 命令help查询本服务器可接受的命令
               *//* printmessege("query");
                printmessege("quit");
                printmessege("help");*//*
                    }
                    else if (command.equals("CAD")) { // 查询当前设备CURRENT ACTIVATED DEVICE
                    //ReceiveServer.socketlist.forEach(socket -> output.println(socket));
                    //ReceiveServer.addresslist.forEach(InetAddress -> output.println(InetAddress.toString()));//打印所有ip
                    //ReceiveServer.addresslist.forEach(String -> output.println(String));//打印所有ip
                    }
                    else if (command.equals("QUERYALL")) { // 命令query
                    op_query_all();
                    }else if (command.equals("DELETE")) { // 命令query
                    op_delete();
                    }
                    // else if …….. //在此可加入服务器的其他指令
                    else if (!command.startsWith("HELP") && !command.startsWith("QUIT")
                    && !command.startsWith("QUERY")) {
             *//*   printmessege("Command not Found!Please refer to the HELP!");*//*
                  }*/