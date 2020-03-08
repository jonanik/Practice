
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
		return "[상품코드:" + code + "]\t[상품명:" + name + "]\t   [가격:" + price + "]\t[포인트:" + bonusPoint +"]\t[스크린:"+screen+"]\t[인치:"+inch+"]";
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
		return "[상품코드:" + code + "]\t[상품명:" + name + "]\t   [가격:" + price + "]\t[포인트:" + bonusPoint +"]\t[리터:"+liter+"]\t[문개수:"+door+"]";
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
		return "[상품코드:" + code + "]\t[상품명:" + name + "]\t   [가격:" + price + "]\t[포인트:" + bonusPoint +"]\t[사이즈:"+size+"]\t[형태:"+shape+"]";
	}
}