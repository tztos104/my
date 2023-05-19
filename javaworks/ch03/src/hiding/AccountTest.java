package hiding;

public class AccountTest {

	public static void main(String[] args) {
		//계좌객체 생성
		Account a1 = new Account("1000-1234","이몽룡", 500000);
		Account a2 = new Account("7777-7777","이영준", 999999999);
		
		
		System.out.println("계좌번호: " + a1.getAno());
		System.out.println("이름: " + a1.getOwner());
		System.out.println("잔액: " + a1.getBalance());
		System.out.println("계좌번호: " + a2.getAno());
		System.out.println("이름: " + a2.getOwner());
		System.out.println("잔액: " + a2.getBalance());
	
	}
	
	

}
