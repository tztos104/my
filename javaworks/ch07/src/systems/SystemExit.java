package systems;

public class SystemExit {

		public static void main(String[ ] args) {
			
			for(int i= 1; i<=10; i++ ) {
				if(i == 5) 
					//break; //for문만 멈춤
					System.exit(0); //메인 함수에서 빠져나옴 0은 정상종료
					//return; //메인함수에서 빠져남옴
					System.out.println(i);
							
			}
			System.out.println("반복종료");
		}
}
