import java.util.ArrayList;

public class Game {
	public static void main(String[] args) {
		Interface i = new Excute();
ArrayList<Card> cardDeck=new ArrayList<Card>();
		ArrayList<Card> p1=new ArrayList<Card>();
		ArrayList<Card> p2=new ArrayList<Card>();
		while (true) {

			switch (i.main()) {
			case "1":
				i.makeCard(cardDeck);
				break;
			case "2":
				i.shuffle(cardDeck);
				break;
			case "3":
				i.show(cardDeck);
				break;
			case "4":
				i.give(cardDeck, p1, p2);
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("잘못된 입력입니다. 다시입력하세요.");

				break;
			}
		}
	}
}
