package product;

public class Product {
	private String[] productList = {"수박", "사과", "바나나", "키위", "봉숭아", "딸기", "방울토마토",
			"참외", "자몽","파인애플","토마토", "포도", "멜론", "자두", "두리안", "망고"};
	private int num1 =10;
	private int num2 =20;
	
	public String[] getProductList() {
		return productList;
	}
	public void setProductList(String[] productList) {
		this.productList = productList;
	}
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}
