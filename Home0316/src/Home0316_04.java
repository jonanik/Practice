
public class Home0316_04 {

	public static void main(String[] args) {
		Point53d p=new Point53d();
System.out.println(p.x+p.y+p.z);
System.out.println(p.x);
System.out.println(p.y);
System.out.println(p.z);
	}

}

class Point5 {
	int x;
	int y;
	int z;

	Point5(int x, int y) {
		this.x = x;
		this.y = y;

	}

}

class Point53d extends Point5 {
	int z;

	Point53d() {
		this(3, 4, 5);

	}

	Point53d(int x, int y, int z) {// 최상위 object클래스를 제외한 모든 클래스의 생성자는 생성자의 첫줄에 다른 생성자, 조상의 기본생성자를 호출하게 되어있다.
									// 그래서 현재 이 상태에서 super(x,y);로 조상클래스인 Point5의 매개변수가 있는 생성자를 호출하지 않게 되면
		super(x, y); // 에러가 난다. 왜냐면 Point53d의 생성자의 첫줄에서 조상클래스인 Point5의 기본생성자를 호출하는데 Point5에는
		this.z = z; // 매개변수가 있는 생성자만 있어서 기본생성자를 호출하지 못하게 되는 것이다.
	} // 추가적으로 조상의 멤버변수는 조상의 생성자로 초기화해주는것이 좋다고 한다.

}