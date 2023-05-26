package inheritance.shop;

public class ShopMain {

	public static void main(String[] args) {
		// Shop1 의 객체 생성
		Shop1 shop1 = new Shop1();
		
		shop1.sellDoenjangJJige();
		shop1.sellBimbimBap();
		shop1.sellKimchiJJige();
		
		System.out.println("=========================");
		//부모 클래스의 타입으로 객체 생성
		HeadShop shop2 = new Shop2();
		shop2.sellBimbimBap();
		shop2.sellDoenjangJJige();
		shop2.sellKimchiJJige();
		//형변환
		int iNum = 10;
		float fNum = iNum; //자동 형변환
		System.out.println(fNum);
		
		iNum = (int)fNum;//강제 형변환
		System.out.println(iNum);
	}

}