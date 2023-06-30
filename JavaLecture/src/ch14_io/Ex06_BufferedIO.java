package ch14_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.Buffer;

/**
 * FileXXXStream vs BufferedXXXStream
 */

public class Ex06_BufferedIO {
	
	public static void main(String[] args) throws Exception {
		// Case1
		FileInputStream fis = new FileInputStream("c:/Temp/test1.jpg");
		FileOutputStream fos = new FileOutputStream("c:/Temp/target1.jpg");
		
		// Case2
		FileInputStream fis2 = new FileInputStream("c:/Temp/test2.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/Temp/target2.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// 성능비교
		long noBufferTime = copy(fis, fos);			// 27.3초
		System.out.println("버퍼 미사용 : " + noBufferTime);
		System.out.println("======================================================");
		
		long BufferTime = copy(bis, bos);			// 0.16초
		System.out.println("버퍼사용 : " + BufferTime);
		System.out.println("======================================================");
		
		bis.close();
		bos.close();
		fis2.close();
		fos2.close();
		fis.close();
		fos.close();
	}
	static long copy(InputStream is, OutputStream os) throws Exception {
		long startTime = System.nanoTime();
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long endTime = System.nanoTime();
		return endTime - startTime;
	}
	
}
