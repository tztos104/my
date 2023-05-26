package transport;

public class Person {

	
	String name;
	int age;
	int money;
	
	Person(String name, int money){
		this.name = name;
		this.money = money;
	}
	
	//요금를 내고 타는 기능을 하는 메서드
	//Vehicle vehicle -> 상속과 다형성 이용
	public void take(Vehicle vehicle, int fee) {
		vehicle.carry(fee);
		this.money -= fee; //가진돈에서 요금만큼 차감
	}
	
	void showInfo() {
		System.out.printf("%s님의 남은 돈은 %d입니다.\n", name, money);
	}
	
	
	//void.takeBus();
	//void showInfo();
	
	
	
	
	
	
}
