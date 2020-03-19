import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Excute extends Card implements NeedMaking {

	@Override
	public int main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("카드게임");
		System.out.println("1.카드 만들기   2.카드섞기  3.카드보기  4.카드분배");
		System.out.println("0.그만하기");
		int select = 0;
		select = scan.nextInt();
		if (select == 0) {
			System.exit(0);
		}
		return select;
	}

	@Override
	public void makingCardDeck(ArrayList<Card> cardDeck) {
		String[] kind = { "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String num = "0123456789XJQK";
		cardDeck.clear();
		for (int i = 0; i < KINDNUM; i++) {
			for (int j = 0; j < NUMNUM; j++) {
				cardDeck.add(new Card(kind[i], num.charAt(j + 1)));
			}
		}
		System.out.println("카드덱을 생성하였습니다.");
		System.out.println("------------------------------------");
	}

	@Override
	public void shuffleCardDeck(ArrayList<Card> cardDeck,ArrayList<Card> p1, ArrayList<Card> p2) {
		Collections.shuffle(cardDeck);
		System.out.println("카드를 섞었습니다.");
		System.out.println("------------------------------------");
		p1.clear();
		p2.clear();

	}

	@Override
	public void showCardDeck(ArrayList<Card> cardDeck, ArrayList<Card> p1, ArrayList<Card> p2) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1.카드덱 보기  2.p1카드보기 3.p2카드보기");
			System.out.println("이전메뉴로 돋아가기(99)");
			int select = 0;
			select = scan.nextInt();
			if (select == 99) {
				return;
			}
			switch (select) {
			case 1:
				for (int i = 0; i < TCARDNUM; i++) {
					System.out.println(cardDeck.get(i));
				}

				break;
			case 2:
				for (int i = 0; i < p1.size(); i++) {
					System.out.println(p1.get(i));
				}
				break;
			case 3:
				for (int i = 0; i < p2.size(); i++) {
					System.out.println(p2.get(i));
				}
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				System.out.println("------------------------------------");
				return;

			}
		}

	}

	@Override
	public void giveCard(ArrayList<Card> cardDeck, ArrayList<Card> p1, ArrayList<Card> p2) {
		p1.clear();
		p2.clear();
		p1.add(cardDeck.get(0));
		for (int i = 0; i < 6; i++) {
			p1.add(cardDeck.get(i + 2));
		}
		
		p2.add(cardDeck.get(1));
		for (int i = 1; i < 7; i++) {
			p2.add(cardDeck.get(i + 2));
		}
		System.out.println("카드를 분배하였습니다.");
		System.out.println("------------------------------------");

	}

}
