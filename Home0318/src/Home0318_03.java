
public class Home0318_03 {

	public static void main(String[] args) {
		Buyer b=new Buyer();
//		Tv1 t=new Tv1();
//		Radio r=new Radio();
//		Chair c=new Chair();
		
//b.buy(t);
//b.buy(c);	//각 제품을 살때마다 각각 다른 오버로딩된 메서드를 사용해야한다. 제품개수만큼 메서드가 있어야한다는 것이다.
//b.buy(c);	//그런데 각제품의 참조변수 대신 참조변수에 들어가는 인스턴스를 넣어도된다는 사실을 생각하고
//b.buy(r);	//조상의 참조변수가 자손의 인스턴스를 형성할 수 있다는 사실을 생각해보면
//b.buy(r);	//아래의 메서드들의 매개변수에 조상의 참조변수를 넣는 한나의 메서드만 만들고 
//b.buy(t);	//구매할때 각각의 인스턴스를 넣어준다면 메서드 하나로 수많은 제품을 구매할 수 있게된다. 처음 만든 하나씩 존재하는 메서드는 주석처리하고 
// 조상의 참조변수를 매개변수로 받는 메서드 하나를 만들어보겠다.
// 현재17번재 줄에선 조상의 참조변수를 매개변수로 받는 buy메서드를 형성하고 돌아온 뒤이다. 메인메서드 맨 윗부분에
//각 제품의 인스턴스를 형성해놓았기때문에 위의 각 참조변수만 들어간 상태에서도 구매가 된다. 하지만 객체를 삭제하게되면 주소값만 들어간상태의 구매는 안된다.
//하지만 Product p의 참조변수를 매개변수로 받는 메서드를 만든 상태에서 굳이 제품만다 일일이 인스턴스를 생성할 필요가 없다.그래서 삭제한다.
b.buy(new Tv1());
b.buy(new Radio());
b.buy(new Chair());//지금 이 메서드에 매개변수안에 들어있는 인스턴스들은 Product p=new Tv1/
b.buy(new Radio());									//Product p=new Chair/
System.out.println(b.money);						//Product p=new Radio와 같이 조상타입의 참조변수로 자손의 인스턴스를 형성한 상태를 떠올려보면 이해할 수 있다.
System.out.println(b.bonusPoint);//아래에서 만든 메서드에 들어간 Product p로 다형성에 의해 Product를 상속받는 모든 자손들의 인스턴스를 형성하여 구매를 할 수 있게 만드는 것이다.
	}

}
class Product{
	int price;
	int bonusPoint;
	
	Product(){
		
	}
	Product(int price,int bonusPoint){
		this.price=price;
		this.bonusPoint=bonusPoint;
	}
}
class Tv1 extends Product{
	Tv1(){
		super(1000,100);
	}
}
class Radio extends Product{
	Radio(){
		super(500,50);
	}
}
class Chair extends Product{
	Chair(){
		super(100,10);
	}
}
class Buyer{
	int money=10000;
	int bonusPoint=0;
	
//	void buy(Tv1
//			t) {//buy메서드에 매개변수로 Tv t를 받게되면 즉 각 상품의 참조변수를 매개변수로 받게되면 제품이 늘어날때마다 메서드를 계속 만들어줘야한다. 
//		money-=t.price;
//		bonusPoint+=t.bonusPoint;
//	}
//	void buy(Radio r) {
//		money-=r.price;
//		bonusPoint+=r.bonusPoint;
//	}
//	void buy(Chair c) {
//		money-=c.price;
//		bonusPoint+=c.bonusPoint;
//	}
	void buy(Product p){
		money-=p.price;
		bonusPoint+=p.bonusPoint;
	}
}