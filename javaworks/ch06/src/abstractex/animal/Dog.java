package abstractex.animal;

public class Dog  extends Animal{
	
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍멍멍!");
		
	}
	public void showInfo() {
		System.out.println("동물의 종류는 " + kind + "입니다.");
		
	}
	
	
}


