package strings;

public class StringSubstring {

	public static void main(String[] args) {
		//substring(인수1, 인수2)- 인수1에서 시작해서 인수2 전까지 문자추출
		String ssn = "940608-2345678";
		
		String firstPart = ssn.substring(0, 6);
		System.out.println(firstPart);
	
		//substring(인수1) -인수1에서 끝까지 문자추출
		String secondPart = ssn.substring(7);
		System.out.println(secondPart);

		//url 경로 추출
		String uri = "/board/boardlist.jsp";
		int uri_idx = uri.lastIndexOf('/');
		System.out.println(uri.substring(uri_idx));
	}

}
