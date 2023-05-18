package methods;

class MethodEx{
	public void sayHello() {
		System.out.println("Hello~");
}
	
	//이름이 매개 변수인 sayHello()함수 작성
	public void sayHello2(String name) {
		System.out.println("Hello~"+name);
	}
	
	public int add(int x ,int y) {
		return x+y;
	}
}

public class Methodtest {
	public static void main(String[] args) {
		//객체(클래스에서 만드는 인스턴스)- 메모리에 로딩
		
		
		
		MethodEx method = new MethodEx();
				method.sayHello();
				
				method.sayHello2("이강");		
		int value = method.add(10, 20);
		System.out.println(value);

		
		
	}}


