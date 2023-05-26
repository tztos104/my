package exception;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException
		try {
		int[] num = new int[3];
		
		num[0] = 1;
		num[1] = 1;
		num[2] = 1;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위가 잘못되었습니다.");
		}
		System.out.println("done");
		
		}

}
