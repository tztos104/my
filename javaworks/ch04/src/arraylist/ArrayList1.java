package arraylist;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		//기본 10개의 저장공간이 생성 
		ArrayList<String> cartList = new ArrayList<>();
		
		//자료저장 - add()함수
		cartList.add("계란");
		cartList.add("콩나물");
		cartList.add("두부");
		cartList.add("커피");
		
		
		//특정 1개 요소 가져오기(검색)
		System.out.println(cartList.get(0));
		System.out.println(cartList.get(1));
		
		//cartList의 크기
		System.out.println(cartList.size()+"개");
		
		//전체요소 출력
		for(int i=0; i <cartList.size(); i++) {
			String cart = cartList.get(i);
			System.out.println(cart);
		}
		System.out.println("======================");
		
		//요소 수정 -set()
		cartList.set(0, "라면");
		
		//요소 삭제
		//contains() -객체를 포함하다. 인덱스가 없으면 예외 발생되므로 사용권장
		if(cartList.contains(cartList.get(2)))
			cartList.remove(2);
		cartList.remove("커피");
		
		
		for(String cart : cartList)
			System.out.println(cart);
		
		
	}

}
