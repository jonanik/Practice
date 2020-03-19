import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Card> cardDeck = new ArrayList<Card>();
		
		NeedMaking n = new Excute();
		while (true) {
			switch (n.main()) {
			case 1:
				n.makingCardDeck(cardDeck);
				break;
			case 2:
				n.shuffleCardDeck(cardDeck);
				break;
			case 3:
				n.showCardDeck(cardDeck);
				break;

			}
		}

	}

}
