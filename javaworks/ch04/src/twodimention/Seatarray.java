package twodimention;

import java.util.Scanner;

public class Seatarray {

	public static void main(String[] args) {
		// 입장객 수에 따른 열과 줄수 계산하기
		Scanner sc = new Scanner(System.in);
		int customer;
		int colNum= 0;
		int rowNum= 0;
		
				
				System.out.print("입장객 수 입력 : ");
				customer = sc.nextInt();
				
				System.out.print("좌석 열 수 입력: ");
				colNum =sc.nextInt();
				
				if (customer % colNum == 0) {
					rowNum = customer/colNum;
				}else {rowNum = (int)(customer/colNum)+1;
					
				}
				
				int [][] arr = new int[rowNum][colNum];
				for(int i =0; i<rowNum;i++) {
					for(int j =0; j<colNum; j++ ) {
						arr[i][j] = (colNum*i)+(j+1);
						if( arr[i][j] > customer)
							break;
						
						System.out.print("좌석"+ arr[i][j] + " ");
					}
					System.out.println();
				}
				
				
				System.out.println(rowNum);
				sc.close();
	}
	
	

}
