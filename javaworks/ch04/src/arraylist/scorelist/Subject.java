package arraylist.scorelist;

public class Subject {
	String subjectName; //과목이름
	int scorePoint;		//점수
	
	//생성자 생략
	
	//get(), set(0
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	
	public String getSubjectName() {
		return subjectName;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	
}
