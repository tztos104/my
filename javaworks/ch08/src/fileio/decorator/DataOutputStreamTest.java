package fileio.decorator;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {
		//기반 스트림-FileOutputStream
		//보조 스트림- DataOutputStream 속도가 빨라짐!!
			try(FileOutputStream fos = new FileOutputStream("file1.txt");
				DataOutputStream dos = new DataOutputStream(fos)
					){
				dos.writeInt(65);
				dos.writeFloat(2.54f);
				dos.writeChars("fa");
				dos.writeChar('A');
				dos.writeByte(65);
				dos.writeUTF("안녕하세요");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}System.out.println("수행완료");
	
			
	
	
	}

}
