package arrays;

public class Array1 {

	public static void main(String[] args) {
		// 정수 5개를 저장할 배열 선언
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;

		System.out.println("배열의 길이(크기): " + arr.length);
		System.out.println(arr[0]);
		
		arr[2] = 7;
		
		for(int i=0; i<5; i++) {
			System.out.print(arr[i]+"");
		}
		int[] arr2 = {2, 4, 6, 8, 10};
		arr2[4] = 100;
		
	}

}
