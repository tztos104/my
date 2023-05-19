package methods;

public class ArrayParam {

	public static void main(String[] args) {
		//더하기 기능 함수 호출
	//ArrayParam ap = new ArrayParam();
		
	int val =add(4, 5);
	System.out.println(val);

	int[] num = {1, 2, 3, 4};
	System.out.println(add(num));
	
	int[] result = add2(num);
	for(int i=0; i<result.length; i++) {
		System.out.println(result[i]+" ");
	}
	
	}
	// 더하기 기능이 있는 함수 매개변수로 변수 활용
	//더하기 기능이 있는 함수(static을 붙이는 이유-new로 객체를 생성하지 않음)- 정적 메모리 영역
	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int add(int[] value) {
		int sum =0;
		for(int i=0; i<value.length; i++) {
			sum+= value[i];
		}
		return sum ;
	}
	

	//매개변수로 배열을 사용
	public static int[] add2(int[] value) {
		int[] value2 = new int[4];
		for(int i =0; i<value.length; i++) {
			value2[i] = value[i]*2;
		}
		return value2;
	}
	
	
	
}
