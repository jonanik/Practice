import java.util.ArrayList;

public interface ThingsNeeded {
	String main();// ���θ޴�

	void makeCard(ArrayList<Deck> cardDeck);// ī�� 52���� cardDeck�� ���̿� ���� �Է��Ͽ� �ִ´�.

	void shuffle(ArrayList<Deck> cardDeck, ArrayList<Deck> shuffleDeck);// cardDeck�� 52���� ī�带 shuffleDeck�� ��� �־��ش�.

	void showCard(ArrayList<Deck> cardDeck, ArrayList<Deck> shuffleDeck);// cardDeck�Ǵ� shuffleDeck�� ī�尡 �߻�������� �����ؼ� Ȯ����
																			// �� �ִ�.

	void cardForp1(ArrayList<Deck> shuffleDeck, ArrayList<Deck> p1Card);// ���� ī�带 p1���� �����ش�. �� p1Card�� �־��ش�. ���° ī�带
																		// �޴������� Ȯ�ΰ���

	void cardForp2(ArrayList<Deck> shuffleDeck, ArrayList<Deck> p2Card);// ���� ī�带 p2���� �����ش�. �� p2Card�� �־��ش�. ���° ī�带
																		// �޴������� Ȯ�ΰ���

	void checkResult(ArrayList<Deck> p1Card, ArrayList<Deck> p2Card);// ��е� ī�带 Ȯ���Ѵ�. �޴��߿��� Ȯ�� �����ϴ�.
}
