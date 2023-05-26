package taketrans;

public class Person {

	
	String name;
	int age;
	int money;
	
	Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	//를 타는 기능을 하는 메서드
	void takeBus(Bus bus) {
		bus.take(1300);
		this.money -= 1300;
	}
	
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d입니다.\n", name, money);
	}
	
	
	//void.takeBus();
	//void showInfo();
	
	
	
	
	
	
}
