package interfaceex.tire;

public class Car {
	//필드 - 부모형으로 형변환
	Tire frontLefeTire = new HanTire();
	Tire frontRightTire = new HanTire();
	Tire backLeftTire = new KumTire();
	Tire backRightTire = new KumTire();
	
	//매서드
	public void run() {
		frontLefeTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();	
	}
	
	
}//class car 끝
