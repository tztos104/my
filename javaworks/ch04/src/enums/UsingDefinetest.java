package enums;

public class UsingDefinetest {

	public static void main(String[] args) {
		// 상수 사용하기
		
		int maxV = UsingDefine.MAX_NUM;
		
		//지구의 반지름과 표면적
		System.out.println(UsingDefine.EARTH_RADIUS+ "km");
		
		System.out.println("최대값: "+ maxV);
		System.out.println("최소값: "+ UsingDefine.MIN_NUM);

	}

}
