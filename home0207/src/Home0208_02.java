import java.util.Scanner;

public class Home0208_02 {

	public static void main(String[] args) {
		// 학원 강사님 코드 복습 및 잘못된 부분 수정(재입력 하면서 코드 이해)
		// id 상수로 , pass변수로 미리 설정하고 나의 입력값을 if로 비교한다. 이떄
		// 누적 변수 선언해서 if문으로 id,pass 5회이상 잘못입력될 경우 시스템 종료

		final String ID = "aaa";
		String pass = "1234";
		String id_check = "";
		String pass_check = "";
		int login_check = 0;
		int count = 0;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			if (login_check > 4) {
				System.out.println("id,pass가 5번이상 입력되었습니다. 시스템을 종료합니다.");
				break;
			}
			System.out.println("ID를 입력하세요");
			id_check = sc.next();
			if (!(id_check.equals(ID))) {
				login_check++;
				System.out.println("ID가 일치하지 않습니다. 다시 입력하세요" + login_check + "회 오류");
				continue;
			}
			System.out.println("PASS를 입력해주세요.");
			pass_check = sc.next();
			if (!(pass_check.equals(pass))) {
				login_check++;
				System.out.println("Pass가 일치하지 않습니다. 다시 입력하세요." + login_check + "회 오류");
				continue;
			}
			System.out.println("1부터 더하고 싶은 숫자를 입력하세요.");
			count = sc.nextInt();
			for (int i = 1; i <= count; i++) {
				sum += i;
			}
			System.out.printf("1에서 %d까지 총합: %d", count, sum);
			System.out.println("프로그램을 종료합니다.");
			break;

		} // while

	}// main

}// class
