package forexample;

public class Gugudan {

	public static void main(String[] args) {
		// 전체 구구단 출력
		for(int i=2; i <10; i++) {
			for(int j =1; j<i+1; j++) {
				
				System.out.println(i+ "x"+ j+ "=" + (i*j));
			}
			System.out.println();
		}

	}

}
