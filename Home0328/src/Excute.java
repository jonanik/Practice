import java.util.ArrayList;
import java.util.Scanner;

public class Excute {
	Card c = new Card();

	String main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("카드게임");
		System.out.println("1.카드생성 2.카드 섞기 3.카드출력 4.카드분배");
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
		System.out.println("카드가 생성되었습니다.");
	}

	void print(ArrayList<Card> deck, ArrayList<Card> p1, ArrayList<Card> p2) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.카드덱  2.플레이어 카드 ");
		System.out.println("0.이전");
		String select = scan.next();
		if(select.equals("0")) {
			return;
		}
		switch (select) {
		case "1":			
			for (int i = 0; i < deck.size(); i++) {
				System.out.println(deck.get(i));
			}
			System.out.println(deck.size() + "장의 카드가 출력됬습니다.");
			break;
		case "2":
			System.out.println("[p1의 카드]");
			for (int i = 0; i < p1.size(); i++) {
				System.out.println(p1.get(i));
			}
			System.out.println("---------------");
			System.out.println("[p2의 카드]");
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
		System.out.println("카드가 섞였습니다.");

	}

	void giveCard(ArrayList<Card> deck, ArrayList<Card> p1, ArrayList<Card> p2) {
		for (int i = 0; i < 13; i += 2) {
			p1.add(deck.get(i));
		}
		for (int i = 1; i < 14; i += 2) {
			p2.add(deck.get(i));
		}
		System.out.println("카드를 p1,p2에게 분배했습니다.");
		System.out.println("------------------------");
	}
}
