

	public class Product extends ShoppinList {
	String name;
	int bonusPoint;
	int price;
	String color;

	Product() {
	}
	Product(String name, int price, String color) {
		this.name = name;
		this.price = price;
		this.bonusPoint = price / 10;
		this.color = color;

	}
	void see(Product p) {
		System.out.println("제품명:"+p.name+" 가격:"+p.price+" 색깔: "+p.color);
	}

}
//----------------------------------------------------
class Tv extends Product {
	Tv(String name, int price, String color) {
		super(name, price, color);
	}
}
class LCDTV extends Tv {
	LCDTV() {
		super("LCDTV", 1000, "white");
	}
}
class LEDTV extends Tv {
	LEDTV() {
		super("LEDTV", 1200, "white");
	}
}
class OLEDTV extends Tv {
	OLEDTV() {
		super("OLEDTV", 1300, "white");
	}
}
//----------------------------------------------------------
//LCDTV 2)LEDTV 3)OLEDTV 
class Ref extends Product {
	
		Ref(String name, int price, String color) {
			super(name, price, color);
		}
	}


class Onegate extends Ref {
	Onegate() {
		super("단문형 냉장고", 800, "white");
	}
}


class Twogate extends Ref {
	Twogate() {
		super("양문형 냉장고", 1000, "white");
	}
}
//------------------------------------------------------

class Laundary extends Product {

	
	Laundary(String name, int price, String color) {
		super(name, price,color);
	}
}
class TongLaun extends Laundary {
	TongLaun() {
		super("통돌이 세탁기",500, "white");
	}
}

class DrumLaun extends Laundary {
	DrumLaun() {
		super("드럼세탁기", 1050, "white");
	}
}

class DDLaun extends Laundary {
	DDLaun() {
		super("드럼건조세탁기", 1300, "white");
	}
}