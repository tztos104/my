package var;

public class Variable {

	public static void main(String[] args) {
		// 변수 선언과 사용
		int grade; // 정수형 변수 grade 선언
		grade = 3; // grade 3을 할당
		
		String name = "한치수"; // 문자형 변수 name 선언과 동시에 "한치수" 할당 - 변수 이름은 숫자로 시작할 수 없음
		
		int schoolClass = 2; // 예약어(이미 사용되는 키워드)는 변수로 만들 수 없음
		
		// 코드 작성 과정 중 미리 알려주는 오류 컴파일 오류, 실제 Run한 뒤 나타나는 오류 실행오류
		System.out.println(grade + "학년 " + schoolClass + "반 " + name);
	}

}
