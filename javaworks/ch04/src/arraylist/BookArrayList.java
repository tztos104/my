package arraylist;

import java.util.ArrayList;

import objectarray.Book;

public class BookArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bookList = new ArrayList<>();
		
		Book book1 = new Book("반응","누구");
		Book book2 = new Book("목캔디","맛있다.");
		Book book3 = new Book("시나공","어려워.");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		
		System.out.println(bookList.get(0));//객체의 메모리 주소
		bookList.get(0).bookInfo();
		
		System.out.println(bookList.size()+"개");
		
		//전체 요소 출력
		for(int i = 0; i<bookList.size(); i++) {
			Book book = bookList.get(i);
			book.bookInfo();
			
		}
		//book2 삭제
		if(bookList.contains(book3)) {
			bookList.remove(book3);
		}
		
		for(Book book : bookList) 
			book.bookInfo();
			
		
		
		
	}

}
