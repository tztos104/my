package operator;

public class Operator1 {

	public static void main(String[] args) {
		// 영어, 수학과목의 총점과 평균
		// 변수(입력)
		int engScore = 90;
		int mathScore =85;
		int totalScore;
		double avgScore; //실수형 8byte 자료형
		
		//총점과 평균 계산
		totalScore = engScore + mathScore;
		avgScore = (double)totalScore/2;
		
		//출력
		
		System.out.println("총점: "+ totalScore);	
		System.out.println("평균: "+ avgScore);
		
		
		int num = 10;
		int val = 0;
		val =num++; //계산 순서 1. num을 val에 저장 2.num= num+1 1증가10 11
		//val = ++num; //1.num=num+1 1증가, 2num을 val에 저장 11, 11
		
		System.out.println(val);
		System.out.println(num);
		
		
		
		
		
	}

}
