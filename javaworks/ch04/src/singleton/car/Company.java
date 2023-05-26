package singleton.car;

public class Company {
	//싱글톤 패턴으로 작성
	//유일하게 생성된 인스턴스
	private static Company instance = new Company();
	
	//기본 생성자
	private Company() {
		
	}
	
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
	
}
