import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Excute extends Card implements Interface {

	@Override
	public String main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.ī����� 2.���� 3.ī�庸�� 4.ī��й�");
		System.out.println("0.���α׷� ����");
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
		System.out.println("52���� ī�嵦�� ����������ϴ�.");
		return;
	}

	@Override
	public void shuffle(ArrayList<Card> cardDeck) {
		Collections.shuffle(cardDeck);
		System.out.println("ī�嵦�� �������ϴ�.");
	}

	@Override
	public void show(ArrayList<Card> cardDeck) {
		for (int i = 0; i < TCARDNUM; i++) {
			System.out.println(cardDeck.get(i));
		}
		System.out.println("ī�带 ��� ����߽��ϴ�.");
	}

	@Override
	public void give(ArrayList<Card> cardDeck, ArrayList<Card> p1, ArrayList<Card> p2) {
		Scanner scan = new Scanner(System.in);
		int countp1 = 0;
		int countp2 = 1;
		int turn=0;
		while (true) {
			System.out.println("[1.p1���� ����   2.p2���� ����] 0.�����޴�");
			String select = "0";
			select = scan.next();
			if (select.equals("0")) {
				return;
			}

			switch (select) {
			case "1":
				if(turn==1) {
					System.out.println("p2�� ī�带 ���� �����Դϴ�.");
					continue;
				}
				if (p1.size() == 7) {
					System.out.println("p1�� ��� ī�带 �޾ҽ��ϴ�. ���̻� ī�带 ���� �� �����ϴ�.");
					turn=1;
					continue;
				}

				p1.add(cardDeck.get(countp1));
				System.out.println("[p1�� ī��]");
				for (int i = 0; i < p1.size(); i++) {
					System.out.println(p1.get(i));

				}
				countp1 += 2;
				turn=1;
				break;
			case "2":
				if(turn==0) {
					System.out.println("p1��  ī�带 ���� �����Դϴ�.");
					continue;
				}
				if (p2.size() == 7) {
					System.out.println("p2�� ��� ī�带 �޾ҽ��ϴ�. ���̻� ī�带 ���� �� �����ϴ�.");
					continue;
				}
				p2.add(cardDeck.get(countp2));
				System.out.println("[p2�� ī��]");
				for (int i = 0; i < p2.size(); i++) {
					System.out.println(p2.get(i));

				}
				countp2 += 2;
				turn=0;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�.");
				continue ;
				
			}
		}

	}

}
