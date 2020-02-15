import java.util.Scanner;

public class Home0215_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] ball = new int[45];// 공을 45개 준비한다.
		int[] input = new int[3];
		int[] win_num = new int[3];
		int win_count = 0;

		for (int i = 0; i < ball.length; i++) {// 공에 번호를 1~45번을 입력한다.
			ball[i] = i + 1;
		}
		int temp = 0;
		int random = 0;
loop1:
		while (true) {
			for (int i = 0; i < 200; i++) {// 공을 200번 섞는다.
				random = (int) (Math.random() * 45);
				temp = ball[0];
				ball[0] = ball[random];
				ball[random] = temp;
			}
			for (int i = 0; i < input.length; i++) {// 플레이어가 공을 뽑는다.
				System.out.println(i + 1 + "번째공을 뽑으세요(게임 종료:99)");
				input[i] = scan.nextInt();
				if(input[i]==99) {
					System.out.println("게임을 종료합니다.");
					break loop1;
				}
			}
			for (int i = 0; i < input.length; i++) {
				for (int j = 0; j < 6; j++) {
					if (input[i] == ball[j]) {
						win_num[i] = input[i];
						win_count++;
					}
				}
			}
			if (win_count == 0) {
				System.out.println("꽝입니다.");
			} else {
				System.out.print("당첨번호:");
				for (int i = 0; i < 6; i++) {
					System.out.print(ball[i] + "  ");
				}
				System.out.println();
				System.out.print("맞춘 번호:");
				for (int i = 0; i < win_num.length; i++) {
					System.out.print(win_num[i] + "\t");
				}
				System.out.println();
				System.out.println("맞춘 개수:" + win_count + "개");
				System.out.println("-------------------------");
				if (win_count == 1) {
					System.out.println("5,000원 당첨되셨습니다. 축하드립니다!");
				} else if (win_count == 2) {
					System.out.println("100,000원 당첨되셨습니다. 축하드립니다!");
				} else {
					System.out.println("2,000,000원 당첨되셨스비낟. 축하드립니다!");
				}

			}
		}
	}

}
