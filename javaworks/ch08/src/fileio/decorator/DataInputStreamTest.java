package fileio.decorator;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		//기반 스트림 -FileInputStream
		//보조 스트림 - DataInputStream
		
		try(FileInputStream fis = new FileInputStream("file1.txt");
			DataInputStream dis = new DataInputStream(fis)) {
			//한줄씩만 읽음.
			System.out.println( dis.readInt());//int 한줄읽기
			
			System.out.println( dis.readFloat());//float만 읽기
			System.out.println( dis.readUTF());
			
			
		} catch (IOException e) {
		
			
		}

	}

}
