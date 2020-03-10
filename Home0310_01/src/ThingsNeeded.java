import java.util.ArrayList;

public interface ThingsNeeded {
	String main();
	void makeCard(ArrayList<Deck> cardDeck);
	void shuffle(ArrayList<Deck> cardDeck, ArrayList<Deck> shuffleDeck);
	void showCard(ArrayList<Deck> cardDeck, ArrayList<Deck> shuffleDeck);
	void cardForp1(ArrayList<Deck> shuffleDeck,ArrayList<Deck> p1Card);
	void cardForp2(ArrayList<Deck> shuffleDeck,ArrayList<Deck> p2Card);
	void checkResult(ArrayList<Deck> p1Card,ArrayList<Deck> p2Card);
}
