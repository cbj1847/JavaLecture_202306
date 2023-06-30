package ch14_io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

public class Ex02_InputStream {

	public static void main(String[] args) throws Exception{
		InputStream is = new FileInputStream("c:/Temp/test.db");
		
		// 방법 1
//		while (true) {
//			int data = is.read();		// 1 byte read
//			if (data == -1) {
//				break;
//			}
//			System.out.println(data);
//		}
		
		
		// 방법 2
		byte[] arr = new byte[20];
		while (true) {
			int num = is.read(arr);
			if (num == -1)
				break;
		}
		System.out.println(Arrays.toString(arr));
		
		is.close();
	}

}
