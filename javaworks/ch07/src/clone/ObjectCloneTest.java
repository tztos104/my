package clone;

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(3, 4, 5);
		
		Circle copyCircle= (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
	}

}
