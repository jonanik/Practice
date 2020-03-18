import java.util.ArrayList;

public class Home0318 {
	public static void main(String[] args) {
		Buyer1 b= new Buyer1();
		b.buy(new Bag());
		b.buy(new Computer());
		b.buy(new Shose());
		b.buy(new Computer());
		b.buy(new Bag());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Shose());
		b.buy(new Computer());
		
		for(int i=0; i<b.cart.size();i++) {
			System.out.println(b.cart.get(i));
			
		}
		
	}
}
class Product1{
	int price;
	int bonusPoint;
	String name;
	Product1(){
		
	}
	Product1(String name,int price, int bonusPoint){
		this.price=price;
		this.bonusPoint=bonusPoint;
		this.name=name;
	}
	@Override
	public String toString() {
		return "[price=" + price + ", bonusPoint=" + bonusPoint + ", name=" + name + "]";
	}	
	
	
}
class Bag extends Product1{
	
	Bag(){
		super("Bag",1000,100);
	}
}
class Shose extends Product1{
	Shose(){
		super("Shose",800,80);
	}
}
class Computer extends Product1{
	Computer(){
		super("Computer",2000,200);
	}
}

class Buyer1{
	int money=100000;
	int bonusPoint=0;
	int count=0;
	ArrayList<Product1> cart=new ArrayList<Product1>();
	
	void buy(Product1 p) {
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		cart.add(p);
		
	}
}