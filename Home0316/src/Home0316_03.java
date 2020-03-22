
public class Home0316_03 {

	public static void main(String[] args) {
		Child c = new Child();
		c.see();

		Child1 c1 = new Child1();
		c1.see();
	}

}

class Parent {
	int x = 20;

}

class Child extends Parent {
	int x = 10;

	void see() {
		System.out.println("x:" + x);
		System.out.println("this.x:" + this.x);
		System.out.println("super.x:" + super.x);//super는 조상클래스의 주소값을 갖는 참조변수이다. 

	}

}

class Parent1 {
	int x = 20;

	void see() {
		System.out.println("x:" + x);
		System.out.println("this.x:" + this.x);
	}
}

class Child1 extends Parent1 {

	void see() {
		super.see();//조상의 변수를 참조할 수 있는 것처럼 조상의 메소드 또한 참조할 수 있다.
		System.out.println("super.x:" + super.x);

	}

}