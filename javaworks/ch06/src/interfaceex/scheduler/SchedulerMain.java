package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerMain {

	public static void main(String[] args) throws IOException {
		
		System.out.println("전화 상담 배분 방식을 선택하세요");
		System.out.println("R: 한명씩 차례로 배분");
		System.out.println("L: 현재 상담 업무가 없거나 개기가 가장 적은 상담원에게 배분합니다.");
		
		int ch = System.in.read(); //반환값이 int이므로 char를 쓰지 않음
		Scheduler scheduler = null;
		
		if(ch =='R' || ch =='r') {
			scheduler = new RoundRobin();
		}else if(ch == 'L'|| ch =='l') {
			scheduler = new LeastJop();
		}else if(ch == 'P'|| ch =='p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
				
		scheduler.getNextCall();//중복을 줄이는 효과
		scheduler.sendCallToAgent();
		
		
	}

}
