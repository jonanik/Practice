
public class Home0314_02 {

	public static void main(String[] args) {
		//��ü�� ���� ����2
		
		Tv t1=new Tv(); //�������� t1�� TV�ν��Ͻ��� �����Ͽ� �ν��Ͻ��� �ּҰ��� �ִ´�.
		Tv t2=new Tv();//�⺻������ 8�����ΰͿ� ���� ���������� ������ �������� �ʴ� ������ Ŭ���� �� ��������� ������ ���ϴ¸�ŭ �� Ÿ���� ���� �����̴�. 
						//���⼱ Tv Ÿ���� �������� t1�� �ν��Ͻ��� �����Ͽ� �� �ּҰ��� �־ Tv�ν��Ͻ��� TvŸ�� �������� t1�� ���� �̿��� �� �ִ�.�� ǥ���� �� �ִ�.
		
		t1.channel=7;
		t2.channel=8;
		
		t1.channelUp();
		System.out.println(t1.channel);//8�̴�.
		t2.channelDown();
		System.out.println(t2.channel);//7�̴�.
		
		t1.power();	
		t2.power();
		t1.power();
		t2.power();
	t1.power1();
	t2.power1();
		
	t2=t1;
	
	System.out.println(t2.channel);//t1�� �ּҰ��� ������ �ֱ⶧���� t1�� ���� ���� ���´�. �� 8

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