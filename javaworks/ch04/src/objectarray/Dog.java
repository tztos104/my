package objectarray;

public class Dog {

	private String dogName;
	private String type;
	
	public Dog() {}	
		
	//강아지 이름을 설정하는 매세드
	public void setDogName(String dogName) {
		this.dogName=dogName;
	}
	public String getDogName() {
		return dogName;
		
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
}
