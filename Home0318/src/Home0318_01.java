
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
		c.text="�Ƶ� ��Ž� ĸ�� Ƽ�񱸸�";
		c.caption();
		c.caption();
		c.caption();
		
		Tv t1=new CaptionTv();// �������̶�� ���� �̿� ����  ����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� �ٷ� �� �ִ� Ư���� ���Ѵ�.
		t1.channel=9;			//�̶� ����Ÿ������ ����� �ڼ�Ÿ���� �ν��Ͻ��� ������ ������ ������ �ִ� ����� ����� �� �ִ�.
		t1.channelDown();		//�̷��� ����� ���¿��� �ڼ��� ����� �ٷ� �� ����. ���� Tv���������δ� ĸ��Ƽ���� ĸ�Ǳ���� �ٷ� �� ���°Ͱ�
		t1.channelDown();		//����. �׸��� �ڼ�Ÿ���� ���������δ� ����Ÿ���� �ν��Ͻ��� ������ �� ����. ���� ��� ĸ�Ǳ���� �ִ� ��������
		System.out.println(t1.channel);//���� Tv�� �Ѽ�Ʈ�� ��� �Ǹ��ϴ� ���� �����غ��� �ȴ�. ĸ�Ǳ���� ������ �� ���� Tv�ε� ��������
//		t1.text="�̰��� ���� �ʴ´�.";			//ĸ�Ǳ�� ��ư�� ������ ���� �ȉ´�. ����� �ٷ� �������̴�.
		c.text="�̰��� �ȴ�.";
//		t1.caption();//�̰��� �ȉ´�.
		c.caption();//�̰��� �ȴ�.
		

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