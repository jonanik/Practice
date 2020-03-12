import java.util.Scanner;

public class Home0228_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			Buyer b = new Buyer();
			System.out.println("[õ���� ��Ʈ]");
			System.out.println("1.TV    2.��ǻ��      3.å��       4.����      5.�ڵ���");
			System.out.println("6.���� ��� �� �ѱ��� �ݾ�     7.���� �ݾ� �� ���ʽ� ����Ʈ");
			System.out.println("8.�����ݾ� �����ϱ�   9.���Ÿ�� ����   10.���Ż�ǰ �˻�");
			System.out.println("0.���α׷� ����");
			System.out.println("�޴��� �����ϼ���.");
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
		System.out.println(p.name + "��/�� �����ϼ̽��ϴ�.");
		cart[count++]=p;
		sum+=p.price;
		buy_count++;
		money -= p.price;
		bonus += p.bonus;
	}
	void print() {//���Ÿ��
		System.out.println("�� ���� �ݾ�:"+sum+"��");
		for(int i=0; i<buy_count;i++) {
			System.out.print(cart[i].name+"  ");
		}
	}
	void money_point() {
		System.out.println("�����ݾ�:"+money+"��");
		System.out.println("���ʽ� ����Ʈ:"+bonus+"��");
	}
	void charge() {
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �ݾ��� �Է����ּ���.");
		int charge_m=scan.nextInt();
		money+=charge_m;
		System.out.println(charge_m+"���� �����Ǿ����ϴ�.");
		System.out.println("���� �����ݾ�:"+money+"��");
	}
	void delete() {
		Scanner scan=new Scanner(System.in);
		System.out.println("ȯ���� ��ǰ�� �����ϼ���.");
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
		super("��ǻ��", 10000, 0);
	}
}

class Desk extends Product {
	Desk() {
		super("å��", 1500, 0);
	}
}

class Chair extends Product {
	Chair() {
		super("����", 1000, 0);
	}
}

class CellPhone extends Product {

	CellPhone() {
		super("�ڵ���", 10000, 0);
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