
public class Home0314_01 {

	public static void main(String[] args) {
		//객체의 이해 연습1
		
		Time[] t=new Time[3];//참조변수 3개의 주소값이 생성된 것
	
			t[0]=new Time(1,50,29);//t0, t1, t2의 주소값에 인스턴스가 형성되었고.
			t[1]=new Time(1,40,30);//형성된 인스턴스의 주소값이 각 참조변수에 저장되었다.
			t[2]=new Time(1,30,40);//생성자의 형식에 따라 바로 변수값을 넣고 생성하였다.
			
			for(int i=0; i<t.length;i++) {
				System.out.println(t[i]);
			}
		
		
		
	}

}
class Time{
	int hour;
	int minute;
	int second;
	
	Time(){
		
	}
	Time(int hour, int minute, int second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	@Override
	public String toString() {
		return hour + "시\t" + minute + "분\t" + second +"초";
	}
	
	
}