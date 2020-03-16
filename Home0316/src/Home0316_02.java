
public class Home0316_02 {

	public static void main(String[] args) {
Point3 p=new Point3();
Point3d p1=new Point3d();

System.out.println(p.getlocation());//point클래스는 인스턴스변수 x,y를 가지고 getlocation 이라는 메서드를 가진다.
System.out.println(p1.getlocation());//Point3d클래스는 인스턴스변수 z를가지고 Point 클래스를 상속받는다.
									//상속을 받음으로써 Point3d클래스는 Point 클래스의 멤버변수와 메서드를 모두 받게된다.
									//하지만 3d포인트는 x,y뿐 아니라 z값까지 출력해야 하므로 메서드를 약간 변경할 필요가 있다.
									//이때 오버로딩은 조상클래스의 메서드를 그대로 가져와서 구현부를 자손클래스에 맞게 수정하여 사용하는 것이다.

	

		

	}

}
class Point3{
	int x;
	int y;
	
	Point3(){
		this(3,4);
	}
	Point3(int x,int y){
	this.x=x;
	this.y=y;
	}
	
	void test() {
		
	}
	
	String getlocation() {
		return "x:"+x+"\ty:"+y;
	}
}
class Point3d extends Point3 {
	int z;
	
	Point3d(){
		this(7);
	}
	Point3d(int z){
		this.z=z;
	}
	String getlocation() {
		return "x:"+x+"\ty:"+y+"\tz:"+z;
	}
	
	void test() {//조상의 메서드와 선언부가 같다. 이것은 오버라이딩 재선언
		
	}
	void test(int i) {//이거는 위의 오버라이딩된 메서드와 메서드명은 같은데 매개변수가 다르다. 오버로딩이다.
	}
	void test1() {
		
	}
	void test1(int k) {//오버로딩
	}
	void test1() {//같은 것을 반복선언한 에러임
		
	}
	
	
	
	
	
}