
public class Home0226_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck1 d=new Deck1();
		Card1[] c=new Card1[7];

		for(int i=0; i<7; i++) {
			c[i]=d.pick();
		}
		for(int i=0; i<7; i++) {
			System.out.println(c[i]);
		}



	}

}



