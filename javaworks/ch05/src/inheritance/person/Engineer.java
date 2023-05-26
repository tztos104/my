package inheritance.person;

public class Engineer extends Person {
	//필드
	int companyId;
	
	public static void main(String[] args) {
		Engineer eng = new Engineer();
		eng.name ="봉구";
		eng.age =27;
		eng.companyId =256;
	}

}
