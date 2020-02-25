
public class Home0225_01 {

	public static void main(String[] args) {
		Deck d=new Deck(); 
		Card[] c=new Card[7];
		Card c1=d.pick();
		Card c2=d.pick();
		Card c3=d.pick(0);
		for(int i=0; i<7;i++) {
			c[i]=d.pick();
		}
		for(int i=0; i<7;i++) {
			System.out.println(c[i]);
		}

		System.out.println(c3);
		System.out.println(c1);
	}

}

class Deck {
	final int CARD_MAX = 52;
	Card[] card_deck = new Card[CARD_MAX];

	Deck() {
		for (int i = 0; i < Card.KIND_MAX; i++) {
			for (int j = 0; j < Card.NUM_MAX; j++) {
				card_deck[i*13+j] = new Card(i + 1, j + 1);
			}

		}

	}
	Card pick(int index) {
		return card_deck[index];
	}
	Card pick() {
		int index=(int)(Math.random()*52);
		return card_deck[index];
	}
	void shuffle() {
		for(int i=0; i<2000;i++) {
			int num=(int)(Math.random()*52);
			Card temp=card_deck[0];
			card_deck[0]=card_deck[num];
			card_deck[num]=temp;
		}
	}
	
}//class Deck

class Card {
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;

	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;

	int kind;
	int number;

	Card() {

	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	public String toString() {
		String[] kinds = { "", "CLOVER", "HEART", "DIAMOND", "SPADE" };
		String numbers = "0123456789XJQK";
		return "" + kinds[kind] + " " + numbers.charAt(number);

	}

}