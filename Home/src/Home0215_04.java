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
			System.out.println(i + 1 + "��° ���ڸ� �Է��ϼ���");
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
		System.out.print("��÷��ȣ:");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		System.out.print("�Է��� ��ȣ:");
		for(int i=0; i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		
		System.out.println();
		System.out.print("���� ��ȣ:");
		for (int i = 0; i < win_count; i++) {
			System.out.print(win_num[i] + " ");
		}
		System.out.println();
		System.out.println("���� ����:" + win_count + "ȸ");

		System.out.println("------------[���]------------");
		if (win_count == 1) {
			System.out.println("���ϵ帳�ϴ�!! 5000�� �Դϴ�!!");
		} else if (win_count == 2) {
			System.out.println("���ϵ帳�ϴ�!! 50,000�� �Դϴ�!!");
		} else if (win_count == 3) {
			System.out.println("���ϵ帳�ϴ�!!1,000,000�� �Դϴ�!!");
		} else {
			System.out.println("���Դϴ�!");
		}
	}

}
