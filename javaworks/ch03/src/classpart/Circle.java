package classpart;

public class Circle {
	Point center;
	
	int radius;
	//생성자(public private이 없는 경우 default 값)
	//default는 다른패키지에 사용못함
	//public은 외부 클래스 어디에서나 사용가능
	
	
	public Circle(int x, int y, int radius) {
		center = new Point(x, y); //중심점 생성
		this.radius = radius;		//반지름
		
				
	}
	//원의 정보 출력 메서드
	public void showInfo() {
		System.out.printf("원의 중심은 (%d, %d)이고,반지름은 %dcm입니다.\n", 
				center.x, center.y, radius);
	}
	
}
