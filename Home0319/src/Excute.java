import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Excute extends Card implements NeedMaking {

	@Override
	public int main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("ī�����");
		System.out.println("1.ī�� �����   2.ī�弯��  3.ī�庸��");
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

	}

	@Override
	public void shuffleCardDeck(ArrayList<Card> cardDeck) {
		Collections.shuffle(cardDeck);

	}

	@Override
	public void showCardDeck(ArrayList<Card> cardDeck) {
		for (int i = 0; i < TCARDNUM; i++) {
			System.out.println(cardDeck.get(i));
		}

	}
	

}
