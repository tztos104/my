package objectarray;

public class ShallowCopy {

		public static void main(String[] args) {
			//객체 배열의 복사
			Book[] array1 = new Book[3];
			Book[] array2 = new Book[3];
			
			array1[0]= new Book("반응형", "누구");
			array1[1]= new Book("혼자공부", "누구1");
			array1[2]= new Book("자바", "누구2");
			
			//array2는 기본 생성자로 생성
			array2[0]= new Book();
			array2[1]= new Book();
			array2[2]= new Book();
			
			//array1을  array2 복사 출력
			//for(int i=0; i<array2.length; i++) {
				//array2[i]= array1[i];
			//}
			for(int i=0; i<array2.length; i++) {
				array2[i].setBookName(array1[i].getBookName()); 
			}
			
			
			array2[0].setBookName("미생1");
			array2[0].setAuthor("윤태호");
			
			//array1 출력
			for(int i=0; i<array1.length; i++) {
				array1[i].bookInfo();
			}
			System.out.println("=======================");
			
			for(int i=0; i<array2.length; i++) {
				array2[i].bookInfo();
			}
			
		}
}
