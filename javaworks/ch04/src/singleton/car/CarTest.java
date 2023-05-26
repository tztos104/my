package singleton.car;

public class CarTest {
	public static void main(String[] args) {
		//자동차 공장 객체 생성
		CarFactory company = CarFactory.getInstance();
		
				
		Car mySonata = company.createCar();
		Car yourSonata =company.createCar();
		
		System.out.println(mySonata.getCarNum());
		System.out.println(yourSonata.getCarNum());
		
	}
	
}
