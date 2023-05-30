package banking.bankarraylist;

import java.util.ArrayList;
import java.util.Scanner;



public class BankArrayList {
	
	static ArrayList<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금   | 4.출금   | 5. 종료   ");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scanner.nextLine());//문자형을 숫자형으로
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				getAccountList();
				
			}else if(selectNo == 3) {
				deposit(); //계좌목록
				
			}else if(selectNo == 4) {
				wirhdraw(); 
				
			}else if(selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}else {
			System.out.println("지원되지 않는 기능입니다. 다시 입력해 주세요");	
			
	}
		}}	

		private static void createAccount() {
			System.out.println("-------------------------------------------------");
			System.out.println("계좌생성");
			System.out.println("-------------------------------------------------");
			
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			System.out.print("계좌주: ");
			String owner = scanner.nextLine();
			System.out.print("초기입금액: ");
			int balance = Integer.parseInt(scanner.nextLine());
			
			Account account = new Account(ano, owner, balance);
			accountList.add(account);
		  System.out.println("결과 : 계좌가 생성되었습니다.");
		  break;
		
				}
					
		//계좌목록을 출력하는 메서드
			private static void getAccountList(){
				
				for(int i=0; i<accountList.size(); i++) {
					Account account = accountList.get(i);
					
					System.out.print("계좌번호: " + account.getAno()+ "\t");
					System.out.print("계좌주: " +account.getOwner()+ "\t");
					System.out.println("잔액: " +account.getBalance();
				} 
			  }
			
			//계좌에 입급하는 메서드
//			private static void deposit() {
//				System.out.println("-------------------------------------------------");
//				System.out.println("예금");
//				System.out.println("-------------------------------------------------");
//				
//				System.out.print("계좌번호: ");
//				String ano = scanner.nextLine();
//				System.out.print("입금액: ");
//				int money =Integer.parseInt(scanner.nextLine());
//				
//				if(findAccount(ano)!=null) {//계좌를찾았다면 (반환값이 있다면)
//					//예금 = 잔고 + 예금액
//					Account account = findAccount(ano);
//					account.setBalance(account.getBalance()+ money);
//					System.out.println("결과: 정상처리 되었습니다.");
//				}else {
//					System.out.println("결과 : 계좌가 없습니다.");
//				}
//				
//			}
//			//계좌에서 출금하는 메서드
//			private static void wirhdraw() {
//				
//				
//			}
			
			
			
			//계좌를 검색하는 메서드
			private static Account findAccount(String ano) {
				Account account = null; //빈계정을 할당
				
				for(int i=0; i<accountList.size(); i++) {
					
					String dbAno = accountList.get(i).getAno(); //이미 저장된 계정
					if(dbAno.equals(ano)) { //문자열 비교- equals()사용
						account = accountList.get(i);
						break;
					}
				}
			}
				return account;
		}
			
			
			
}
	

	
	

