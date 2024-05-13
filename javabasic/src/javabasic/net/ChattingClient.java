package javabasic.net;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChattingClient {
	
	public static void main(String[] args) {
		
		Socket s = null;
		
		try{
			s = new Socket("192.168.8.22", 9999); // 방법 1
			// s = new Socket("192.168.8.24", 9999); // 방법 2
			// s = new Socket("127.0.0.1", 9999); // 방법 3
			if (s!=null) {
				System.out.println("재팅서버에 연결되었습니다!" + s);
				OutputStream os = s.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				osw.write("Hello~ I'm realchoky~~~");
				osw.flush();
			}
		} catch (UnknownHostException ukhe) {
			ukhe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // main

} // class
