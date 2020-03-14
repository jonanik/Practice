
public class Home0315_02 {

	public static void main(String[] args) {
		//class메서드 사용
		System.out.println(Test1.classMethod(3,4));
		
		//instance메서드 사용
		Test1 t=new Test1();
		t.a=3;
		t.b=100;
		t.instanseMethod();
System.out.println(	t.instanseMethod());
		
		
	}

}
class Test1{
	int a;
	int b;
	
	int instanseMethod() {
		return a+b;
	}
	
	static int classMethod(int a, int b) {
		return a+b;
	}
	
}