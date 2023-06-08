package systems;

public class SystemTime {

	public static void main(String[] args) {
		// 수행시간 측정
		double start, end;
		start = System.currentTimeMillis();
		System.out.println(start);
		
		long sum =0;
		for(int i=1; i<1000000000; i++) {
			sum += i;
		}
		end = System.currentTimeMillis();
		System.out.println(sum);
		System.out.printf("계산에 소요된 시간 : %f 초",(end-start)/1000);
		
	}

}
