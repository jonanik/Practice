import java.util.Scanner;

public class Home0209_02 {

	public static void main(String[] args) {
//		2020.02.09 [while, if]�� ����ؼ� ���������� �����
//		String�̿��ؼ� ���ڿ��� ����, ����, ���� ���� �ٲٱ�
		Scanner scan = new Scanner(System.in);
		int player = 0;
		int com = 0;
		int win = 0;
		int lose = 0;
		int draw = 0;
		int count = 0;
		int game_num = 0;
		System.out.println("[����, ����, �� ����]");
		System.out.println("1.���� 2.���� 3.�� (���� ����:0)");
		System.out.println("���� �Ͻðڽ��ϱ�?");
		game_num = scan.nextInt();
		System.out.println("���ϴ� ���� ���ּ���(1~3)");

		loop1: while (true) {
			player = scan.nextInt();
			if (count == game_num) {
				System.out.println("�����ϼ̽��ϴ�." + game_num + "���� ��� �÷����ϼ̽��ϴ�.");
				break;
			}else {
			System.out.println("����~ ����~ ��!");
			System.out.println("-------------");
			com = (int) (Math.random() * 3 + 1);
			while (true) {
				if (!(player >= 1 || player <= 3)) {
					System.out.println("1.���� 2.���� 3.�� �߿� ���ּ���");
					break;
				}
				if (player > com) {
					
					System.out.println("    �¸��ϼ̽��ϴ�.");
					win++;
					count++;
					break;
				} else if (player < com) {
					System.out.println("    �й��ϼ̽��ϴ�.");
					lose++;
					count++;
					break;
				} else if (player == com) {
					System.out.println("    ���º��Դϴ�.");
					draw++;
					count++;
					break;
				}
			} // ���� while
			}//else
			System.out.println("-------------");
			System.out.printf("�÷��̾�:%d|��ǻ��:%d|%n%d ��°", player, com, count);
			continue;
		} // while
System.out.println("�� ����Ƚ��:"+game_num+"ȸ");
System.out.println("�¸� Ƚ��:"+win+"ȸ");
System.out.println("�й� Ƚ��:"+lose+"ȸ");
System.out.println("���º� Ƚ��:"+draw+"ȸ");
System.out.println("�·�:"+((win*100)/game_num)+"%");
	}// main

}// class
