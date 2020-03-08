
public class Product {
	String code;
	String name;
	int price;
	int bonusPoint=0;

	Product() {
	}

	Product(String code, String name, int price, int bonusPoint) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.bonusPoint = bonusPoint;
	}

}

class Tv extends Product {
	String screen;
	String inch;

	Tv() {
	}

	Tv(String code, String name, int price, int bonusPoint, String screen, String inch) {
		super(code, name, price, bonusPoint);
		this.screen = screen;
		this.inch = inch;
	}
	public String toString() {
		return "[��ǰ�ڵ�:" + code + "]\t[��ǰ��:" + name + "]\t   [����:" + price + "]\t[����Ʈ:" + bonusPoint +"]\t[��ũ��:"+screen+"]\t[��ġ:"+inch+"]";
	}
}

class Fridge extends Product {
	String liter;
	String door;

	Fridge() {
	}

	Fridge(String code, String name, int price, int bonusPoint, String liter, String door) {
		super(code, name, price, bonusPoint);
		this.liter = liter;
		this.door = door;
	}
	public String toString() {
		return "[��ǰ�ڵ�:" + code + "]\t[��ǰ��:" + name + "]\t   [����:" + price + "]\t[����Ʈ:" + bonusPoint +"]\t[����:"+liter+"]\t[������:"+door+"]";
	}
}

class Laundary extends Product {
	String size;
	String shape;

	Laundary() {
	}

	Laundary(String code, String name, int price, int bonusPoint, String size, String shape) {
		super(code, name, price, bonusPoint);
		this.size = size;
		this.shape = shape;
	}
	public String toString() {
		return "[��ǰ�ڵ�:" + code + "]\t[��ǰ��:" + name + "]\t   [����:" + price + "]\t[����Ʈ:" + bonusPoint +"]\t[������:"+size+"]\t[����:"+shape+"]";
	}
}