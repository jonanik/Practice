
public class Home0314_02 {

	public static void main(String[] args) {
		//객체의 이해 연습2
		
		Tv t1=new Tv(); //참조변수 t1에 TV인스턴스를 생성하여 인스턴스의 주소값을 넣는다.
		Tv t2=new Tv();//기본변수는 8가지인것에 비해 참조변수의 갯수가 정해지지 않는 이유는 클래스 즉 사용자정의 변수가 정하는만큼 그 타입이 많기 때문이다. 
						//여기선 Tv 타입의 참조변수 t1에 인스턴스를 생성하여 그 주소값을 넣어서 Tv인스턴스를 Tv타입 참조변수 t1을 통해 이용할 수 있다.고 표현할 수 있다.
		
		t1.channel=7;
		t2.channel=8;
		
		t1.channelUp();
		System.out.println(t1.channel);//8이다.
		t2.channelDown();
		System.out.println(t2.channel);//7이다.
		
		t1.power();	
		t2.power();
		t1.power();
		t2.power();
	t1.power1();
	t2.power1();
		
	t2=t1;
	
	System.out.println(t2.channel);//t1의 주소값을 가지고 있기때문에 t1과 같은 값을 갖는다. 즉 8

	}

}
class Tv{
	String color;
	boolean power;
	int channel;
	
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	void power1() {
		power=!power;
		if(power==false) {
			System.out.println("off");
		}else if(power==true) {
			System.out.println("on");
		}
	}
	
	void power() {
		if(power==false) {
			power=true;
			System.out.println("on");
		}else if(power==true) {
			power=false;
			System.out.println("off");
		}
		
	}
}