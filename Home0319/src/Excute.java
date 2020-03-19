import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Excute extends Card implements NeedMaking {

	@Override
	public int main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ī�����");
		System.out.println("1.ī�� �����   2.ī�弯��  3.ī�庸��  4.ī��й�");
		System.out.println("0.�׸��ϱ�");
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
		System.out.println("ī�嵦�� �����Ͽ����ϴ�.");
		System.out.println("------------------------------------");
	}

	@Override
	public void shuffleCardDeck(ArrayList<Card> cardDeck,ArrayList<Card> p1, ArrayList<Card> p2) {
		Collections.shuffle(cardDeck);
		System.out.println("ī�带 �������ϴ�.");
		System.out.println("------------------------------------");
		p1.clear();
		p2.clear();

	}

	@Override
	public void showCardDeck(ArrayList<Card> cardDeck, ArrayList<Card> p1, ArrayList<Card> p2) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("1.ī�嵦 ����  2.p1ī�庸�� 3.p2ī�庸��");
			System.out.println("�����޴��� ���ư���(99)");
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
				System.out.println("�߸��� �Է��Դϴ�.");
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
		System.out.println("ī�带 �й��Ͽ����ϴ�.");
		System.out.println("------------------------------------");

	}

}
