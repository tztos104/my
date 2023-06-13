package fileio.decorator;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {

	public static void main(String[] args) {

			try(FileOutputStream fos = new FileOutputStream("file1.txt");
				DataOutputStream dos = new DataOutputStream(fos)
					){
				dos.writeInt(65);
				dos.writeFloat(2.54f);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}System.out.println("수행완료");
	}

}
