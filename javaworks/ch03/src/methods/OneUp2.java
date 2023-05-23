package methods;

public class OneUp2 {
	
	static int x = 0; //static이 붙은 x는 정적 변수
	
	public static int oneUp() {
		x= x+1;
		return x;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(oneUp());
		System.out.println(oneUp());
	}

}
