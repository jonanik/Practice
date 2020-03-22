import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Excute extends Card implements Interface {

	@Override
	public String main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.카드생성 2.셔플 3.카드보기 4.카드분배");
		System.out.println("0.프로그램 종료");
		String select = scan.next();
		return select;
	}

	@Override
	public void makeCard(ArrayList<Card> cardDeck) {
		String[] kind = { "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String num = "0123456789XJQK";

		cardDeck.clear();

		for (int j = 0; j < KINDNUM; j++) {
			for (int i = 1; i < NUMNUM + 1; i++) {
				cardDeck.add(new Card(kind[j], num.charAt(i)));

			}

		}
		System.out.println("52장의 카드덱이 만들어졌습니다.");
		return;
	}

	@Override
	public void shuffle(ArrayList<Card> cardDeck) {
		Collections.shuffle(cardDeck);
		System.out.println("카드덱이 섞였습니다.");
	}

	@Override
	public void show(ArrayList<Card> cardDeck) {
		for (int i = 0; i < TCARDNUM; i++) {
			System.out.println(cardDeck.get(i));
		}
		System.out.println("카드를 모두 출력했습니다.");
	}

	@Override
	public void give(ArrayList<Card> cardDeck, ArrayList<Card> p1, ArrayList<Card> p2) {
		Scanner scan = new Scanner(System.in);
		int countp1 = 0;
		int countp2 = 1;
		int turn=0;
		while (true) {
			System.out.println("[1.p1에게 한장   2.p2에게 한장] 0.이전메뉴");
			String select = "0";
			select = scan.next();
			if (select.equals("0")) {
				return;
			}

			switch (select) {
			case "1":
				if(turn==1) {
					System.out.println("p2가 카드를 받을 차례입니다.");
					continue;
				}
				if (p1.size() == 7) {
					System.out.println("p1은 모든 카드를 받았습니다. 더이상 카드를 받을 수 없습니다.");
					turn=1;
					continue;
				}

				p1.add(cardDeck.get(countp1));
				System.out.println("[p1의 카드]");
				for (int i = 0; i < p1.size(); i++) {
					System.out.println(p1.get(i));

				}
				countp1 += 2;
				turn=1;
				break;
			case "2":
				if(turn==0) {
					System.out.println("p1이  카드를 받을 차례입니다.");
					continue;
				}
				if (p2.size() == 7) {
					System.out.println("p2는 모든 카드를 받았습니다. 더이상 카드를 받을 수 없습니다.");
					continue;
				}
				p2.add(cardDeck.get(countp2));
				System.out.println("[p2의 카드]");
				for (int i = 0; i < p2.size(); i++) {
					System.out.println(p2.get(i));

				}
				countp2 += 2;
				turn=0;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				continue ;
				
			}
		}

	}

}
