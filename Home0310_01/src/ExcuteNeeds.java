import java.util.ArrayList;
import java.util.Scanner;

public class ExcuteNeeds implements ThingsNeeded {
	int player1 = 0;
	int player2 = 1;
	int count1 = 1;
	int count2 = 1;

	@Override // ���θ޴�
	public String main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ī�����");
		System.out.println("1.ī���غ�  2.ī�弯�� 3.ī�� ����");
		System.out.println("4.������ ī����  5.���濡�� ī����");
		System.out.println("6.��� Ȯ��");
		String select = scan.next();
		return select;
	}

	@Override // 52���� cardDeck�� ���� ���ڸ� �Է��Ѵ�.
	public void makeCard(ArrayList<Deck> cardDeck) {
		String[] kind = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String num = "0123456789XJQP";

		for (int i = 1; i < kind.length; i++) {
			for (int j = 1; j < num.length(); j++) {
				cardDeck.add(new Deck(kind[i], num.charAt(j)));
			}
		}
		System.out.println("ī�尡 �غ�Ǿ����ϴ�.");
		return;
	}

	@Override // cardDeck�� ����ִ� 52���� ��ī�带 ��� shuffleDeck�� �־ ���� ī�嵦�� �����.
	public void shuffle(ArrayList<Deck> cardDeck, ArrayList<Deck> shuffleDeck) {
		for (int i = 0; i < cardDeck.size(); i++) {
			int random = (int) (Math.random() * 52);
			shuffleDeck.add(cardDeck.get(random));
		}
		System.out.println("ī�带 �������ϴ�.");
		return;
	}

	@Override // �� ī�嵦 cardDeck �Ǵ� ���� ī�嵦 shuffleDeck�� �����ؼ� ����Ѵ�.
	public void showCard(ArrayList<Deck> cardDeck, ArrayList<Deck> shuffleDeck) {
		Scanner scan = new Scanner(System.in);
		re: while (true) {
			System.out.println("1.��ī�� �� Ȯ���ϱ�    2.���� ī�� Ȯ���ϱ� (����:0) ");
			int select = scan.nextInt();
			if (select == 0) {
				System.out.println("���θ޴��� �̵��մϴ�.");
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�. 1�Ǵ� 2�� �Է����ּ���.");
				continue;
			}
		}

	}

	@Override

	public void cardForp1(ArrayList<Deck> shuffleDeck, ArrayList<Deck> p1Card) {

		if (p1Card.size() == 7) {
			System.out.println("ī�� 7���� ��� �޾ҽ��ϴ�.");
			return;
		}

		p1Card.add(shuffleDeck.get(player1));
		player1 += 2;
		System.out.println(count1 + "��° ī�带 �޾ҽ��ϴ�.");
		count1++;
		return;
	}

	@Override
	public void cardForp2(ArrayList<Deck> shuffleDeck, ArrayList<Deck> p2Card) {

		if (p2Card.size() == 7) {
			System.out.println("ī�� 7���� ��� �޾ҽ��ϴ�.");
			return;
		}
		p2Card.add(shuffleDeck.get(player2));
		player2 += 2;
		System.out.println(count2 + "��° ī�带 �޾ҽ��ϴ�.");
		count2++;

		return;
	}

	@Override
	public void checkResult(ArrayList<Deck> p1Card, ArrayList<Deck> p2Card) {
		System.out.println("-----------");
		System.out.println("p1�� ī�� ");
		System.out.println("-----------");
		for (int i = 0; i < p1Card.size(); i++) {
			System.out.println(p1Card.get(i));
		}

		System.out.println("-----------");
		System.out.println("p2�� ī��");
		System.out.println("-----------");
		for (int i = 0; i < p2Card.size(); i++) {
			System.out.println(p2Card.get(i));
		}
		System.out.println("-----------");
	}

}