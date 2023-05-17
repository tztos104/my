package ifexample;

public class IfOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		char operator = '-';
		int result = 0;
				
		if(operator == '*') {
			result = num1 * num2;
			
		}else if(operator == '+') {
			result = num1 + num2;
			
		}else if(operator == '-') {
			result = num1 - num2;
			
		}else if(operator == '/') {
			result = num1 / num2;
			
		}else{
			System.out.println("잘못됨여");
		}
		System.out.println("답은"+result +"입니다.");
		}

}
