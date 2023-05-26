package exception;

public class Exception1 {

	public static void main(String[] args) {
		//NullPointerException 발생 -실행 예외(런타임 예외)
		String data = null;
		
		//data의 정보로 문자로 출력하는 메세드
		data.toString();
		
		//NumberFormatException -숫자 형식이 아닐때 발생 예외
		String data2 = "a200";
		
		int value = Integer.parseInt(data2);
		System.out.println(value);
		
	}

}
