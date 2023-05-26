package fruits;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
System.out.println("1.포도 | 2.바나나 | 3.복숭아");
System.out.println("선택>");
	int menu = Integer.parseInt(scan.nextLine());
	Fruit fruit = null;
	if(menu == 1) {
		 fruit = new Grape();
		
	}else if(menu ==2) {
		 fruit = new Banana();
	
	}else if(menu ==3) {
		 fruit = new Peach();
		
	}
	fruit.showInfo();
	scan.close();
}}
