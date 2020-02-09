import java.util.Scanner;

public class Home0209_02 {

	public static void main(String[] args) {
//		2020.02.09 [while, if]만 사용해서 가위바위보 만들기
//		String이용해서 숫자에서 가위, 바위, 보로 글자 바꾸기
		Scanner scan = new Scanner(System.in);
		int player = 0;
		int com = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		int count = 0;
		int game_num = 0;
		System.out.println("[가위, 바위, 보 게임]");
		System.out.println("1.가위 2.바위 3.보 (게임 종료:0)");
		System.out.println("몇판 하시겠습니까?");
		game_num = scan.nextInt();
		System.out.println("원하는 것을 내주세요(1~3)");

		loop1: while (true) {
			player = scan.nextInt();
			if (count == game_num) {
				System.out.println("수고하셨습니다." + game_num + "판을 모두 플레이하셨습니다.");
				break;
			}else {
			System.out.println("가위~ 바위~ 보!");
			System.out.println("-------------");
			com = (int) (Math.random() * 3 + 1);
			while (true) {
				if (!(player >= 1 || player <= 3)) {
					System.out.println("1.가위 2.바위 3.보 중에 내주세요");
					break;
				}
				if (player > com) {
					
					System.out.println("    승리하셨습니다.");
					win++;
					count++;
					break;
				} else if (player < com) {
					System.out.println("    패배하셨습니다.");
					lose++;
					count++;
					break;
				} else if (player == com) {
					System.out.println("    무승부입니다.");
					draw++;
					count++;
					break;
				}
			} // 작은 while
			}//else
			System.out.println("-------------");
			System.out.printf("플레이어:%d|컴퓨터:%d|%n%d 판째", player, com, count);
			continue;
		} // while
System.out.println("총 게임횟수:"+game_num+"회");
System.out.println("승리 횟수:"+win+"회");
System.out.println("패배 횟수:"+lose+"회");
System.out.println("무승부 횟수:"+draw+"회");
System.out.println("승률:"+((win*100)/game_num)+"%");
	}// main

}// class
