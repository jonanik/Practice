
class Test{int x;}
public class Home0315_01 {

	public static void main(String[] args) {
		Test t=new Test();
		t.x=10;
		System.out.println(t.x);//t.x는 10이다.
	;//text메서드에 매개변수로 t.x(10)을 넣는다. 하지만 test메서드내의 지역변수 x가
					//100이 되어  리턴값은 x=100이다.
		System.out.println(test(t.x));//100 이건 매개변수로 그냥 기본형인스턴스 변수를 받게되면 그 변수값을 읽을순 있지만 
										//변경할 수 없다는걸 보여준다. 
		
		System.out.println(test1(t));//이건 매개변수로 Test 타입의 참조변수를 받는 것을 보여준다.
									//매개변수로 참조변수를 받으면 주소값을 받는 것이기 때문에
									//매서드 내에서 주소값을 이용해 값을 변경하면 변수의 값을 변경할 수 있다.
		
	}
static int test(int a) {
	int x=100;
	return x;
}
static int test1(Test t) {
	t.x=10000;
	return t.x;
}
}
