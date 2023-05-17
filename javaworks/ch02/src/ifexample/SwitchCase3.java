package ifexample;

public class SwitchCase3 {

	public static void main(String[] args) {
		// 두수의 사칙연산

			int num1 = 10;
			int num2 = 2;
			char operator = '*';
			int result = 0;
					
			switch(operator){
				case '+':
					result = num1 + num2 ;
					break;
				case '-':
					result = num1 - num2 ;
					break;
				case 'x': case '*' :
					result = num1 * num2 ;
					break;
				case '÷': case '/':
					result = num1 / num2 ;
					break;
				default:
					System.out.println("지원이 되지 않는 기능입니ㅏㄷ.");
					return; //즉시종료
				
			}
			System.out.println("결과는" + result +"입니다");
		
	}

}
