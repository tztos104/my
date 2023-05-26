package interfaceex.remocon;

public class Television implements RemoteControl{
	//필드
	private int volume;
	

	@Override
	public void turnOn() {
		System.out.println("tv가 켜집니다");
	}

	@Override
	public void turnOff() {
		System.out.println("tv가 꺼집니다");
	}

	@Override
	public void setVolume(int volume) {
		this.volume= volume;
		System.out.println("현재 볼륨은"+volume +"입니다");
	}
	

}
