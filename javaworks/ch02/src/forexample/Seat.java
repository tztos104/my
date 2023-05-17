package forexample;

import java.util.Scanner;

public class Seat {

	public static void main(String[] args) {
		// 입장객 수에 따른 열과 줄수 계산하기
		Scanner sc = new Scanner(System.in);
		int customer;
		int colNum;
		int rowNum;
				
				System.out.print("입장객 수 입력 : ");
				customer = sc.nextInt();
				
				System.out.print("좌석 열 수 입력: ");
				colNum =sc.nextInt();
				
				if (customer % colNum == 0) {
					rowNum = customer/colNum;
				}else {rowNum = (int)(customer/colNum)+1;
					
				}
				
				for(int i =0; i<rowNum;i++) {
					for(int j =1; j<=colNum; j++ ) {
						int num= colNum*i+j;
						if(num > customer)
							break;
						System.out.println("좌석"+ num + " ");
					}
					System.out.println();
				}
				
				
				System.out.println(rowNum);
				sc.close();
	}
	
	

}
