package statics;

public class Student {

	private static int serialNum = 1000; //기준번호
	private int studentid; //학번
	private String name;   //이름
	
	Student(){
		serialNum++; //1증가
		studentid =serialNum; //증가된 번호를 학번에 대입
	}
	
	
	void setStudentId(int studentid) {
		this.studentid = studentid;
	}
	
	int getStudentId() {
	return studentid;}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
}

