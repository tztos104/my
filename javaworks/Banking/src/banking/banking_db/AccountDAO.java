package banking.banking_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import banking.banking_db.common.JDBCUtil;

public class AccountDAO {
	//JDBC 관련 변수
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
			
	private Scanner scanner = new Scanner(System.in);
	
	//계좌 생성
	public void createAccount() {
		System.out.println("--------------------------");
		System.out.println("계좌 생성");
		System.out.println("--------------------------");
		
		while(true) {
			System.out.println("계좌 번호: ");
			String ano = scanner.nextLine();
			if(findAccount(ano) != null) {
				System.out.println("중복된 계좌입니다. 다시 입력하세요");
			}else {
				System.out.println("계좌주: ");
				String owner = scanner.nextLine();
				while(true) {
					System.out.println("초기 입금액: ");
					int balance = scanner.nextInt();
					if(balance < 100) {
						System.out.println("초기 입금액은 100원 이상입니다.");
					}else {
						//계좌 객체 생성
						conn = JDBCUtil.getConnection();
						String sql = "INSERT INTO account(ano, owner, balance) VALUES (?, ?, ?)";
						try {
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, ano);
							pstmt.setString(2, owner);
							pstmt.setInt(3, balance);
							pstmt.executeUpdate();
							System.out.println("결과 : 계좌가 생성되었습니다.");
						} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							JDBCUtil.close(conn, pstmt);
						}
						break;
					}
				}//while 닫기
				break;
			}
		}//while 닫기
		
	}//createAccount() 닫기
	
	//계좌 목록 보기
	public void getAccountList(){
		System.out.println("-----------------------------------------------------");
	    System.out.println("2. 계좌 목록");
	    System.out.println("-----------------------------------------------------");
	    
	    ArrayList<Account> accountList = new ArrayList<>();
	    
	    conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {             //자료가 있다면 계속 반복
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				Account account = new Account(ano, owner, balance);
				accountList.add(account);
			}
			for(int i = 0; i < accountList.size(); i++) {
		    	Account account = accountList.get(i);
		    	System.out.print("계좌번호 : " + account.getAno() + "\t");
	    		System.out.print("계좌주 : " + account.getOwner() + "\t");
	    		System.out.printf("잔액 : %,d 원\n" , account.getBalance());
		    }
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
	}
	
	//예금
	public void deposit() {
		System.out.println("------------------------------------");
		System.out.println("예금");
		System.out.println("------------------------------------");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //찾는 계좌가 있다면
				Account account = findAccount(ano);
				System.out.print("예금액: ");
				int money = Integer.parseInt(scanner.nextLine());
				
				String owner = account.getOwner();
				int balance = account.getBalance() + money;  //잔액 = 잔액 + 입금액
				
				conn = JDBCUtil.getConnection();
				String sql = "UPDATE account SET owner = ?, balance = ?  WHERE ano = ? ";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, owner);
					pstmt.setInt(2, balance);
					pstmt.setString(3, ano);
					pstmt.executeUpdate();
					System.out.printf("%,d원 정상 입금되었습니다.\n", money);
					System.out.printf("현재 잔액은 %,d원입니다.\n", balance);
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				break;
			}else {
				System.out.println("결과 : 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//while 끝.
	}
	//계좌삭제
	public void delete() {
		System.out.println("------------------------------------");
		System.out.println("계좌삭제");
		System.out.println("------------------------------------");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //찾는 계좌가 있다면
						
				conn = JDBCUtil.getConnection();
				String sql = "DELETE FROM account WHERE ano = ? ";
				try {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, ano);
					pstmt.executeUpdate();
					System.out.printf("결과 : 계좌를 삭제했습니다.");
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					JDBCUtil.close(conn, pstmt);
				}
				break;
			}else {
				System.out.println("결과 : 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//while 끝.
	}
	//출금
	public void withdraw() {
		System.out.println("------------------------------------");
		System.out.println("출금");
		System.out.println("------------------------------------");
		
		while(true) {
			System.out.print("계좌번호: ");
			String ano = scanner.nextLine();
			
			if(findAccount(ano) != null) { //찾는 계좌가 있다면
				Account account = findAccount(ano);
				while(true) {
					System.out.print("출금액: ");
					int money = Integer.parseInt(scanner.nextLine());
					
					if(money > account.getBalance()) {
						System.out.println("잔액이 부족합니다. 다시 입력해 주세요.");
					}else {
						String owner = account.getOwner();
						int balance = account.getBalance() - money;  //잔액 = 잔액 - 입금액
						conn = JDBCUtil.getConnection();
						String sql = "UPDATE account SET owner = ?, balance = ?  WHERE ano = ? ";
						try {
							pstmt = conn.prepareStatement(sql);
							pstmt.setString(1, owner);
							pstmt.setInt(2, balance);
							pstmt.setString(3, ano);
							pstmt.executeUpdate();
							System.out.printf("%,d원 정상 출금되었습니다.\n", money);
							System.out.printf("현재 잔액은 %,d원입니다.\n", balance);
						} catch (SQLException e) {
							e.printStackTrace();
						} finally {
							JDBCUtil.close(conn, pstmt);
						}
						break;
					}
				}//내부 while 끝
				break;
			}else {
				System.out.println("결과 : 계좌가 없습니다. 다시 입력해 주세요");
			}
		}//외부 while 끝
	}
	
	//계좌 검색
	public Account findAccount(String ano) {
		Account account = null;
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM account WHERE ano = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return account;
	}
}
