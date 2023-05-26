package abstractex.animal;

public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("동물이 숨을 쉽니다.");
	}
	public void showInfo() {
		System.out.println("동물의 종류는 " + kind + "입니다.");
	}
		
	//추상 메서드
	//상속바는
	public abstract void sound();
}
