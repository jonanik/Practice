import java.util.ArrayList;

public class Mainprogram {

	public static void main(String[] args) {
		ArrayList<Card> deck = new ArrayList<Card>();
		ArrayList<Card> p1 =new ArrayList<Card>();
		ArrayList<Card> p2 =new ArrayList<Card>();
		Excute e = new Excute();
		while (true) {
			switch (e.main()) {
			case "1":
				e.makeCard(deck);
				break;
			case "2":
				e.shuffle(deck);
				break;
			case "3":
				e.print(deck,p1,p2);
				break;
			case "4":
				e.giveCard(deck, p1, p2);
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");

				System.exit(0);
				break;

			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}

		}
	}

}
