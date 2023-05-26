package inheritance.airplane;

public class AirPlaneMain {

	public static void main(String[] args) {
	//supersonicairplane 객체생성
	SuperSonicAirPlane sa = new SuperSonicAirPlane();
	
	sa.takeOff();
	sa.fly();
	
	sa.flyMode = SuperSonicAirPlane.SUPERSONIC;
	sa.fly();
	sa.flyMode = SuperSonicAirPlane.NORMAL;
	sa.fly();
	
	sa.land();
	
	
		
	}

}
