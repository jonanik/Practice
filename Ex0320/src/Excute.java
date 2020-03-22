import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Excute extends Card implements NeededThings {

	@Override
	public int main() {
		Scanner scan = new Scanner(System.in);

		System.out.println("1.MakeCard ");
		System.out.println("2.ShuffleCard");
		System.out.println("3.ShowCard");
		System.out.println("4.GiveCard");
		System.out.println("0.exit");
		int select = 0;
		select = scan.nextInt();
		if (select == 0) {
			System.exit(0);
		}
		return select;
	}

	@Override
	public void makeCard(ArrayList<Card> cardDeck, ArrayList<Card> p1, ArrayList<Card> p2) {
		String[] kinds = { "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String num = "0123456789XJQK";
		cardDeck.clear();
		p1.clear();
		p2.clear();
		for (int i = 0; i < KINDNUM; i++) {
			for (int j = 1; j < NUMNUM + 1; j++) {
				cardDeck.add(new Card(kinds[i], num.charAt(j)));
			}
		}
		System.out.println("new Card Deck is made");
		System.out.println("---------------------------");
	}

	@Override
	public void shuffleCard(ArrayList<Card> cardDeck) {

		Collections.shuffle(cardDeck);
		System.out.println("cardDeck is shuffled");
		System.out.println("---------------------------");
	}

	@Override
	public void showCard(ArrayList<Card> cardDeck, ArrayList<Card> p1, ArrayList<Card> p2) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("1.show New Card Deck");
			System.out.println("2.p1 Card Deck");
			System.out.println("3.p2 Card Deck");
			System.out.println("0.go back to top menu");
			int select = 0;
			select = scan.nextInt();
			if (select == 0) {
				return;
			}
			switch (select) {

			case 1:
				System.out.println("show New Card Deck ");
				for (int i = 0; i < TCARDNUM; i++) {
					System.out.println(cardDeck.get(i));
				}
				break;

			case 2:
				System.out.println("show p1 Card Deck");
				for (int i = 0; i < p1.size(); i++) {
					System.out.println(p1.get(i));
				}
				break;
			case 3:
				System.out.println("show p2 Card Deck");
				for (int i = 0; i < p2.size(); i++) {
					System.out.println(p2.get(i));
				}
			default:
				System.out.println("it`s wrong input");
				break;
			}
		}
	}

	@Override
	public void giveCard(ArrayList<Card> cardDeck, ArrayList<Card> p1, ArrayList<Card> p2) {

		for (int i = 0; i < 13; i += 2) {
			p1.add(cardDeck.get(i));
		}

		for (int i = 1; i < 14; i += 2) {
			p2.add(cardDeck.get(i));
		}
		System.out.println("all player get the their own card");
		System.out.println("-----------------------------------");
	}

}
