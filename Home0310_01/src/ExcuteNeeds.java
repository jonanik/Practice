import java.util.ArrayList;
import java.util.Scanner;

public class ExcuteNeeds implements ThingsNeeded {
	int player1 = 0;
	int player2 = 1;
	int count1 = 1;
	int count2 = 1;

	@Override // 메인메뉴
	public String main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("카드게임");
		System.out.println("1.카드준비  2.카드섞기 3.카드 보기");
		System.out.println("4.나에게 카드배분  5.상대방에게 카드배분");
		System.out.println("6.결과 확인");
		String select = scan.next();
		return select;
	}

	@Override // 52장의 cardDeck에 모양과 숫자를 입력한다.
	public void makeCard(ArrayList<Deck> cardDeck) {
		String[] kind = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String num = "0123456789XJQP";

		for (int i = 1; i < kind.length; i++) {
			for (int j = 1; j < num.length(); j++) {
				cardDeck.add(new Deck(kind[i], num.charAt(j)));
			}
		}
		System.out.println("카드가 준비되었습니다.");
		return;
	}

	@Override // cardDeck에 들어있는 52장의 새카드를 섞어서 shuffleDeck에 넣어서 섞인 카드덱을 만든다.
	public void shuffle(ArrayList<Deck> cardDeck, ArrayList<Deck> shuffleDeck) {
		for (int i = 0; i < cardDeck.size(); i++) {
			int random = (int) (Math.random() * 52);
			shuffleDeck.add(cardDeck.get(random));
		}
		System.out.println("카드를 섞었습니다.");
		return;
	}

	@Override // 새 카드덱 cardDeck 또는 섞인 카드덱 shuffleDeck을 선택해서 출력한다.
	public void showCard(ArrayList<Deck> cardDeck, ArrayList<Deck> shuffleDeck) {
		Scanner scan = new Scanner(System.in);
		re: while (true) {
			System.out.println("1.새카드 덱 확인하기    2.섞인 카드 확인하기 (이전:0) ");
			int select = scan.nextInt();
			if (select == 0) {
				System.out.println("메인메뉴로 이동합니다.");
				return;
			}
			if (select == 1) {
				for (int i = 0; i < cardDeck.size(); i++) {
					System.out.println(cardDeck.get(i));
				}
				continue re;
			} else if (select == 2) {
				for (int i = 0; i < shuffleDeck.size(); i++) {
					System.out.println(shuffleDeck.get(i));
				}
				continue re;
			} else {
				System.out.println("잘못 입력하셨습니다. 1또는 2를 입력해주세요.");
				continue;
			}
		}

	}

	@Override

	public void cardForp1(ArrayList<Deck> shuffleDeck, ArrayList<Deck> p1Card) {

		if (p1Card.size() == 7) {
			System.out.println("카드 7장을 모두 받았습니다.");
			return;
		}

		p1Card.add(shuffleDeck.get(player1));
		player1 += 2;
		System.out.println(count1 + "번째 카드를 받았습니다.");
		count1++;
		return;
	}

	@Override
	public void cardForp2(ArrayList<Deck> shuffleDeck, ArrayList<Deck> p2Card) {

		if (p2Card.size() == 7) {
			System.out.println("카드 7장을 모두 받았습니다.");
			return;
		}
		p2Card.add(shuffleDeck.get(player2));
		player2 += 2;
		System.out.println(count2 + "번째 카드를 받았습니다.");
		count2++;

		return;
	}

	@Override
	public void checkResult(ArrayList<Deck> p1Card, ArrayList<Deck> p2Card) {
		System.out.println("-----------");
		System.out.println("p1의 카드 ");
		System.out.println("-----------");
		for (int i = 0; i < p1Card.size(); i++) {
			System.out.println(p1Card.get(i));
		}

		System.out.println("-----------");
		System.out.println("p2의 카드");
		System.out.println("-----------");
		for (int i = 0; i < p2Card.size(); i++) {
			System.out.println(p2Card.get(i));
		}
		System.out.println("-----------");
	}

}