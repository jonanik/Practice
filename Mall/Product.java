
public class Product {

	int code;	// 상품 고유 코드
	String name;	// 상품 이름
	int price;	// 가격
	int point;	// 적립 포인트
	String option;	// 추가 기능
	
	public Product() {}
	
	public Product(int code, String name, int price, int point, String option) {
		super();
		this.code = code;
		this.name = name;
		this.price = price;
		this.point = point;
		this.option = option;
	}
}

// 티비
class Tv extends Product{
	String screen;	// 스크린
	int inch;	// 화면 크기
	public Tv(int code, String name, int price, int point, String option, String screen, int inch) {
		super(code, name, price, point, option);
		this.screen = screen;
		this.inch = inch;
	}
	@Override
	public String toString() {
		return "스크린[" + screen + "], 크기[" + inch + "인치]";
	}
}

// 냉장고
class Fridge extends Product{
	int liter;	// 리터
	String door;	// 문
	public Fridge(int code, String name, int price, int point, String option, int liter, String door) {
		super(code, name, price, point, option);
		this.liter = liter;
		this.door = door;
	}
	@Override
	public String toString() {
		return "리터[" + liter + "], 문 형태[" + door + "]";
	}
}

// 세탁기
class Washer extends Product{
	int size;	// 사이즈
	String shape;	// 형태
	public Washer(int code, String name, int price, int point, String option, int size, String shape) {
		super(code, name, price, point, option);
		this.size = size;
		this.shape = shape;
	}
	@Override
	public String toString() {
		return "사이즈[" + size + "], 형태[" + shape + "]";
	}
}