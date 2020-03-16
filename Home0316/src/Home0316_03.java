
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
		System.out.println("super.x:" + super.x);

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
		super.see();
		System.out.println("super.x:" + super.x);

	}

}