import java.util.Scanner;

public class Home0228_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			Buyer b = new Buyer();
			System.out.println("[천리마 마트]");
			System.out.println("1.TV    2.컴퓨터      3.책상       4.의자      5.핸드폰");
			System.out.println("6.구매 목록 및 총구매 금액     7.보유 금액 및 보너스 포인트");
			System.out.println("8.보유금액 충전하기   9.구매목록 삭제   10.구매상품 검색");
			System.out.println("0.프로그램 종료");
			System.out.println("메뉴를 선택하세요.");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				b.buy(new Tv());
				break;
			case 2:
				b.buy(new Com());

				break;
			case 3:
				b.buy(new Desk());
				break;
			case 4:
				b.buy(new Chair());
				break;
			case 5:
				b.buy(new CellPhone());
				break;
			case 6:
				b.print();
				break;
			case 7:
				b.money_point();
				break;
			case 8:
				b.charge();
				break;
			case 9:
				break;
			case 10:
				break;
			case 0:
				break;

			}

		}
	}
}

class Buyer {
	Product[] cart = new Product[10];
	int money = 1000000;
	int bonus = 0;
	int count = 0;
	int sum=0;
	int buy_count=0;
	void buy(Product p) {
		System.out.println(p.name + "을/를 구매하셨습니다.");
		cart[count++]=p;
		sum+=p.price;
		buy_count++;
		money -= p.price;
		bonus += p.bonus;
	}
	void print() {//구매목록
		System.out.println("총 구매 금액:"+sum+"원");
		for(int i=0; i<buy_count;i++) {
			System.out.print(cart[i].name+"  ");
		}
	}
	void money_point() {
		System.out.println("보유금액:"+money+"원");
		System.out.println("보너스 포인트:"+bonus+"점");
	}
	void charge() {
		Scanner scan=new Scanner(System.in);
		System.out.println("충전할 금액을 입력해주세요.");
		int charge_m=scan.nextInt();
		money+=charge_m;
		System.out.println(charge_m+"원이 충전되었습니다.");
		System.out.println("현재 보유금액:"+money+"원");
	}
	void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.println("환불할 상품을 선택하세요.");
		String stuff=scan.next();
		for(int i=0; i<buy_count;i++) {
			if(stuff.equals(cart[i].name)) {
				money+=cart[i].price;
				bonus-=cart[i].bonus;
				cart[i]=new Product("",0,0);
		}
			
		}
	}
}

class Tv extends Product {
	Tv() {
		super("TV", 5000, 0);
	}
}

class Com extends Product {
	Com() {
		super("컴퓨터", 10000, 0);
	}
}

class Desk extends Product {
	Desk() {
		super("책상", 1500, 0);
	}
}

class Chair extends Product {
	Chair() {
		super("의자", 1000, 0);
	}
}

class CellPhone extends Product {

	CellPhone() {
		super("핸드폰", 10000, 0);
	}
}

class Product {
	String name;
	int price;
	int bonus;

	Product() {

	}

	Product(String name, int price, int bonus) {
		this.name = name;
		this.price = price;
		this.bonus = price / 10;
	}
}