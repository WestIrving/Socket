package P1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	public static void main(String[] args) {
		
		Socket socket=null;
		
		try {
			socket=new Socket("127.0.0.1", 1995);
			
			InputStreamReader isr=new InputStreamReader(
					socket.getInputStream());
			
			BufferedReader br=new BufferedReader(isr);
			
			String str=null;
			
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
			
			br.close(); //关闭流
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			try {
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
