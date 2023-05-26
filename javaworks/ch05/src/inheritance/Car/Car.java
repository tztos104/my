package inheritance.Car;

public class Car {
	String brand;
	int cc;
	
	Car(String brand, int cc){
		this.brand = brand;
		this.cc = cc;
	}
	
	 
	String carInfo() {
	return "브랜드:"+brand +", 배기량" + cc;
	
}
	
}
