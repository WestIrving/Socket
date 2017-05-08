package 上课练习;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class QQClient extends JFrame{
	
	
	
	public QQClient() {
		//文本框
		JTextArea jta = new JTextArea();
		//创建带有滚动条的面板容器
		JScrollPane jsp = new JScrollPane(jta);
		JTextField jtf = new JTextField(15);
		JButton send = new JButton("发送");
		JPanel jp = new JPanel();
		jp.add(jtf);
		jp.add(send);
		this.setTitle("小胖");
		this.add(jp,"South");
		this.add(jsp);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(550,500);
		this.setVisible(true);
		
		try {
			Socket socket = new Socket("localhost",9999);
			
			
			OutputStream os = socket.getOutputStream();
			
			send.addActionListener(new ClientSend(jtf, jta, os));
			
			InputStream is = socket.getInputStream();
			
			InputStreamReader isr = new InputStreamReader(is);
			
			BufferedReader br = new BufferedReader(isr);
			String s = null;
			while((s = br.readLine())!=null){
				jta.append("大胖:"+s+"\r\n");
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new QQClient();
	}
	
	
	
}
