package objectarray;

public class BookMain {

	public static void main(String[] args) {
		// book 객체 생성 - 책 5권
		Book[] library = new Book[5];
		
		//System.out.println(library[0]);
		//배열의 자료가 없는 경우 - null
		for(int i=0; i<library.length; i++ ) {
			System.out.println(library[i]);
		}
		
		//자료저장
		library[0]= new Book("반응형", "누구");
		library[1]= new Book("혼자공부", "누구1");
		library[2]= new Book("자바", "누구2");
		library[3]= new Book("파이썬", "누구3");
		library[4]= new Book("스크립트", "누구4");
		
		
		
		
		for(Book book : library) {
			//book 객체가 null이 아니면 출력
			if(book != null) {
				book.bookInfo();
			}
		}
		
		
		
		

	}

}
