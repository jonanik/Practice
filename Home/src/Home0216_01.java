import java.util.Scanner;

public class Home0216_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] name = new String[5];
		String[] subject = { "�̸�", "����", "����", "����", "����", "�հ�", "���", "���" };
		int[][] score = new int[5][5];
		double[] avg = new double[5];
		int[] rank = new int[5];
		int rank_count = 0;
	loop1:
		while (true) {
			System.out.println("[����ó�� ���α׷�]");
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.���Ȯ��");
			System.out.println("0.�ý�������");
			System.out.println("���ϴ� �޴��� �����ϼ���.");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				for (int i = 0; i < name.length; i++) {
					System.out.println("�̸��� �Է��ϼ���.");
					name[i] = scan.next();
					for (int j = 0; j < score[i].length - 1; j++) {
						System.out.println(subject[j + 1] + "������ �Է��ϼ���");
						score[i][j] = scan.nextInt();
						score[i][score[i].length - 1] += score[i][j];
					}
					avg[i] = score[i][4] / 4;
				}
				break;
			case 2:
				for (int i = 0; i < subject.length; i++) {
					System.out.print(subject[i] + "\t");
				}
				System.out.println();
				for (int i = 0; i < name.length; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.println(avg[i] + "\t");
				}
				break;
			case 3:
				for (int i = 0; i < name.length; i++) {
					rank_count=1;
					for (int j = 0; j < name.length; j++) {
						if (score[i][4] < score[j][4]) {
							rank_count++;
						}
						rank[i] = rank_count;
					}
				}
				for (int i = 0; i < subject.length; i++) {
					System.out.print(subject[i] + "\t");
				}
				System.out.println();
				for (int i = 0; i < name.length; i++) {
					System.out.print(name[i] + "\t");
					for (int j = 0; j < score[i].length; j++) {
						System.out.print(score[i][j] + "\t");
					}
					System.out.print(avg[i] + "\t");
					System.out.println(rank[i] + "\t");
				}
				break;
			case 0:
				System.out.println("�ý����� �����մϴ�.");
				break loop1;

			}
		}

	}

}
