package singleton.card;

public class CardTest {

	public static void main(String[] args) {
		
		CardCompany cardcompany = CardCompany.getInstance();
		
				
		Card BC = cardcompany.createCard();
		Card MB = cardcompany.createCard();
		
		System.out.println(BC.getCardNum());
		System.out.println(MB.getCardNum());
		
	}
	
	}


