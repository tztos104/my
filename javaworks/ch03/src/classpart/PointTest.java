package classpart;

public class PointTest {

	public static void main(String[] args) {
		// point 클래스의 객체 생성
		Point point = new Point(3, 4);
		Point point2 = new Point(10, 15);
		//point.x =3;
		//point.y =4; 직접 맴법 변수에
		
		System.out.println("점(" + point.x +", "+ point.y+ ")");
		System.out.println("점(" + point2.x +", "+ point2.y+ ")");

	}

}
