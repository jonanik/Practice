
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
	private int hour; //접근제어자 private는 같은 클래스내에서만 접근이 가능하다. 접근제어자 public은같은 클래스 같은 패키지 자손클래스 전체에서 접근가능하고 protected는 같은 클래스 같은 패키지 자손 클래스까지같 접근가능하다.
	private int minute;// 아무것도 안붙으면 default 인데 같은 클래스 같은 패키지까지 접근가능하다. 
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
