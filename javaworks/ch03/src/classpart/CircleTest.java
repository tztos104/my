package classpart;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 =new Circle(3, 4, 10);
		Circle c2 =new Circle(10, 15, 20);
		
		c1.showInfo();
		c2.showInfo();
		
		//System.out.printf("원의 중심은 (%d, %d)이고, 반지름은 %dcm입니다.\n",
				//c1.center.x , c1.center.y, c1.radius);
		//System.out.printf("원의 중심은 (%d, %d)이고, 반지름은 %dcm입니다.\n",
				//c2.center.x , c2.center.y, c2.radius);

	}

}
