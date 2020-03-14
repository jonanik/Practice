
public class Home0314_03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c1=new Card();
		Card c2=new Card();
		c1.kind="heart";
		c1.number=8;
		c2.kind="clover";
		c2.number=3;
		
		System.out.println(c1);
		System.out.println(c2);
		c1.width=40;// 클래스 변수 값을 변경한다고 할때 참조변수.클래스변수명 이 아니라
		c1.height=80;// 클래스명.클래스변수명으로 해주는것이 남들과 같이 작업할때 혼자할떄도 헷갈리지 않을 수 있다.
		
		System.out.println(c1);//c1참조변수를 이용하여 클래스변수의 값을 바꿔줬지만
		System.out.println(c2);//바꾼 값은 클래스 변수이다. 클래스변수는 클래스에서 생성된 모든 인스턴스에서
								//공유하기 때문에 c2의 width height또한 변경되어있다. 애초에 'c2의'width height라고 말하는것도 이상한거다.
								
		Card.width=100;
		Card.height=20;
		
		System.out.println(c1);
		System.out.println(c2);
		
		
		
	}

}
class Card{
	String kind;//kind 와 number는 클래스 영역에 선언되는 인스턴스 변수이다.
	int number;//인스턴스 변수는 인스턴스가 생성될때 생성된다.
	static int width=80;//width 와 height는 클래스영역에 선언되는 클래스변수이다.
	static int height=150;//클래스변수는 클래스가 메서드에어리아에 로딩될때 같이 생성된다. 
							//즉 지금 이 클래스를 실행하면 메인 메서드가 있는 클래스가 로딩되고 메인메서드가 콜스택에 올라라고
							//클래스 카드가 메서드에 로딩되면서 클래스면서 width와 height가 같이 생성된다. 그리고 카드 클래스를
							//클래스 카드의 인스터스를 생성하면 그때 kind number인스턴스 변수가 생성된다.
	
	
	
	@Override
	
	public String toString() {
		return "[kind=" + kind + ", number=" + number + "]"+"너비:"+
	width+"\t높이:"+height;
	}
	
	
}