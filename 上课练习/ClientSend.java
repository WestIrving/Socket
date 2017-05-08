package 上课练习;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientSend implements ActionListener{

	private JTextField jtf;
	private JTextArea jta;
	private OutputStream os;
	
	
	public ClientSend(JTextField jtf,JTextArea jta,OutputStream os) {
		
		this.jta = jta;
		this.jtf = jtf;
		this.os  =os;
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//得到输入框信息
		String msg = jtf.getText();
		//给文本框添加文本信息
		//jta.setText("大胖:"+msg);
		
		jta.append("小胖:"+msg+"\r\n");
		
		//服务端向客户端发送数据
		PrintWriter pw = new PrintWriter(os, true);
		pw.println(msg);
		
		
		
	}
}
