package subway;

public class Subway {

	String Subwayline;
	int passenger;
	int money;
	
	//생성자
	Subway(String Subwayline){
		this.Subwayline = Subwayline;
	}
	
	//사람을 태우는 기능을 하는매서드
	void take(int money) {
		this.money += money;
		passenger++;
		
	}
	//버스의 정보
	void showInfo() {
		System.out.printf("%s지점 서브웨이 수입은 %d원이고, "+ "손님수는 %d명입니다.",Subwayline, money, passenger);
	}
	
}
