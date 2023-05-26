package chapter04;

public class Test4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int sum = 0 ;
		for(int i=1; i<101; i++) {
			if(i % 3==0) {
			sum += i;
		
		}
		System.out.println(sum);
	   }*/
	
	
	
	while(true){
		int n1= (int)(Math.random()*6)+1;
		int n2= (int)(Math.random()*6)+1;
		System.out.println("n1:"+n1+ ",n2:"+n2);	
		if(n1+n2 == 5) {
			break;
		}
		}
	
	
	 for(int i=1; i<=10; i++) {
		 for(int j=1; j<=10; j++) {
			 if(4*i+5*j == 60) {
			System.out.println("x:"+i+ ",y:"+j);	 
			 }
		 }
	 }
	
	 for(int i=0; i<5; i++) {
		 for(int j=0; j<i; j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
	 
	 
	 
	
	}
	}
	
		
	



