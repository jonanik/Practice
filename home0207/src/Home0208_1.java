import java.util.Scanner;

public class Home0208_1 {

	public static void main(String[] args) {
		// 학원 강사님 코드 복습.(재입력 하면서 코드 이해)
		// for문 안에서 승,패,무의 횟수를 누적변수로 확인할 수 있다. 
		//이때 1,2,3 이외의 수를 냈을 경우는 count++되어 게임 횟수로 치면 안되기때문에 
		//if문을 이용하여 1,2,3이외의 수를 냈을 경우 i--를 해줘야 게임 횟수가 올바로 측정된다.
		String id = "aaa";
		String pass = "1234";
		String id_ch = "";
		String pass_ch = "";

		int user = 0;
		int com = 0;
		int count = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("반복 횟수를 입력하세요.>>");
		count = sc.nextInt();

		while (true) {
			System.out.println("게임하기 전에 log in 해주세요");
			System.out.println("먼저 id를 입력해주세요>>");
			id_ch = sc.next();
			if (!(id.equals(id_ch))) {
				System.out.println("id가 일치하지 않습니다.다시 입력하세요.");
				continue;
			}
			System.out.println("pass를 입력해 주세요.");
			pass_ch = sc.next();
			if (!(pass.equals(pass_ch))) {
				System.out.println("pass가 일치하지 않습니다. 다시 입력하세요.");
				continue;
			}
			for (int i = 1; i <= count; i++) {
				System.out.println("|1.가위 |2.바위| 3.보| 중에 하나를 선택하세요.");
				user = sc.nextInt();

				if (user < 1 || user > 3) {
					System.out.println("당신 숫자를 잘못넣었습니다. 정신차려요(1-3까지만)");
					i--;
					continue;
				}
				com = (int) (Math.random() * 3) + 1;
				System.out.println(i + "번째 판 승자는?");
				System.out.println("---------------");
				// 가위 1 바위 2 보 3
				// 1-3=-2(승리) 1-1=0(무승부) 1-2=-1(패배)
				// 2-1=1(승리) 2-2=0(무승부) 2-3=-1(패배)
				// 3-2=1(승리) 3-3=0(무승부) 3-1=2(패)
				switch (user - com) {
				case 1:
				case -2:
					System.out.println("사용자 승리");
					win++;
					break;
				case 0:
					System.out.println("무승부");
					draw++;
					break;
				case -1:
				case 2:
					System.out.println("컴퓨터 승리");
					lose++;
					break;
				default:
					break;
				}// switch

			} // for
			break;
		} // while
		System.out.println("게임 횟수:" + count);
		System.out.println("승리 횟수:" + win);
		System.out.println("무승부 횟수:" + draw);
		System.out.println("패배 횟수:" + lose);
	}// main

}// class
