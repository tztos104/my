package forexample;

public class NestedFor {

	public static void main(String[] args) {
		// 중첩 for문
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
