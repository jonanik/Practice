import java.util.ArrayList;

public class CardGame {

	public static void main(String[] args) {
		ArrayList<Deck> cardDeck=new ArrayList<Deck>();
		ArrayList<Deck> shuffleDeck=new ArrayList<Deck>();
		ArrayList<Deck> p1Card=new ArrayList<Deck>();
		ArrayList<Deck> p2Card=new ArrayList<Deck>();
		ThingsNeeded n=new ExcuteNeeds();
		
	while(true) {
		switch (n.main()) {
		case "1": //카드준비
			n.makeCard(cardDeck);
			break;	
		case "2": //카드섞기
			n.shuffle(cardDeck, shuffleDeck);
			break;	
		case "3": //카드보기
			n.showCard(cardDeck, shuffleDeck);
			break;	
		case "4": //p1에게 카드한장
			n.cardForp1(shuffleDeck, p1Card);
			break;	
		case "5": //p2에게 카드한장
			n.cardForp2(shuffleDeck, p2Card);
			break;	
		case "6": //플레이어 카드 확인하기
			n.checkResult(p1Card, p2Card);
			break;	
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}
		
		
//		n.showCard(cardDeck, shuffleDeck);
//		for(int i=0; i<cardDeck.size();i++) {
//			System.out.println(cardDeck.get(i));
//		}
	}

}
