import java.util.Scanner;

public class Home0207_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String jumin = "";
		String jumin_check1 = "";// ���̰��
		String month = "";
		String day = "";

		int jumin_check2 = 0;// 1900��� �� 2000���� ����
		int korea_age = 0;
		int age = 0;
		int korea_age2 = 0;
		int age2 = 0;
		int select = 0;// �޴�����
		int out = 0;// ���� �޴��̵�
		int reselect=0;
		loop1: while (true) {

			System.out.println("[�ֹι�ȣ ����Ȯ�� ���α׷�]");
			System.out.println("1.���� Ȯ��");
			System.out.println("2.���� Ȯ��");
			System.out.println("3.���� Ȯ��");
			System.out.println("���α׷��� �����ϼ���.(����:0)");

			select = sc.nextInt();
			if (select == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (!(select >= 1 && select <= 3)) {
				System.out.println("1~3���� ���α׷��� �ٽ� �������ּ���");
				continue;
			} else if (select == 1) {
				while (true) {
					System.out.println("-----------------");
					System.out.println("���� Ȯ�� ���α׷��Դϴ�.");
					System.out.println("-----------------");
					System.out.println("�ֹι�ȣ�� �Է��ϼ���.");

					jumin = sc.next();
					jumin_check1 = jumin.substring(0, 2);
					jumin_check2 = jumin.charAt(7) - '0';

					korea_age = 2020 - (1900 + Integer.parseInt(jumin_check1)) + 1;
					age = 2020 - (1900 + Integer.parseInt(jumin_check1));
					korea_age2 = Integer.parseInt(jumin_check1);
					age2 = Integer.parseInt(jumin_check1) - 1;

					if (jumin_check2 == 1 || jumin_check2 == 2) {
						System.out.println("-----------");
						System.out.println("�ѱ�����:" + korea_age + "��");
						System.out.println("�� ����:" + age + "��");
					} else if (jumin_check2 == 3 || jumin_check2 == 4) {
						System.out.println("------------");
						System.out.println("�ѱ�����:" + korea_age2 + "��");
						System.out.println("�� ����:" + age2 + "��");
					}
					System.out.println("-----------");
					System.out.println("���� �޴��� �̵�:99");
					System.out.println("�ٽ� �ѹ� Ȯ��:88");
					
					out = sc.nextInt();
					if (out == 99)
						continue loop1;
					if (out==88) {
						continue;
					}
				} // ���̰�� ���α׷� while

			} // ���̰�� ���α׷� else if

			else if (select == 2) {
				while (true) {
					System.out.println("----------------");
					System.out.println("����Ȯ�� ���α׷��Դϴ�.");
					System.out.println("----------------");
					System.out.println("�ֹι�ȣ�� �Է����ּ���");
					jumin = sc.next();
					jumin_check2 = jumin.charAt(7) - '0';
					if (jumin_check2 == 1 || jumin_check2 == 3) {
						System.out.println("�����Դϴ�.");
					} else if (jumin_check2 == 2 || jumin_check2 == 4) {
						System.out.println("�����Դϴ�.");
					}
					System.out.println("------------");
					System.out.println("���� �޴��� �̵�:99");
					System.out.println("�ٽ� �ѹ� Ȯ��:88");
					out = sc.nextInt();
					if (out == 99)
						continue loop1;
					if (out==88) {
						continue;
					}
				} // ����Ȯ�� ���α׷� while
			} // ����Ȯ�� ���α׷� else if
			
			else if (select == 3) {
				while(true) {
				System.out.println("-----------------");
				System.out.println("����Ȯ�� ���α׷��Դϴ�.");
				System.out.println("-----------------");
				System.out.println("�ֹι�ȣ�� �Է����ּ���");
				jumin = sc.next();
				month = jumin.substring(2, 4);
				day = jumin.substring(4, 6);
				jumin_check1 = jumin.substring(0, 2);
				jumin_check2 = jumin.charAt(7) - '0';

				if (jumin_check2 == 1 || jumin_check2 == 2) {
					System.out.println("����� ������19" + jumin_check1 + "��" + " " + month + "��" + "  " + day + "�� �Դϴ�.");
				} else if (jumin_check2 == 3 || jumin_check2 == 4) {
					System.out.println("����� ������20" + jumin_check1 + "��" + " " + month + "��" + "  " + day + "�� �Դϴ�.");
				}
				System.out.println("---------------");
				System.out.println("���� �޴��� �̵�:99");
				System.out.println("�ٽ� �ѹ� Ȯ��:88");
				out = sc.nextInt();
				if (out == 99)
					continue loop1;
				if (out==88) {
					continue;
				}
			}
			}//else if
			
		} // while

	}// switch

}// class
