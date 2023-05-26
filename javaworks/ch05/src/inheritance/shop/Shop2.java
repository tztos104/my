package inheritance.shop;

public class Shop2 extends HeadShop {
//생성자
	public Shop2() {
		System.out.println("역세권 매장입니다.");
	}
	@Override
	public void sellDoenjangJJige() {
		System.out.println("된장찌게: 8,500원");
		
	}
	@Override
	public void sellKimchiJJige() {
		System.out.println("김피찌게: 9,500원");
		
	}
	@Override
	public void sellBimbimBap() {
		System.out.println("비빔밥: 6,500원");
		
	}
	

		

}
