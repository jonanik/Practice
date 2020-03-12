import java.util.ArrayList;

public interface ThingsNeeded {
	String main();// 메인메뉴

	void makeCard(ArrayList<Deck> cardDeck);// 카드 52장을 cardDeck에 무늬와 숫자 입력하여 넣는다.

	void shuffle(ArrayList<Deck> cardDeck, ArrayList<Deck> shuffleDeck);// cardDeck에 52장의 카드를 shuffleDeck에 섞어서 넣어준다.

	void showCard(ArrayList<Deck> cardDeck, ArrayList<Deck> shuffleDeck);// cardDeck또는 shuffleDeck의 카드가 잘생성됬는지 선택해서 확인할
																			// 수 있다.

	void cardForp1(ArrayList<Deck> shuffleDeck, ArrayList<Deck> p1Card);// 섞인 카드를 p1에게 나눠준다. 즉 p1Card에 넣어준다. 몇번째 카드를
																		// 받느중인지 확인가능

	void cardForp2(ArrayList<Deck> shuffleDeck, ArrayList<Deck> p2Card);// 섞인 카드를 p2에게 나눠준다. 즉 p2Card에 넣어준다. 몇번째 카드를
																		// 받느중인지 확인가능

	void checkResult(ArrayList<Deck> p1Card, ArrayList<Deck> p2Card);// 배분된 카드를 확인한다. 받는중에도 확인 가능하다.
}
