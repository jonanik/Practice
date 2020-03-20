
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Card> cardDeck = new ArrayList<Card>();

		ArrayList<Card> p1 = new ArrayList<Card>();
		ArrayList<Card> p2 = new ArrayList<Card>();

		NeededThings n = new Excute();

		while (true) {
			switch (n.main()) {
			case 1:
				n.makeCard(cardDeck,p1, p2);
				
				break;
			case 2:
				n.shuffleCard(cardDeck);

				break;

			case 3:
				n.showCard(cardDeck, p1, p2);
				break;

			case 4:
				n.giveCard(cardDeck, p1, p2);
				
				break;
				

			default:
				break;
			}
		}
	}
}
