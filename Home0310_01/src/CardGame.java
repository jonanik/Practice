import java.util.ArrayList;

public class CardGame {

	public static void main(String[] args) {
		ArrayList<Deck> cardDeck=new ArrayList<Deck>();
		ArrayList<Deck> shuffleDeck=new ArrayList<Deck>();
		ArrayList<Deck> p1Card=new ArrayList<Deck>();
		ArrayList<Deck> p2Card=new ArrayList<Deck>();
		ThingsNeeded n=new ExcuteNeeds();
		
	while(true) {
		switch (n.main()) {
		case "1": //ī���غ�
			n.makeCard(cardDeck);
			break;	
		case "2": //ī�弯��
			n.shuffle(cardDeck, shuffleDeck);
			break;	
		case "3": //ī�庸��
			n.showCard(cardDeck, shuffleDeck);
			break;	
		case "4": //p1���� ī������
			n.cardForp1(shuffleDeck, p1Card);
			break;	
		case "5": //p2���� ī������
			n.cardForp2(shuffleDeck, p2Card);
			break;	
		case "6": //�÷��̾� ī�� Ȯ���ϱ�
			n.checkResult(p1Card, p2Card);
			break;	
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
	}
		
		
//		n.showCard(cardDeck, shuffleDeck);
//		for(int i=0; i<cardDeck.size();i++) {
//			System.out.println(cardDeck.get(i));
//		}
	}

}
