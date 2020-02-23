import java.util.Scanner;

public class Home0223_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] ball = new int[45];
		int[] my = new int[3];
		int[] win = new int[3];
		int win_count = 0;
		
		make_ball(ball);//�� ����
		shuffle(ball);//������
		put_in(my);//����ȣ �Է�
		compare(my, ball, win, win_count);//���� ��ȣ �տ��� 
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
			System.out.println(i + 1 + "��° ���ڸ� �Է��ϼ���.");
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
		System.out.print("��÷��ȣ:");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		System.out.print("�Է¹�ȣ��ȣ:");
		for (int i = 0; i < my.length; i++) {
			System.out.print(my[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");

		System.out.print("���� ��ȣ:");
		for (int i = 0; i < win.length; i++) {
			System.out.print(win[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------------");
		System.out.print("���� ����:" + win_count + "ȸ");

		System.out.println();
		System.out.println("-----------------------");
		if (win_count == 3) {
			System.out.println("��÷��: 10,000,000,000��");
		} else if (win_count == 2) {
			System.out.println("��÷��: 5,000,000��");
		} else if (win_count == 1) {
			System.out.println("��÷��: 1,000,000��");
		} else {
			System.out.println("�ϳ��� ������ ���ϼ̽��ϴ�.");
		}

	}

}
