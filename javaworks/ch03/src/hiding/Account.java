package hiding;

public class Account {

	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano =ano;
		this.owner =owner;
		this.balance = balance;
				
	}
	//get() 메서드 : get + 맴버변수이름()
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	public void setOwner(String owner) {
		this.owner = owner;
			}
	public String getOwner() {
		return owner;
			}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
			}
	
	
	
}
