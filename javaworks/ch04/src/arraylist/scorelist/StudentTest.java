package arraylist.scorelist;

public class StudentTest {

	public static void main(String[] args) {
		// 학생객체 생성
		Student park = new Student(1001, "박마늘");
		Student lee = new Student(1002, "이양파");
		Student lee2 = new Student(1003, "이영준");
		
		
		park.koreanSubject("국어", 90);
		park.mathSubject("수학", 80);
		park.showInfo();
		
		lee.koreanSubject("국어", 70);
		lee.mathSubject("수학", 80);
		lee.showInfo();
		
		lee2.koreanSubject("국어", 1000);
		lee2.mathSubject("수학", 1000);
		lee2.showInfo();
		
		

	}

}
