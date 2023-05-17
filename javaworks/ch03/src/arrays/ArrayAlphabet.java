package arrays;

public class ArrayAlphabet {

	public static void main(String[] args) {
		// 1~10까지 저장하는 배열
		//numbers 배열, 객체 -> 힙메모리
		int[] numbers = new int[10];
		
		for(int i = 0; i <numbers.length; i++) {
			numbers[i] = i + 1;
			System.out.print(numbers[i]+"");
		}
		
		char[] alphabets = new char[26];
		char ch = 'A';
		
		//alphabets[0]= ch;
		//alphabets[1]= (char) (ch+ 1);// char형으로 강제 형변환
		
				
		
		for(int i = 0; i<alphabets.length; i++) {
			alphabets[i]= ch;
			//ch= (char) (ch+1);
			ch++;
			System.out.print(alphabets[i]+", " + (int)alphabets[i]);
		}

	}

}
