
public class Home0314_04 {

	public static void main(String[] args) {
		Method m=new Method();
		int result1=0;
		long result2=0;
		m.print();
		
		
		result1=m.plus(3, 4);
		System.out.println(result1);
		result2=m.minus(300,200);
		System.out.println(result2);
	}

}
class Method{
	void print() {
		System.out.println("메서드는 선언부와 구현부로 구성된다. 선언부는 리턴타입 메서드명 매개변수를 정한다.");
		System.out.println("구현부는 메서드가 실행되는 부분이다. 선언부에서 리턴타입은 타입을 지정해주거나");
		System.out.println("반환결과가 없어도 될경우 void로 하여 반환결과값이 없을 수 도 있다.");
		System.out.println("그리고 메서드가 정상적으로 끝나는 상황은 메서드 블럭내의 과정이 모두 끝날때와");
		System.out.println("메서드내 구현부에서 과정이 수행되다가 return을 만났을 때이다.");
		System.out.println("선언부에 리턴타입이 정해져있을 경우 return 결과값  으로 표시되어야한다.");
		System.out.println("이때 결과값은 선언부의 리턴타입과 같아야한다. 결과값이 없을경우 return");
		System.out.println("만 선언하여 메서드에서 나올 수 있다.");
	}
	int plus(int a, int b) {
		int result=0;
		result=a+b;
		return result;//결과 값은 선언부의 리턴타입과 같아야 한다. 또는 자동형변환 되는 값이어야한다. 
	}
	long minus(long a,long b) {
		long result=0;
		result=a-b;
		return result;
	}
	
}