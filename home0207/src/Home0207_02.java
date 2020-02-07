import java.util.Scanner;

public class Home0207_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int point = 0;
		int select = 0;
		String plus = "";
		String minus = "";

		loop1: while (true) {
			System.out.println("[학점 계산 프로그램]");
			System.out.println("점수를 입력하세요.");
			point = sc.nextInt();
			System.out.println("-----------------");
			while (true) {
				if (point >= 95) {
					System.out.println("당신의 성적은 A+입니다. ");
					break;
				}
				if (point >= 90) {
					System.out.println("당신의 성적은 A 입니다.");
					break;
				}
				if (point >= 85) {
					System.out.println("당신의 성적은 B+ 입니다.");
					break;
				}
				if (point >= 80) {
					System.out.println("당신의 성적은 B 입니다.");
					break;
				}
				if (point >= 75) {
					System.out.println("당신의 성적은 C+ 입니다.");
					break;
				}
				if (point >= 70) {
					System.out.println("당신의 성적은 C 입니다.");
					break;
				}
				if (point >= 65) {
					System.out.println("당신의 성적은 D+ 입니다.");
					break;
				}
				if (point >= 60) {
					System.out.println("당신의 성적은 D 입니다.");
					break;
				} else {
					System.out.println("당신의 성적은 F 입니다.");
					break;
				}

			} // while
			System.out.println("-----------------");
			System.out.println("성적을 다시 입력(0)");
			System.out.println("프로그램 종료(99)");
			select = sc.nextInt();
			if (select == 0) {
				continue loop1;
			} else if (select == 99) {
				System.out.println("프로그램을 종료합니다.");
				break loop1;
			}

		}
	}// main

}// class
