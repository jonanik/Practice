
public class Home0318_01 {

	public static void main(String[] args) {
		Tv t=new Tv();
		t.power();
		t.power();
		t.channel=2;
		t.channelUp();
		t.channelUp();
		t.channelDown();
		System.out.println(t.channel);
		
		CaptionTv c=new CaptionTv();
		c.text="아따 요거시 캡션 티비구마";
		c.caption();
		c.caption();
		c.caption();
		
		Tv t1=new CaptionTv();// 다형성이라는 것은 이와 같이  조상타입의 참조변수로 자손타입의 인스턴스를 다룰 수 있는 특성을 말한다.
		t1.channel=9;			//이때 조상타입으로 선언된 자손타입의 인스턴스는 기존에 조상이 가지고 있는 멤버만 사용할 수 있다.
		t1.channelDown();		//이렇게 선언된 상태에선 자손의 멤버를 다룰 수 없다. 옛날 Tv리모콘으로는 캡션티비의 캡션기능을 다룰 수 없는것과
		t1.channelDown();		//같다. 그리고 자손타입의 참조변수로는 조상타입의 인스턴스를 형성할 수 없다. 예를 들면 캡션기능이 있는 리모컨과
		System.out.println(t1.channel);//옛날 Tv를 한세트로 묶어서 판매하는 것을 생각해보면 된다. 캡션기능을 실행할 수 없는 Tv인데 리모컨만
//		t1.text="이것은 되지 않는다.";			//캡션기능 버튼이 있으면 말이 안됀다. 요것이 바로 다형성이다.
		c.text="이것은 된다.";
//		t1.caption();//이것은 안됀다.
		c.caption();//이것은 된다.
		

	}

}
class Tv{
	boolean power;
	int channel;
	
	void power() {
		power=!power;
		if(power==false) {
			System.out.println("off");
		}else if(power==true) {
			System.out.println("on");
		}
	}
	
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
}
class CaptionTv extends Tv{
	String text;
	
	void caption() {
		System.out.println(text);
	}
}