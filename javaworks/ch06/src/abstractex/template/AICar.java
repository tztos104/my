package abstractex.template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
	}

	@Override
	public void stop() {
		System.out.println("차가 스스로 멈춥니다.");
	}
	
	
	
	/* run()을 재정의 할수 없다.
	public void run() {
		
	}*/
	
	
}
