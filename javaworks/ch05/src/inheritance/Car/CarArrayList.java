package inheritance.Car;

import java.util.ArrayList;




public class CarArrayList{
		

	public static void main(String[] args) {
		
			//자동차 3대 생성- ArrayList에 저장
		ArrayList<Car> CarArrayList = new ArrayList<>();
		
	
		Car car1 = new Car("카니발", 6000);
		Car car2 = new Car("큐엠", 3000);
		Car car3 = new Car("바보", 16000);
		
		CarArrayList.add(car1);
		CarArrayList.add(car2);
		CarArrayList.add(car3);
		
		System.out.println(CarArrayList.get(1).carInfo());
		
		//전체 요소 출력
		for(int i=0; i<CarArrayList.size(); i++) {
			Car car = CarArrayList.get(i);
			System.out.println(car.carInfo());
		}
		
	
		
		
	}

}
