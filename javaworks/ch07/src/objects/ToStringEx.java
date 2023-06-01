package objects;

public class ToStringEx {

	public static void main(String[] args) {

			//String name ="강하늘";
			String name = new String("강하늘");
			
			System.out.println(name);	
			System.out.println(name.toString());
			System.out.println("=======================");
			
			Book book = new Book(1, "혼공 자바");
			System.out.println(book);
			System.out.println(book.toString());
			
	}

}
