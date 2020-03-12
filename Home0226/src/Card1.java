
public class Card1 {
	
		static final int MAX_KIND=4;
		static final int MAX_NUMBER=13;
		static final int MAX_CARD=52;

		int kind;
		int number;
		Card1(){

		}

		Card1(int kind, int number){
			this.kind=kind;
			this.number=number;
		}

		public String toString() {
			String[] kinds= {"","CLOVER","HEART","DIAMOND","SPADE"};
			String numbers="0123456789XJQK";
			return kinds[kind]+" "+numbers.charAt(number);
		}
	} 
