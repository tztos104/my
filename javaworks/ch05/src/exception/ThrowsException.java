package exception;

public class ThrowsException {

	public static void main(String[] args) {
		try {
			fineClass();
			System.out.println("클래스가 존대함");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("클래스가 존대하지 않습니다.");
		}
		
	}
	
	
	public static void fineClass() throws ClassNotFoundException {
		Class.forName("java.util.ArrayList2");
	}
	

}
