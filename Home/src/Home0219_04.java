import java.util.Scanner;

public class Home0219_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select = 0;
		int stu_count = 0;
		String name = "";
		String out = "";
		String[] subject = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���" };
		Stu[] stu = new Stu[10];
		loop1: while (true) {
			System.out.println("[����ó�� ���α׷�]");
			System.out.println("1.���� �Է� 2.���� ��� 3.���� ���� 0.����");
			System.out.println("�޴��� �����ϼ���.");
			select = scan.nextInt();

			switch (select) {

			case 1:// ���� �Է�
				loop3: while (true) {
					for (int i = 0; i < stu.length; i++) {
						stu[i] = new Stu();
						System.out.println("�̸��� �Է��ϼ���.");
						stu[i].name = scan.next();
						System.out.println("�������� �Է��ϼ���.");
						stu[i].kor = scan.nextInt();
						System.out.println("��� �Է��ϼ���.");
						stu[i].eng = scan.nextInt();
						System.out.println("���������� �Է��ϼ���.");
						stu[i].math = scan.nextInt();
						stu_count++;

						while (true) {
							System.out.println("�� �Է��Ͻðڽ��ϱ�?(y/n)");
							out = scan.next();
							if (out.equals("y")) {
								continue loop3;
							} else if (out.equals("n")) {
								continue loop1;
							} else {
								System.out.println("y�� n�߿� �������ּ���.");
								continue;
							}
						}
					}
				}
			case 2:// ���� ���
				System.out.println("��������� �����ϼ̽��ϴ�.");
				Stu.stu_num = 1000;
				for (int i = 0; i < subject.length; i++) {
					System.out.print(subject[i] + "\t");
					System.out.println(stu[i].name);
				}
				System.out.println();
				for (int i = 0; i < stu_count; i++) {
					System.out.print(Stu.stu_num + "\t" + stu[i].name + "\t" + stu[i].kor + "\t" + stu[i].eng + "\t"+ stu[i].math + "\t");
					stu[i].total();
					stu[i].avg();
					Stu.stu_num++;
					System.out.println();
				}
				break;
			case 3:// ���� ����
				loop2: while (true) {
					System.out.println("���������� �����ϼ̽��ϴ�.");
					System.out.println("������ �л��� �̸��� �Է����ּ���.(�޴�����:99)");
					name = scan.next();
					if (name.equals("99")) {
						continue loop1;
					}
					for (int i = 0; i < stu_count; i++) {
						if (stu[i].name.equals(name)) {
							System.out.println(stu[i].name + "�л��� �˻��ϼ̽��ϴ�.");
						}
						while (true) {
							System.out.println("������ ������ �����ϼ���(�л� �˻�:99)");
							System.out.println("1.���� 2.���� 3.����");
							select = scan.nextInt();
							if (select == 99) {
								break loop2;
							}
							switch (select) {
							case 1:
								System.out.println("��� �����ϼ̽��ϴ�.");
								System.out.println("������ �������ּ���.");
								stu[i].kor = scan.nextInt();
								System.out.println(stu[i].kor + "���� �ԷµǾ����ϴ�.");
								break;
							case 2:
								System.out.println("��� �����ϼ̽��ϴ�.");
								System.out.println("������ �������ּ���.");
								stu[i].eng = scan.nextInt();
								System.out.println(stu[i].eng + "���� �ԷµǾ����ϴ�.");
								break;
							case 3:
								System.out.println("������ �����ϼ̽��ϴ�.");
								System.out.println("������ �������ּ���.");
								stu[i].math = scan.nextInt();
								System.out.println(stu[i].math + "�� �ԷµǾ����ϴ�.");
								break;
							}
						}
					} // �л��˻� ��ü for
				} // �л������޴� while

			case 0:
				System.out.println("�ý����� �����մϴ�.");
				break loop1;
			// switch
			}// while

		} // main
	}

	static void input() {

	}// �޼ҵ�

}// class
