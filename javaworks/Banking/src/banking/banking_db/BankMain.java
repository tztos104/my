package banking.banking_db;

import java.util.Scanner;

public class BankMain {
	
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		boolean run = true; //실행, 종료 상태 변수
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			try {
				System.out.println("-------------------------------------------");
			    System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.계좌삭제 | 6.종료");
			    System.out.println("-------------------------------------------");
			    System.out.print("선택> ");
			    
			    //메뉴 선택 변수
			    int selectNo = Integer.parseInt(scanner.nextLine()); 
			    
			    if(selectNo==1) {
			    	dao.createAccount();  //계좌 생성 호출
			    }else if(selectNo==2){
			    	dao.getAccountList(); //계좌 목록
			    }else if(selectNo==3) {
			    	dao.deposit();        //입금
			    }else if(selectNo==4) {
			    	dao.withdraw();       //출금
			    }else if(selectNo==5){
			    	dao.delete();
			    }else if(selectNo==6){
			    	run = false;      //상태 변수 변경
			    	System.out.println("프로그램을 종료합니다!");
			    }else {
			    	System.out.println("지원되지 않는 기능입니다. 다시 입력해주세요");
			    }
			}catch(Exception e) { //예외 처리 구문
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
		}
		scanner.close();
	}
}
