import java.util.Scanner;

public class Home0223_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[100];
		int[] my = new int[10];
		int select = 0;

		while (true) {
		select=	main_menu();
			switch (select) {
			case 1:
				make_ball(num);
				continue;
			case 2:
				shuffle(num);
				continue;
			case 3:
				putin(num, my);
				continue;
			case 4:
				sort(my);
				continue;
			case 5:
				print(my);
				continue;

			}
		}

	}

	static int main_menu() {
		Scanner scan = new Scanner(System.in);
		int select = 0;
		System.out.println("1.100개의 공 생성");
		System.out.println("2.번호 섞기");
		System.out.println("3.랜덤번호 배열 my에 넣기");
		System.out.println("4.오름차순 정렬하기");
		System.out.println("5.my배열 출력");
		System.out.println("메뉴를 선택하세요.");
		return select = scan.nextInt();
	}

	static void make_ball(int[] num) {
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		System.out.println("--------------------");
		System.out.println("번호 100개를 생성했습니다.");
		System.out.println("--------------------");
	}

	static void shuffle(int[] num) {
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 100);
			int temp = num[0];
			num[0] = num[random];
			num[random] = temp;

		}
		System.out.println("---------------");
		System.out.println("번호를 섞었습니다.");
		System.out.println("---------------");
	}

	static void putin(int[] num, int[] my) {
		for (int i = 0; i < my.length; i++) {
			my[i] = num[i];
		}
		System.out.println("-----------------------------");
		System.out.println("my 배열에 10개의 랜덤 번호를 넣었습니다.");
		System.out.println("-----------------------------");
	}

	static void sort(int[] my) {
		for (int i = 0; i < my.length - 1; i++) {
			for (int j = 0; j < my.length - 1 - i; j++) {
				if (my[j] > my[j + 1]) {
					int temp = my[j];
					my[j] = my[j + 1];
					my[j + 1] = temp;
				}
			}
		}
		System.out.println("-------------------");
		System.out.println("오름차순 정렬을 하였습니다.");
		System.out.println("-------------------");
	}

	static void print(int[] my) {
		for (int i = 0; i < my.length; i++) {
			System.out.print(my[i] + " ");
		}
		System.out.println();
	}

}
