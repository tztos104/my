package singleton.car;

public class CarFactory {

	private static CarFactory instance;
	
	private CarFactory() {
		
	}
	 // getInstance() 메서드
	   // static = new안쓰기 위해 적는 것
	   public static CarFactory getInstance() {
	      if(instance == null) {
	         instance = new CarFactory();
	      }
	      return instance;
	   }
	   //자동차 생산
	   public Car createCar() {
		   Car car = new Car();
		   return car;
	   }

}

