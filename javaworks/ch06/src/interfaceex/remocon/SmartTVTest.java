package interfaceex.remocon;

public class SmartTVTest {

	public static void main(String[] args) {
		//smartTV 객체 생성
		SmartTV stv = new SmartTV();
		
		stv.turnOn();
		stv.search("www.naver.com");
		stv.setVolume(8);
		RemoteControl.changeBattery();
		stv.turnOff();
		
		
		System.out.println("***********************");
		
		//부모형으로 형변환
		RemoteControl rc = stv;
		Searchable searchable = stv;
		
		
		rc.turnOn();
		searchable.search("www.naver.com");
		RemoteControl.changeBattery();
		rc.turnOff();
		
	}

}
