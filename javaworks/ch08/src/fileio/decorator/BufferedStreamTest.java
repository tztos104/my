package fileio.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {
		String originFile= "c:/file/redpanda.jpg"; //원본파일
		String copyFile= "c:/file/redpanda5.jpg"; //사본파일
		long start = 0l, end = 0l;
		
		//보조 스트림 사용
		try(FileInputStream fis = new FileInputStream(originFile);
			FileOutputStream fos = new FileOutputStream(copyFile);
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
			start = System.currentTimeMillis();
			int data;
			while((data=bis.read()) != -1 ) {
				bos.write(data);
			}
			end=System.currentTimeMillis();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.printf("파일 복사 소요시간: %dms", (end-start));
				
		
	}

}
