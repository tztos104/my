package arrays;

public class Array2 {

	public static void main(String[] args) {
		// 문자열형 배열 선언 및 사용
		String[] cars = {"Morning", "Sonata", "Sportage", "K7"};
		
		//sonata를 검색하시오
		
		System.out.println(cars[1]);
		
		cars[3] = "BMW";
		
		
		for(int i=0; i<cars.length; i++) {
		System.out.println(cars[i]+" ");}
		
		for(String car : cars) {
			System.out.print(car+ " ");
		}
	}

}
