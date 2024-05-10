package javabasic.io;

import java.io.File;

public class FileExer {
	
	public static void main(String[] args) {
		
		File root = new File("D:\\");
		
		File [] subArr = root.listFiles();
		printList(subArr);
		
	} // main
	
	static void printList(File[] subArr) {
		for (File subFile : subArr) {
			if (subFile.isDirectory()) {
				System.out.print("[D]" + subFile.getName());
				printList(subFile.listFiles());
			}
			System.out.println(subFile.getName()); // 앞에 get이 붙어있는 것들은 어딘가에서 데이터를 얻어오는 것이다.
		}
	}

} // class
