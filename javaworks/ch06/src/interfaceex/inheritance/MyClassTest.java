package interfaceex.inheritance;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		//부모형으로 객체 할당(자동 형변환)
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		
		MyInterface iClass = myClass;
		iClass.x();
		iClass.y();
		iClass.myMethod();

	}

}
