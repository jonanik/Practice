
public class Home0318_02 {

	public static void main(String[] args) {
		Car c=new Car();
		FireEngine f=new FireEngine();//f a는 모두 조상인 c의 멤버를 사용할 수 있다. 
		Ambulance a=new Ambulance();//다형성을 이용하여 조상인 Car타입의 참조변수 c로 f와 c에 담긴 기능을 사용하기 위한 방법을 공부해보자
		Car c1=new FireEngine();//이렇게 조상타입의 참조변수로 자손타입의 인스턴스를 형성해본다.
		c1.drive();
		c1.turnLeft();// FireEngine인스턴스를 형성했지만 FireEngine이 Car를 상속하고 있기때문에 Car가진 모든 기능을 사용할 수 있다. Car가 기존에 가지고 있던 메서드들은 당연히 호출가능하다.하지만 
//		c1.water();//하지만 조상타입의 참조변수로 자손타입의 인스턴스를 형성하게 되면 자손이 가지고 있는 멤버들은 사용할 수 없다. 왜냐면 조상타입의 리모컨으로는 자손이 가지고 있는 새로운 기능을 다룰 수 없기때문이다.
		FireEngine f1=null;
		f1=(FireEngine)c1;//하지만 이렇게 조상타입의 참조변수를 자손타입의 참조변수에 형변환하여 담게되면 이제 water메서드를 사용할 수 있게된다.
		f1.water();
		
		Car c2=new Ambulance();//조상타입의 참조변수인 c2로는 자손타입의 인스턴스에 있는 메서드 siren을 사용할 수 없다. 오래된 리모컨으로 새로운 제품의 새로운 기능을 다루려는것은 안되는것과 같다.
		Ambulance a1=null;
		a1=(Ambulance)c2;//조상타입의 참조변수 c2를 자손타입의 참조변수 a1으로 형변환을 하게 되면  a1도 c2가 가르키고 있던 Ambulance인스턴스를 가르키게되면서  자손 타입의 인스턴스의 멤버를 사용할 수 있게된다.
		a1.siren();
		
		
		
	}

}
class Car{
	
	void drive(){
		System.out.println("brrrr~~");
	}
	void back() {
		System.out.println("br.....");
	}
	void turnRight() {
		System.out.println("turn...Right!!!");
	}
	void turnLeft() {
		System.out.println("turn...Left!!!");
	}
}
class FireEngine extends Car{
	void water() {
		System.out.println("water~~~~");
	}
}
class Ambulance extends Car{
	void siren() {
		System.out.println("sirennnn~~~~!!");
	}
}