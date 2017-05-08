package 上课练习;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TestClient {
	
	
	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("127.1.1.1",9999);
			
			InputStream is = socket.getInputStream();
			
			System.out.println("Client:"+is.read());
			
			
			OutputStream os = socket.getOutputStream();
			
			os.write(11);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
