package fileio;

import java.io.File;
import java.io.IOException;

public class FileExample {

	
	public static void main(String[] args) throws IOException {
		
		File file = new File("c:/file/newFile.txt");
		file.createNewFile();
		
		System.out.println("파일이냐? "+ file.isFile()); //파일이냐?
		System.out.println("디렉터리냐? "+file.isDirectory()); // 디렉터리냐?
		System.out.println("파일이름은? "+file.getName()); // 파일이름은?
		System.out.println("파일경로는?? "+file.getPath()); // 파일의 경로는?
		System.out.println("파일 용량은?? "+file.length()+"B"); // 파일의 경로는?
		
		//System.out.println("생성완료");
		
		
	}
	
	
}
