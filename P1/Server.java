package P1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

public class Server {
	
	public static void main(String[] args) {
		
		ServerSocket server=null;
		
		Socket s=null;
		
		String file="C:\\Users\\Administrator.SKY-20170306IYS\\Desktop\\obj.dat";
		
		try {
			System.out.println("正等待客户连接...");
			
			server= new ServerSocket(1995);
			
			s=server.accept();//接受阻塞点
			
			System.out.println("客户端连接了...");
			
			OutputStreamWriter osw=new OutputStreamWriter(
					s.getOutputStream());
			
			osw.write("欢迎上线....");
			
			osw.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
	}

}
