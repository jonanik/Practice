import java.util.Scanner;

public class Home0223_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] ball = new int[45];
		int[] my = new int[3];
		int[] win = new int[3];
		int win_count = 0;
		
		make_ball(ball);//공 생성
		shuffle(ball);//공섞기
		put_in(my);//내번호 입력
		compare(my, ball, win, win_count);//섞인 번호 앞에서 
		print(ball,my,win,win_count);
		
//-------------------METHOD----------------------------		
	}
	static void make_ball(int[] ball) {
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
	}

	static void shuffle(int[] ball) {
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 45);
			int temp = ball[0];
			ball[0] = ball[random];
			ball[random] = temp;
		}
	}

	static void put_in(int[] my) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < my.length; i++) {
			System.out.println(i + 1 + "번째 숫자를 입력하세요.");
			my[i] = scan.nextInt();
		}
	}

	static void compare(int[] my, int[] ball, int[] win, int win_count) {
		for (int i = 0; i < my.length; i++) {
			for (int j = 0; j < 6; j++) {
				if (my[i] == ball[j]) {
					win[i] = my[i];
					win_count++;
				}
			}
		}
	}

	static void print(int[] ball, int[] my, int[] win, int win_count) {
		System.out.print("당첨번호:");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		System.out.print("입력번호번호:");
		for (int i = 0; i < my.length; i++) {
			System.out.print(my[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");

		System.out.print("맞춘 번호:");
		for (int i = 0; i < win.length; i++) {
			System.out.print(win[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		System.out.print("맞춘 갯수:" + win_count + "회");

		System.out.println();
		System.out.println("-----------------------");
		if (win_count == 3) {
			System.out.println("당첨금: 10,000,000,000원");
		} else if (win_count == 2) {
			System.out.println("당첨금: 5,000,000원");
		} else if (win_count == 1) {
			System.out.println("당첨금: 1,000,000원");
		} else {
			System.out.println("하나도 맞추지 못하셨습니다.");
		}

	}

}
