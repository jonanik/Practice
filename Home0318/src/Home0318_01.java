
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
		
		Tv t1=new CaptionTv();
		t1.channel=9;
		t1.channelDown();
		t1.channelDown();
		System.out.println(t1.channel);
//		t1.text="이것은 되지 않는다.";
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