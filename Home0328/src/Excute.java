import java.util.ArrayList;
import java.util.Scanner;

public class Excute {
	Card c = new Card();

	String main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ī�����");
		System.out.println("1.ī����� 2.ī�� ���� 3.ī����� 4.ī��й�");
		String select = scan.next();
		return select;
	}

	void makeCard(ArrayList<Card> deck) {
		String[] kind = { "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String num = "123456789XJQK";

		for (int i = 0; i < c.KINDNUM; i++) {
			for (int j = 0; j < c.NUMNUM; j++) {
				deck.add(new Card(kind[i], num.charAt(j)));
			}
		}
		System.out.println("ī�尡 �����Ǿ����ϴ�.");
	}

	void print(ArrayList<Card> deck, ArrayList<Card> p1, ArrayList<Card> p2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.ī�嵦  2.�÷��̾� ī�� ");
		System.out.println("0.����");
		String select = scan.next();
		if(select.equals("0")) {
			return;
		}
		switch (select) {
		case "1":			
			for (int i = 0; i < deck.size(); i++) {
				System.out.println(deck.get(i));
			}
			System.out.println(deck.size() + "���� ī�尡 �����ϴ�.");
			break;
		case "2":
			System.out.println("[p1�� ī��]");
			for (int i = 0; i < p1.size(); i++) {
				System.out.println(p1.get(i));
			}
			System.out.println("---------------");
			System.out.println("[p2�� ī��]");
			for (int i = 0; i < p2.size(); i++) {
				System.out.println(p2.get(i));
			}
			System.out.println("---------------");
			break;
		default:
			break;
		}

	}

	void shuffle(ArrayList<Card> deck) {
		for (int i = 0; i < 300; i++) {
			int random = (int) (Math.random() * 52);
			Card temp = deck.get(0);
			deck.set(0, deck.get(random));
			deck.set(random, temp);
		}
		System.out.println("ī�尡 �������ϴ�.");

	}

	void giveCard(ArrayList<Card> deck, ArrayList<Card> p1, ArrayList<Card> p2) {
		for (int i = 0; i < 13; i += 2) {
			p1.add(deck.get(i));
		}
		for (int i = 1; i < 14; i += 2) {
			p2.add(deck.get(i));
		}
		System.out.println("ī�带 p1,p2���� �й��߽��ϴ�.");
		System.out.println("------------------------");
	}
}
