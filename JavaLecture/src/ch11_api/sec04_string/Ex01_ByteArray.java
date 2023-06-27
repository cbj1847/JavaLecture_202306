package ch11_api.sec04_string;

import java.io.IOException;
import java.util.Arrays;

/**
 *  byte array를  string으로 만들어주는 방법, file I/O
 */

public class Ex01_ByteArray {

	public static void main(String[] args) throws IOException {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	
		byte[] bytes2 = new byte[100];
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes2);				// 맨 끝 두글자는 \r\n이 따라 붙음
		
		String str3 = new String(bytes2, 0, readByteNo-2);		// \r\n을 제거하고 String으로 만듬
		System.out.printf("%d, %s\n", readByteNo, str3);
		System.out.println(Arrays.toString(bytes2));
	}

}
