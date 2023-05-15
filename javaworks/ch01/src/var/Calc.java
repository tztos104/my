package var;

public class Calc {

	public static void main(String[] args) {
		// 두 수의 합과 차, 곱, 나눗셈
		int x = 10, y = 20;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		// 정수 연산: 결과 - 정수로 나옴 → 실수 연산(자료형을 실수로 바꿔야 함)
		// 실수 연산: double형으로 변환(기본적으로 double을 씀, float도 가능하지만 더 작은 자료형)
		System.out.println((double)x / (double)y);
	}

}
