
public class Home0318_03 {

	public static void main(String[] args) {
		Buyer b=new Buyer();
//		Tv1 t=new Tv1();
//		Radio r=new Radio();
//		Chair c=new Chair();
		
//b.buy(t);
//b.buy(c);	//�� ��ǰ�� �춧���� ���� �ٸ� �����ε��� �޼��带 ����ؾ��Ѵ�. ��ǰ������ŭ �޼��尡 �־���Ѵٴ� ���̴�.
//b.buy(c);	//�׷��� ����ǰ�� �������� ��� ���������� ���� �ν��Ͻ��� �־�ȴٴ� ����� �����ϰ�
//b.buy(r);	//������ ���������� �ڼ��� �ν��Ͻ��� ������ �� �ִٴ� ����� �����غ���
//b.buy(r);	//�Ʒ��� �޼������ �Ű������� ������ ���������� �ִ� �ѳ��� �޼��常 ����� 
//b.buy(t);	//�����Ҷ� ������ �ν��Ͻ��� �־��شٸ� �޼��� �ϳ��� ������ ��ǰ�� ������ �� �ְԵȴ�. ó�� ���� �ϳ��� �����ϴ� �޼���� �ּ�ó���ϰ� 
// ������ ���������� �Ű������� �޴� �޼��� �ϳ��� �����ڴ�.
// ����17���� �ٿ��� ������ ���������� �Ű������� �޴� buy�޼��带 �����ϰ� ���ƿ� ���̴�. ���θ޼��� �� ���κп�
//�� ��ǰ�� �ν��Ͻ��� �����س��ұ⶧���� ���� �� ���������� �� ���¿����� ���Ű� �ȴ�. ������ ��ü�� �����ϰԵǸ� �ּҰ��� �������� ���Ŵ� �ȵȴ�.
//������ Product p�� ���������� �Ű������� �޴� �޼��带 ���� ���¿��� ���� ��ǰ���� ������ �ν��Ͻ��� ������ �ʿ䰡 ����.�׷��� �����Ѵ�.
b.buy(new Tv1());
b.buy(new Radio());
b.buy(new Chair());//���� �� �޼��忡 �Ű������ȿ� ����ִ� �ν��Ͻ����� Product p=new Tv1/
b.buy(new Radio());									//Product p=new Chair/
System.out.println(b.money);						//Product p=new Radio�� ���� ����Ÿ���� ���������� �ڼ��� �ν��Ͻ��� ������ ���¸� ���÷����� ������ �� �ִ�.
System.out.println(b.bonusPoint);//�Ʒ����� ���� �޼��忡 �� Product p�� �������� ���� Product�� ��ӹ޴� ��� �ڼյ��� �ν��Ͻ��� �����Ͽ� ���Ÿ� �� �� �ְ� ����� ���̴�.
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
//			t) {//buy�޼��忡 �Ű������� Tv t�� �ްԵǸ� �� �� ��ǰ�� ���������� �Ű������� �ްԵǸ� ��ǰ�� �þ������ �޼��带 ��� ���������Ѵ�. 
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