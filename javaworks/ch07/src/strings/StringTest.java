package strings;

public class StringTest {

	public static void main(String[] args) {

		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값: "+ System.identityHashCode(javaStr));
		
		System.out.println(androidStr);
		System.out.println("처음 문자열 주소값: "+ System.identityHashCode(androidStr));
		
		//문자열 연결
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("연산 후 주소값: " + System.identityHashCode(javaStr));
		

	}

}
