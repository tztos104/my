package singleton.card;

public class CardCompany {

	private static CardCompany instance;
	
	private CardCompany() {
		
	}
	 // getInstance() 메서드
	   // static = new안쓰기 위해 적는 것
	   public static CardCompany getInstance() {
	      if(instance == null) {
	         instance = new CardCompany();
	      }
	      return instance;
	   }
	   //자동차 생산
	   public Card createCard() {
		   Card card = new Card();
		   return card;
	   }
	}

