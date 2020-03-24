import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex0324 {

	public static void main(String[] args) {
		ArrayList<Card> deck=new ArrayList<Card>();
		ArrayList<Card> shuffle=new ArrayList<Card>();
		
		ArrayList<Card> player=new ArrayList<Card>();
		Excute e=new Excute();
		while(true) {
		switch(e.main()) {
		case "1":
			e.input(deck);
			break;
		case "2":
			e.shuffle(deck,shuffle);
			System.out.println(deck.size());
		break;
		
		case "3":
			e.pick(deck,player);
		break;
		
		case "4":
		
			e.print(deck,player);
			deck.add(52,deck.get(0));
			System.out.println(deck.get(52));
		break;
		case "0":
			
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
			break;
		
		default:
			System.out.println("잘못입력하셨습니다.");
			break;
		
		}
		}
		
		
	}

}
class Card{
	String kind;
	char num;
	
	Card(){
		
	}
	Card(String kind, char num){
		this.kind=kind;
		this.num=num;
	}
	@Override
	public String toString() {
		return  kind + " " + num;
	}
	
}
class Excute{
	
	String main() {
		Scanner scan=new Scanner(System.in);
		System.out.println("카드게임");
		System.out.println("1.카드생성   2.카드셔플 3.카드분배  4.카드출력");
		System.out.println("0.프로그램 종료");
		String select="0";
		select=scan.next();
		return select;
	}
	
	void input(ArrayList<Card> deck){
		
		String[] kind= {"CLOVER","HEART","DIAMOND","SPADE"};
		String num="0123456789XJQK";
		for(int i=0; i<kind.length;i++) {
			for(int j=1; j<num.length();j++){
				deck.add(new Card(kind[i],num.charAt(j)));
			}
		}
	}
	void print(ArrayList<Card> deck,ArrayList<Card> player) {
		Scanner scan= new Scanner(System.in);
		System.out.println("1.카드덱 2.플레이어카드");
		int select=0;
		select=scan.nextInt();
		switch(select) {
		case 1:
			for(int i=0; i<deck.size();i++) {
				System.out.println(deck.get(i));
			}
			break;
		case 2:
			for(int i=0; i<player.size();i++) {
				System.out.println(player.get(i));
			}
			break;
			
		}
	}
	void shuffle(ArrayList<Card> deck,ArrayList<Card> shuffle) {

		for(int i=0; i<200;i++) {
			int random=(int)(Math.random()*52);
		shuffle.add(deck.get(0));
		deck.set(0,deck.get(random));
		deck.set(random,shuffle.get(0));
		}
	}
//		Card c=new Card();
//	for(int i=0; i<200;i++) {
//		int random=(int)(Math.random()*52);
//	c=deck.get(0);
//	deck.set(0,deck.get(random));
//	deck.set(random,c);
//	}
//}

	
	void pick(ArrayList<Card> deck,ArrayList<Card>
	player) {
	
	for(int i=0; i<7;i++) {
		player.add(deck.get(i));
	}
		
		
	}
}