package fileio.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterTest2 {

	public static void main(String[] args){

		FileWriter fw =null;
		try {
			fw= new FileWriter("msg.txt");
			fw.write("Good Luck\n");
			fw.write("코로나 조심\n");
			fw.write("바보");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("수행완료");
	}
}