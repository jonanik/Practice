import java.util.Scanner;

public class Home0207_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int point = 0;
		int select = 0;
		String plus = "";
		String minus = "";

		loop1: while (true) {
			System.out.println("[���� ��� ���α׷�]");
			System.out.println("������ �Է��ϼ���.");
			point = sc.nextInt();
			System.out.println("-----------------");
			while (true) {
				if (point >= 95) {
					System.out.println("����� ������ A+�Դϴ�. ");
					break;
				}
				if (point >= 90) {
					System.out.println("����� ������ A �Դϴ�.");
					break;
				}
				if (point >= 85) {
					System.out.println("����� ������ B+ �Դϴ�.");
					break;
				}
				if (point >= 80) {
					System.out.println("����� ������ B �Դϴ�.");
					break;
				}
				if (point >= 75) {
					System.out.println("����� ������ C+ �Դϴ�.");
					break;
				}
				if (point >= 70) {
					System.out.println("����� ������ C �Դϴ�.");
					break;
				}
				if (point >= 65) {
					System.out.println("����� ������ D+ �Դϴ�.");
					break;
				}
				if (point >= 60) {
					System.out.println("����� ������ D �Դϴ�.");
					break;
				} else {
					System.out.println("����� ������ F �Դϴ�.");
					break;
				}

			} // while
			System.out.println("-----------------");
			System.out.println("������ �ٽ� �Է�(0)");
			System.out.println("���α׷� ����(99)");
			select = sc.nextInt();
			if (select == 0) {
				continue loop1;
			} else if (select == 99) {
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;
			}

		}
	}// main

}// class
