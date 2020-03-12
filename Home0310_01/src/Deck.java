public class Deck {
	String kind;
	char num;

	Deck() {
	}

	Deck(String kind, char num) {
		this.kind = kind;
		this.num = num;
	}

	public String toString() {
		return kind + " " + num;
	}
}
