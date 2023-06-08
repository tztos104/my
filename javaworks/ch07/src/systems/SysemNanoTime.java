package systems;

public class SysemNanoTime {

	public static void main(String[] args) {
	
		double start, end;
		start = System.nanoTime();
		
		long sum = 0;
		for(long i = 1 ; i <1999999999; i++) {
			sum += i;
		}
		end= System.nanoTime();
		System.out.println(sum);
		System.out.printf("계산에 소요된 시간 %f나노초", (end-start));
		System.out.printf("계산에 소요된 시간 %f초", (end-start)/1000000000);

	}

}
