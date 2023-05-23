package statics;

public class Card {

	static int serialNum = 100;
	int cardNum; //카드번호
	
	Card(){
		serialNum++;
		cardNum=serialNum;
	}
	//카드번호를 가져오는 함수 정의
	int getCardNum() {
		return cardNum;
	}
	
}
