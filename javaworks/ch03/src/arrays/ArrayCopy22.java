package arrays;

public class ArrayCopy22 {

	public static void main(String[] args) {

		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		
		//배열복사
		for( int i=0; i<arr2.length; i++) {
			arr2[i] = arr1[i];
			System.out.print(arr2[i]+ " ");
			
		}
		System.out.println();
		
		for( int i=0; i<arr2.length; i++) {
			arr3[i] = arr1[2-i];
			System.out.print(arr3[i]+ " ");
			
		}
		System.out.println();

	}

}
