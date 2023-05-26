package inheritance.Car;

class Taxi extends Car {

	int passengerCount;
	
	Taxi(String brand, int cc, int passengerCount) {
		super(brand, cc); //부모필드 상속
		this.passengerCount = passengerCount;
	}
	@Override //재정의(오버라이드
	String carInfo(){
	return super.carInfo()+ ", 승객수: " + passengerCount;
		
	}
	
}

public class TaxiTest{
	
		
	public static void main(String[] args) {
		
		Taxi taxi = new Taxi("Ionic 5", 3000, 1);
		System.out.println(taxi.carInfo());
	}

}
