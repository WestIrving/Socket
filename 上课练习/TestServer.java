package 上课练习;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {

	
	public static void main(String[] args) {
		
		try {
			//����һ��socket�����
			ServerSocket server = new ServerSocket(9999);//tcp --- udp
			//�������Ӷ���
			Socket socket = server.accept();
			OutputStream os = socket.getOutputStream();
			
			os.write(20);
			
			
			InputStream is = socket.getInputStream();
			
			System.out.println("Server:"+is.read());
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
		
	
	
}
