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
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				break;

			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ��Է��ϼ���.");

				break;
			}
		}
	}
}
