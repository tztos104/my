package strings;

public class StringIndexOf {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		int location = subject.indexOf("야");
		System.out.println(location);
		
		if(location >= 0) {
			System.out.println("자바와 관련된 책이군요!");
		}else {
			System.out.println("자바와 관련이 없는 책이군요");
		}
	
	
	}

}
