package ifexample;

import java.util.Scanner;

public class AdmissionFee {

	public static void main(String[] args) {
		//놀이공원 입장료 계산
		//나이별 - 8세 미만 1000 , 14세미만 2000 20세미만 2500 20세 이상 3000
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 나이는 몇살입니까? ");
		int age = scan.nextInt();
		
		
		int fee = 0 ;
		
		if(age < 8 ) {
			fee = 1000;
			System.out.println("취학 전 아동입니다.");
		}else if(age >= 8 && age <14) {
			fee = 2000;
			System.out.println("어린이입니다.");
		}else if(age >= 14 && age <20) {
			fee = 2500;
			System.out.println("중·고등학생입니다.");
		}else if(age >= 20 && age <60) {
			fee = 3000;
			System.out.println("성인입니다.");
		}else {fee = 2000;
		System.out.println("노인입니다.");}
			
		System.out.printf("입장료는 %d원입니다", fee);
		
	}

}
