package var;

public class FloatDoubleType {

	public static void main(String[] args) {
		/**
		* 실수 자료형 - float(4byte), double(8byte - 표준(더 많이 씀))
		* 소수점의 정밀도 차이(double이 더 정밀)
		* 소수점 7번째 자리 넘으면 float는 오류 발생 → double(16번째 자리) 사용
		* float는 끝에 'F', 'f'를 double은 끝에 'D', 'd'를 붙임
		*/
		float fNum = 1.23456789F;
		double dNum = 1.2345678901234567D;
		
		System.out.println(fNum);
		System.out.println(dNum);
	}

}
