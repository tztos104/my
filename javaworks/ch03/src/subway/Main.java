package subway;

public class Main {

	public static void main(String[] args) {
		// 사람객체생성
		Person inbi = new Person("박인비", 10000);
		Person nara = new Person("이나라", 5000);
		
		Subway sub강남 = new Subway("강남");
		
		inbi.takeSub(sub강남);
		nara.takeSub(sub강남);
		
		inbi.showInfo();
		nara.showInfo();
		sub강남.showInfo();
		

	}

}
