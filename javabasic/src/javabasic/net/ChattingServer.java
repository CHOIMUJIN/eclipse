package javabasic.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingServer {
	
	public static final int SERVERSOCKET_PORT = 9999; // Port 번호는 당사자가 지정, 1024 이상으로 지정해야함.
	
	public static void main(String[] args) {
		
		ServerSocket ss = null; // ServerSocket 만들기
		try{
			ss = new ServerSocket(SERVERSOCKET_PORT);
			if (ss!=null) {
				System.out.println("ServerSocket 생성됨!");
			}
			while (true) {
				Socket svSocket = ss.accept(); // accept : Blocking method
				if (svSocket!=null) {
					System.out.println("서버 측 Socket 생성됨! : " + svSocket);
				}
				InputStream is = svSocket.getInputStream();
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				System.out.println(br.readLine());
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	} // main

} // class
