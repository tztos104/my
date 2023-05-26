package abstractex.animal;

public class Cat  extends Animal{
	
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("야옹!");
		
	}
	public void showInfo() {
		System.out.println("동물의 종류는 " + kind + "입니다.");
		
	}
	
	
}


