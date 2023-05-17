package forexample;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumV = 0;
		for(int i = 1; i<=10; i++){
			sumV += i;
			System.out.println("i=" + i + ", sum=" + sumV);
		}
		System.out.println("합계" + sumV);
		
		char ch = 65;
		for(ch =65; ch < 123; ch++) {
		System.out.print(ch + " ");
		}
		System.out.println();
		for(ch =12593; ch < 12686; ch++) {
			System.out.print(ch + " ");
		}
		//구구단
		System.out.println();
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("몇단? ");
		int dan = sc.nextInt();
				
		for(int i=1; i<10; i++) {
			System.out.print(dan+"x" +i +"=" +(dan*i)+" ");
		}
		
	}

}
