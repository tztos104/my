package shelf;

public class BookShelfTest {

	public static void main(String[] args) {
		//BookShelf의 객체 생성
		BookShelf bookShelf = new BookShelf();
		
		bookShelf.enQueue("반응형 웹");
		bookShelf.enQueue("혼공 자바");
		
		//리스트 요소의 개수
		System.out.println(bookShelf.getSize() +" 권");

		//자료출력
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());

	}

}
