
public class Home0317_01 {

	public static void main(String[] args) {
		Time t=new Time(2,20,30);
	t.setTime(3, 30, 39);
	System.out.println(t.getTime());
	
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		s1.a=20;
		s2.a=30;
		
		System.out.println(s1.a);
		System.out.println(s2.a);
	}

}
class Time{
	private int hour; //���������� private�� ���� Ŭ������������ ������ �����ϴ�. ���������� public������ Ŭ���� ���� ��Ű�� �ڼ�Ŭ���� ��ü���� ���ٰ����ϰ� protected�� ���� Ŭ���� ���� ��Ű�� �ڼ� Ŭ���������� ���ٰ����ϴ�.
	private int minute;// �ƹ��͵� �Ⱥ����� default �ε� ���� Ŭ���� ���� ��Ű������ ���ٰ����ϴ�. 
	private int second;
	
	Time(){
		
	}
	Time(int hour,int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
}
	public String getTime() {
		return hour+":"+minute+":"+second;
	}
	public void setTime(int hour, int minute, int second) {
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	
}

final class Singleton{
	private static Singleton s= new Singleton();
	int a;
	private Singleton(){
		
	}
	
	public static Singleton getInstance() {
		if(s==null) {
			s=new Singleton();
		}
		return s;
		
	}
	
}
