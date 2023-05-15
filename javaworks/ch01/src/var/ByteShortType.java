package var;

public class ByteShortType {

	public static void main(String[] args) {
		// byte형(-128 ~ 127)
		// short형(-32768 ~ 32767)
		byte bData1 = -128;
		// byte bData2 = 128; // 127까지 가능(0부터 이기 때문)
		
		short sData1 = 128;
		short sData2 = 32767;
		
		System.out.println(bData1);
		System.out.println(sData1);
		System.out.println(sData2);
	}

}
