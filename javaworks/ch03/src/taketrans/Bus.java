package taketrans;

public class Bus {

	int busNumber;
	int passenger;
	int money;
	
	//생성자
	Bus(int busNumber){
		this.busNumber = busNumber;
	}
	
	//사람을 태우는 기능을 하는매서드
	void take(int money) {
		this.money += money;
		passenger++;
		
	}
	//버스의 정보
	void showInfo() {
		System.out.printf("%d번 버스의 수입은 %d원이고, "+ "승객수는 %d명입니다.",busNumber, money, passenger);
	}
	
}
