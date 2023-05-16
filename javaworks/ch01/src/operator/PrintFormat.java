package operator;

public class PrintFormat {

	public static void main(String[] args) {
		// print("문자열 포맷", 객체) 함수
		
		
		int year = 2022;
		System.out.println("올해는" + year + "년 입니다.");
		System.out.printf("올해는 %d년 입니다", year);
		System.out.println();
		
		String nick ="얼음공주";
		System.out.printf("그녀의 별명은 %s입니다.", nick);				
		System.out.println("\n------------------------");
		
		String table = "";
		table += "--------------------\n";
		table += "이름\t나이\t나라\n";
		table += "강감찬\t82\t고려\n";
		table += "이순신\t53\t조선\n";
		table += "--------------------\n";
		System.out.println(table);
		
		
		
	}

}
