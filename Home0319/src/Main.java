import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Card> cardDeck = new ArrayList<Card>();
		ArrayList<Card> p1=new ArrayList<Card>();
		ArrayList<Card> p2=new ArrayList<Card>();
		NeedMaking n = new Excute();
		while (true) {
			switch (n.main()) {
			case 1:
				n.makingCardDeck(cardDeck);
				break;
			case 2:
				n.shuffleCardDeck(cardDeck,p1,p2);
				break;
				
			case 3:
				n.showCardDeck(cardDeck,p1,p2);
				break;
			case 4:
				n.giveCard(cardDeck, p1, p2);
				break;
			default:
				
			System.out.println("잘못된 입력입니다.시스템을 종료합니다.");
			System.exit(0);
				break;
			}
		}

	}

}
