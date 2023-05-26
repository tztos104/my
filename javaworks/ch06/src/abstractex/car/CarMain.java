package abstractex.car;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Bus();
		car.run();
		car.refuel();
		
		//다운 캐스팅(강제 형변환- instanceof)
		if(car instanceof Bus) {
			Bus bus = (Bus)car;
			bus.takePassenger();
		}

		Car car2 = new Truck();
		car2.run();
		car2.refuel();
		
		//다운 캐스팅(강제 형변환- instanceof)
		if(car2 instanceof Truck) {
			Truck truck = (Truck)car2;
			truck.load();
		}
				
		
		

	}

}
