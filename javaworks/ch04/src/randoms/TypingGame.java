package randoms;

import java.util.Scanner;

public class TypingGame {

	public static void main(String[] args) {
		// 타자게임 만들기
		
	String[] word = new String[10];
	String[] random = {"가","나","다","라","마","바","사","아","자","차",
			"카","타","파","하"};
	String ex ="";
	while()
	int n2=(int)(Math.random()*15);
	ex += random[n2];
	/*
	for(int i=0; i<10; i++) {
		//int n = (int)(Math.random()*5)+1;
		for(int j=0; j<5; j++) {
			int n2=(int)(Math.random()*15);
			ex += random[n2];
			word[i]=ex;
			
			}
				
		}*/
	
		for(int i= 0; i<word.length; i++) {
			System.out.println(word);}
	
	
	
	
	
	
	
	int num = 1; //문제번호
	double start, end;
	Scanner scan = new Scanner(System.in);
	
	System.out.println("영어타자 게임!, 준비되면 엔터");
	scan.nextLine();
	start =System.currentTimeMillis(); //게임시작
	while(num<11) {
		int n2=(int)(Math.random()*word.length);
		System.out.println("문제"+num);
		String que = word[n2];
		String answer = scan.nextLine();
		if(answer.equals(que)) {
			System.out.println("통과");
			num++;
		}else {
			System.out.println("오타! 다시 입력");
		}
	}
	end =System.currentTimeMillis(); //게임종료
	System.out.printf("게임 소요 시간은 %.2f초 입니다.",(end-start)/1000);
	scan.close();
	
	}

}
