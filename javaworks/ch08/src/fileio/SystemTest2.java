package fileio;

import java.io.IOException;

public class SystemTest2 {
	
	public static void main(String[] args) throws IOException {
		System.out.println("여러개의 문자를 입력하고 엔터를 누르세요");
		
		
		
			
			//구현2.
			int data;
			while((data= System.in.read()) != -1) {
				System.out.println((char)data);
			}
			
	 int readByte;
			
			//구현 1.
			while(true) {
				readByte = System.in.read();
				if(readByte == -1) break;
				 System.out.print((char)readByte);
			}
			
			/*
			 * while(true) { try { readByte =System.in.read(); if(readByte == -1) break;
			 * System.out.print((char)readByte); //아스키 코드값 출력 } catch (IOException e) {
			 * e.printStackTrace(); } }
			 */
			
		
		
	}

}
