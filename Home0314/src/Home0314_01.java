
public class Home0314_01 {

	public static void main(String[] args) {
		//��ü�� ���� ����1
		
		Time[] t=new Time[3];//�������� 3���� �ּҰ��� ������ ��
	
			t[0]=new Time(1,50,29);//t0, t1, t2�� �ּҰ��� �ν��Ͻ��� �����Ǿ���.
			t[1]=new Time(1,40,30);//������ �ν��Ͻ��� �ּҰ��� �� ���������� ����Ǿ���.
			t[2]=new Time(1,30,40);//�������� ���Ŀ� ���� �ٷ� �������� �ְ� �����Ͽ���.
			
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
		return hour + "��\t" + minute + "��\t" + second +"��";
	}
	
	
}