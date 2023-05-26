package inheritance.airplane;

public class SuperSonicAirPlane extends AirPlane{
	//비행모드 1. 일반비행, 2-초음속 비행
	static final int NORMAL = 1;
	static final int SUPERSONIC = 2;
	
	int flyMode =1 ;
	
	@Override //매서드 재정의
	public void fly() {
		//조건문 - 비핼기가 초음속비행합니다.
		if(flyMode== SUPERSONIC) {
			System.out.println("비행기가 초음속 비행합니다.");
		}else {
			
			super.fly();//비행기가 비행합니다.
		}
		
	}

}
