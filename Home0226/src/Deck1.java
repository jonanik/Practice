
public class Deck1{
	Card1[] c=new Card1[Card1.MAX_CARD];

	Deck1() {
		for(int i=0; i<Card1.MAX_KIND;i++) {
			for(int j=0; j<Card1.MAX_NUMBER;j++) {
				c[i*13+j]=new Card1(i+1,j+1);
			}
		}
	}
	Card1 pick(int index) {
		return c[index];
	}
	Card1 pick() {
		int random=(int)(Math.random()*52);
		return c[random];
	}
	void shuffle() {
		int random=(int)(Math.random()*52);
		Card1 temp=c[0];
		c[0]=c[random];
		c[random]=temp;
	}
}