package subway;

public class Person {

	
	String name;
	int age;
	int money;
	
	public Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	//버스를 타는 기능을 하는 메서드
	public void takeSub(Subway Sub) {
		Sub.take(1300);
		this.money -= 1300;
	}
	
	public void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d입니다.\n", name, money);
	}
	
	
	//void.takeBus();
	//void showInfo();
	
	
	
	
	
	
}
