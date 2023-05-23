package statics;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 객체 생성(lee-힙 메모리영역 위치)
		Student lee = new Student();
		
		lee.setStudentId(1001);
		lee.setName("이대한");
		

		System.out.println("학번: " + lee.getStudentId());
		System.out.println("이름: " + lee.getName());
	}

}
