package whileexample;

import java.util.Scanner;

public class Bank1 {

	public static void main(String[] args) {
		// 은행업무 -예금 출금 잔고확인
		Scanner sc = new Scanner(System.in);
		int balance = 1000; //잔고
		boolean run  = true; //상태(실행) 변수
		int money =0;
		
		
		while(run) {
			try {
			System.out.println("==============================");
			System.out.println("1.예금 | 2. 출금 | 3.잔고 | 4. 종료");
			System.out.println("==============================");
			System.out.print("선택> ");
			
			int selNum = Integer.parseInt(sc.nextLine());
			
			switch(selNum) {
			case 1:
				System.out.print("예금액> ");
				money = Integer.parseInt(sc.nextLine());
				balance += money ;
				System.out.printf("%d원 정상처리 되었습니다.\n", money);
				System.out.printf("잔고는 %d원 입니다.\n", balance);
				break;
			case 2:
				System.out.print("출금액> ");
				money = Integer.parseInt(sc.nextLine());
				balance -= money ;
				System.out.printf("%d원 정상처리 되었습니다.\n", money);
				System.out.printf("잔고는 %d원 입니다.\n", balance);
				break;
				
			case 3:
				System.out.println("잔고> "+ balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("다시 하세요");
				break;
		}}catch(Exception e) {
			System.out.println("다시하세요");
		}}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
