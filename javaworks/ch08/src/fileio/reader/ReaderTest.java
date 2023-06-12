package fileio.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest {

	public static void main(String[] args) throws IOException {
		
		Reader fr;
		
			fr = new FileReader("data2.txt");
			int data;
			/*
			while(true) {
				data = fr.read();
				if(data == -1) //-1은 없을때! 읽을 데이터가 없을때 빠져나옴
					break;
				System.out.print((char)data);
			}*/
			
			while((data = fr.read()) != -1) {
				System.out.print((char)data);
			
		
		
		
			fr.close();
		
	}

}}