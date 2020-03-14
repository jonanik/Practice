
public class Home0315_03 {

	public static void main(String[] args) {
		//생성자 이용
		// 생성자는 초기화 메서드이다. 메서드인데 굳이 생성자라고 부르는 이유는 리턴값이 없고  항사없어서 void조차 붙이지 않기 때문이다.
						// 이렇게 인스턴스를 형성할떄 구체적으로 살펴보면 Car타입의 참조변수 c에다가
						//new 연산자에 의해 인스턴스가 형성되고 형성된 인스턴스의 멤버변수들의 값을 Car(); 생성자를 통해 초기화시켜서
						//초기화된 멤버변수를 갖게된 인스턴스의 주소값을 Car타입의 참조변수 c에 담는다.고 설명할 수 있다.
		//매개변수를 갖지 않는 생성자 이용할 경우
		Car c=new Car();
		c.gear="auto";
		c.door="4";
		c.color="white";	
		System.out.println(c);//이건 기본생성자가 매개변수가 있는 생성자를 이용하여 기본값을 갖고 있지만 c.을 이용해 값을 다시 입력하여 출력하게되어
								//메인메서드에서 입력한 값이 출력된다.
		
		//매개변수를 갖는 생성자를 이용할 경우;
		Car c1=new Car("sudong","5","black");
		System.out.println(c1);//이렇게 코드를 줄일 수 있게 된다. 다만 매개변수가 있는 생성자를 만들경우 컴파일러가 자동으로 생성했던 기본생성자를
								//생성하지 않기 때문에 기본 생성자를 같이 적어주는 습관을 갖는것이 좋다. 아니면 매개변수를 갖는 생성자만 쓰던가.
		Car c2=new Car();
		System.out.println(c2);//기본생성자가 매개변수가 있는 생성자를 이용하여 초기화한 값이 나온다.
		
	}

}
class Car{
	String gear;
	String door;
	String color;
	
	Car(){
		this("auto","6","gray");//this는 인스턴스 자신을 가르키는 참조변수이다. 이렇게 하면 같은 클래스의 매개변수있는 생성자를 이용할 수 있다.
	}
	Car(String gear,String door,String color){
		this.gear=gear;//인스턴스 자신을 가르키는 참조변수 this를 붙임으로써 코드를 좀더 이해하기 쉽게 구성할 수 있다.
		this.door=door;
		this.color=color;
	}
	@Override
	public String toString() {
		return "Car [gear=" + gear + ", door=" + door + ", color=" + color + "]";
	}
	
}