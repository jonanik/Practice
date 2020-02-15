import java.util.Scanner;

public class Home0215_04 {

	public static void main(String[] args) {
		int[] ball = new int[45];
		int[] input = new int[3];
		int[] win_num = new int[3];
		int win_count = 0;
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		int random = 0;
		int temp = 0;
		for (int i = 0; i < 200; i++) {
			random = (int) (Math.random() * 45);
			temp = ball[0];
			ball[0] = ball[random];
			ball[random] = temp;
		}
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < input.length; i++) {
			System.out.println(i + 1 + "번째 숫자를 입력하세요");
			input[i] = scan.nextInt();
			System.out.println();
		}
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < 6; j++) {
				if (input[i] == ball[j]) {
					win_num[i] = input[i];
					win_count++;
				}
			}
		}
		System.out.println("----------------------------");
		System.out.print("당첨번호:");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		System.out.print("입력한 번호:");
		for(int i=0; i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		
		System.out.println();
		System.out.print("맞춘 번호:");
		for (int i = 0; i < win_count; i++) {
			System.out.print(win_num[i] + " ");
		}
		System.out.println();
		System.out.println("맞춘 개수:" + win_count + "회");

		System.out.println("------------[상금]------------");
		if (win_count == 1) {
			System.out.println("축하드립니다!! 5000원 입니다!!");
		} else if (win_count == 2) {
			System.out.println("축하드립니다!! 50,000원 입니다!!");
		} else if (win_count == 3) {
			System.out.println("축하드립니다!!1,000,000원 입니다!!");
		} else {
			System.out.println("꽝입니다!");
		}
	}

}
