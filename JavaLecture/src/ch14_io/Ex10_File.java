package ch14_io;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex10_File {

	public static void main(String[] args) throws Exception {
		File dir = new File("c:/Temp/images");
		File file = new File("c:/Temp/file.txt");
		
		if (!dir.exists())			// 해당 dir가 없을경우
			dir.mkdirs();			// dir 생성
		if (!file.exists())			// 해당 file이 없을경우
			file.createNewFile();	// file 생성
		
		// c:/Temp/ dir 검색
		File temp = new File("c:/Temp/");
		File[] contents = temp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a HH:mm");
		for (File f : contents) {
			System.out.printf("%-24s", sdf.format(f.lastModified()));
			if (f.isDirectory())
				System.out.printf("%-14s  %-20s", "<DIR>", f.getName());
			else
				System.out.printf("%,12d  %-20s", f.length(), f.getName());
			System.out.println();			
			
		}
	}

}
