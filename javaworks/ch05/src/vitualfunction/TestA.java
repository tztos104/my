package vitualfunction;

import java.util.Stack;

public class TestA {
	int num;
	
	void aaa() {System.out.println("aaa() 출력 ");}
	
	


		public  static void main(String[] args){
			//인스턴스(객체) -힙메모리
			//메서드 - 정전영겨 (데이터 영역)-static
			TestA a1 = new TestA();
			a1.num = 10;
			a1.aaa();
			TestA a2 = new TestA();
			a2.num = 30;
			a2.aaa();
			
		}
		}


