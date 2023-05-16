package constant;

import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
	      
	      	      
	      System.out.print("숫자를 입력하세요 : ");
	      int num = scan.nextInt();
	      
	      //String 홀짝 = (num % 2 ==0) ? "짝수": "홀수";
	      String 홀짝 = "";
	      if(num % 2 == 0) {
	    	  홀짝 = "짝수입니다.";
	      }else {
	    	  홀짝 = "홀수입니다.";
	      }
	               
	      //printf("문자열 포맷", 객체)
	      System.out.print(홀짝);
	      scan.close();
	      
		
		}catch(Exception e) {
			System.out.println("숫자를 입력해주세요");
		}
	}

}
