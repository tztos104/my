package objectarray;

public class Book {

		String bookName;
		String author;
		
		public Book(){};
		public Book(String bookName, String author){
			this.bookName =bookName;
			this.author = author;
		}
		
		public void bookInfo() {
			System.out.println(bookName + ", " + author);
		}
		
		public void setBookName(String bookName) {
			this.bookName=bookName;
		}
		public void setAuthor(String author) {
			this.author=author;
		}
		public String getAuthor() {
			return author;
		}
		public String getBookName() {
			return bookName;
		}
}
