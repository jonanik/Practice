import java.util.Scanner;

public class Home0215_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] ball = new int[45];// ���� 45�� �غ��Ѵ�.
		int[] input = new int[3];
		int[] win_num = new int[3];
		int win_count = 0;

		for (int i = 0; i < ball.length; i++) {// ���� ��ȣ�� 1~45���� �Է��Ѵ�.
			ball[i] = i + 1;
		}
		int temp = 0;
		int random = 0;
loop1:
		while (true) {
			for (int i = 0; i < 200; i++) {// ���� 200�� ���´�.
				random = (int) (Math.random() * 45);
				temp = ball[0];
				ball[0] = ball[random];
				ball[random] = temp;
			}
			for (int i = 0; i < input.length; i++) {// �÷��̾ ���� �̴´�.
				System.out.println(i + 1 + "��°���� ��������(���� ����:99)");
				input[i] = scan.nextInt();
				if(input[i]==99) {
					System.out.println("������ �����մϴ�.");
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
				System.out.println("���Դϴ�.");
			} else {
				System.out.print("��÷��ȣ:");
				for (int i = 0; i < 6; i++) {
					System.out.print(ball[i] + "  ");
				}
				System.out.println();
				System.out.print("���� ��ȣ:");
				for (int i = 0; i < win_num.length; i++) {
					System.out.print(win_num[i] + "\t");
				}
				System.out.println();
				System.out.println("���� ����:" + win_count + "��");
				System.out.println("-------------------------");
				if (win_count == 1) {
					System.out.println("5,000�� ��÷�Ǽ̽��ϴ�. ���ϵ帳�ϴ�!");
				} else if (win_count == 2) {
					System.out.println("100,000�� ��÷�Ǽ̽��ϴ�. ���ϵ帳�ϴ�!");
				} else {
					System.out.println("2,000,000�� ��÷�Ǽ̽���. ���ϵ帳�ϴ�!");
				}

			}
		}
	}

}
