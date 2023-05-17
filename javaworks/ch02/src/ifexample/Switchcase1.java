package ifexample;

public class Switchcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank =2;
		//char medalColor = " ";
		String medalColor = "Silver";
		
		switch(rank) {
		case 1:
			medalColor = "Gold";
			break;
		case 2:
			medalColor = "Silver";
			break;
		case 3:
			medalColor = "Bronze";
			break;
		default:
			medalColor = "None";
			break;
		}
		System.out.println("메달 색깔은" + medalColor + "입니다.");
	
	}

}
