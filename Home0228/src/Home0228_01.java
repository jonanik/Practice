import java.util.Scanner;

public class Home0228_01 {
public static void main(String[] args) {
	Buyer b=new Buyer();
	b.buy(new Tv());
	b.buy(new Computer());

	System.out.println("���糲�� ����"+b.money+"�����Դϴ�.");
	System.out.println("���� ���ʽ�������"+b.bonusPoint+"�� �Դϴ�.");
	
	   }
}
class Product{
	int price;
	int bonusPoint;
	
	Product(){
		
	}
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
	
}

class Tv extends Product{
	Tv(){
		super(100);
	}
	public String toString() {return "TV";}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	public String toString() { return "Computer";}
}

class Buyer {
	int money=1000;
	int bonusPoint=0;
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}
		money=money-p.price;
		bonusPoint=bonusPoint+p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
}



