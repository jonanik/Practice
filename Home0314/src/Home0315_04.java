
public class Home0315_04 {
	
	
	public static void main(String[] args) {
		Stu s=new Stu();//Stu 인스턴스를 생성하면 제일먼저 Stu클래스가 메서드에 로딩된다. 그리고 다음 클래스 변수가 초기화되면서 메서드 영역에 초기화된다.
						//다음 인스턴스 변수 hakNum이 0으로 초기화 되면서 공간이 생긴다. 그리고 인스턴스 초기화블럭이 실행되면서  클래스 변수인 count가 1증가하고
						//증가한 값이 hakNum에 입력된다. 그리고 생성자에 따라 학번이 출력된다. 인스턴스를 계속 생성하면  생성될때마다 클래스 변수가 0으로 초기화되고
						//hakNum이 0으로 초기화되었다가 인스턴스 초기화블럭에 의해 클래스 변수의 값이 1씩 증가하여 인스턴스변수 hakNum에 입력되어 학번은 1씩 증가한다.
		Stu s1=new Stu();
		Stu s2=new Stu();
		Stu s3=new Stu();
		Stu s4=new Stu();
		
	}

}
class Stu{
	static int count;
	int hakNum;

	{count++;
	hakNum=count;}
	Stu(){
		System.out.println("학번:"+hakNum);
	}
	
}