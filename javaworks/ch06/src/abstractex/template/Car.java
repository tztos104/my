package abstractex.template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOFF() {
		System.out.println("시동을 끕니다.");
	}
	//템플릿 메서드 정의
	//final 이 있으므로 상속 받은 클래스에서 메서드를 재정의 할 수 없음.
	public final void run() {
		startCar();
		drive();
		stop();
		turnOFF();
	}

}
