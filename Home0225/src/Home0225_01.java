
public class Home0225_01 {

	public static void main(String[] args) {
		Deck d=new Deck();
		Card[] c1=new Card[7];
		Card c=d.pick();
		
		for(int i=0; i<7;i++) {
			c1[i]=d.pick();
		}
		for(int i=0; i<7;i++) {
			System.out.println(c1[i]);;
		}
	}

}

class Deck{
	Card[] arr=new Card[Card.MAX_CARD];
	Deck(){
		for(int i=0; i<Card.MAX_KIND;i++) {
			for(int j=0; j<Card.MAX_NUM;j++) {
				arr[i*13+j]=new Card(i+1,j+1);
			}
		}
	}
	Card pick(int index) {
		return arr[index];
	}
	Card pick() {
		int random=(int)(Math.random()*52);
		return arr[random];
	}
	void shuffle() {
		int random=(int)(Math.random()*52);
		Card temp=arr[0];
		arr[0]=arr[random];
		arr[random]=temp;
	}
}

class Card{
	static final int MAX_CARD=52;
	static final int MAX_KIND=4;
	static final int MAX_NUM=13;
	
	int kind;
	int number;
	Card(){
		
	}
	Card(int kind,int number){
		this.kind=kind;
		this.number=number;
	}
	public String toString() {
		String[] kinds= {"","CLOVER","HEART","DIAMOND","SPADE"};
		String numbers= "0123456789XJQK";
		return ""+kinds[kind]+" "+numbers.charAt(number);
	}
}