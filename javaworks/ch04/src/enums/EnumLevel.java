package enums;

enum Level{//열거형 상수
	LOW,
	MEDIUM,
	HIGH
}

public class EnumLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Level level = Level.HIGH;
		
		switch(level) {
		case LOW:System.out.println("레벨이 초보");break;
		case MEDIUM:System.out.println("레벨이 중수");break;
		case HIGH:System.out.println("레벨이 고수");break;
		default:System.out.println("신입");
		
		
		}
		
	}

}
