import java.util.Scanner;

public class Home0220_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[10];
		String[] subject = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���" };
		String[] rank_subject = { "���", "�̸�", "���" };
		String name = "";
		int select = 0, select1 = 0;
		int stu_count = 0;
		int rank_count = 0;

		loop2: while (true) {
			menu();// ����ó�����α׷� �޴�
			select = scan.nextInt();

			switch (select) {
			case 1:
				while (true) {
					System.out.println("�����Է��� �����ϼ̽��ϴ�.");
					for (int i = 0; i < stu.length; i++) {
						stu[i] = new Student();
						System.out.println("�̸��� �Է��ϼ���.(�����޴�:99)");
						stu[i].name = scan.next();
						if (stu[i].name.equals("99")) {
							continue loop2;
						}
						System.out.println("���� ������ �Է��ϼ���.");
						stu[i].kor = scan.nextInt();
						System.out.println("���� ������ �Է��ϼ���.");
						stu[i].eng = scan.nextInt();
						System.out.println("���� ������ �Է��ϼ���.");
						stu[i].math = scan.nextInt();
						stu_count++;
					}
					break;
				}
				break;
			case 2:// ���� ���
				print(stu, subject, stu_count);
				continue loop2;
			case 3:// ���� ����
				reinput(stu, name, stu_count, select1);
				continue loop2;
			case 4:// ���ó��
				rank_method(stu, rank_count, stu_count, rank_subject);

				continue loop2;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");

				break;

			}// switch
			break;
		} // while
	}// main

	static void menu() {

		System.out.println("�����Է� ���α׷�");
		System.out.println("1.���� �Է�  2.���� ���");
		System.out.println("3.���� ����  4.���ó��");
		System.out.println("0.���α׷� ����");

	}

	static void print(Student[] stu, String[] subject, int stu_count) {
		System.out.println("���� ����� �Է��ϼ̽��ϴ�.");
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();

		Student.stu_num = 1000;
		for (int i = 0; i < stu_count; i++) {
			System.out.print(Student.stu_num + "\t");
			System.out.print(stu[i].name + "\t" + stu[i].kor + "\t" + stu[i].eng + "\t" + stu[i].math + "\t");
			stu[i].total();
			stu[i].avg();
			Student.stu_num++;
			System.out.println();
		}

	}

	static void reinput(Student[] stu, String name, int stu_count, int select1) {
		loop1: while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("���� ������ �����ϼ̽��ϴ�.");
			System.out.println("���������� �л��� �̸��� �Է��ϼ���.(�����޴�:99)");
			name = scan.next();
			for (int i = 0; i < stu_count; i++) {
				if (name.equals("99")) {
					break loop1;
				}

				else if (!(name.equals(stu[i].name))) {
					System.out.println("�������� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
					continue loop1;
				} else if (name.equals(stu[i].name)) {
					System.out.println(stu[i].name + "�л��� �˻��ϼ̽��ϴ�.");
					System.out.println("������ ������ �����ϼ���.");
					System.out.println("1.����  2.����  3.����");
					select1 = scan.nextInt();
					switch (select1) {
					case 1:
						System.out.println("�������� ������ �����ϼ̽��ϴ�.");
						System.out.println("������ �Է��ϼ���.");
						stu[i].kor = scan.nextInt();
						System.out.println(stu[i].kor + "���� �Է���ϴ�.");
						break;
					case 2:
						System.out.println("�������� ������ �����ϼ̽��ϴ�.");
						System.out.println("������ �Է��ϼ���.");
						stu[i].eng = scan.nextInt();
						System.out.println(stu[i].eng + "���� �Է���ϴ�.");
						break;
					case 3:
						System.out.println("�������� ������ �����ϼ̽��ϴ�.");
						System.out.println("������ �Է��ϼ���.");
						stu[i].math = scan.nextInt();
						System.out.println(stu[i].math + "���� �Է���ϴ�.");
						break;
					}// ���� switch
					continue loop1;
				}
			} // for
			break;
		} // while

	}

	static void rank_method(Student[] stu, int rank_count, int stu_count, String[] rank_subject) {

		for (int i = 0; i < stu_count; i++) {
			rank_count = 1;
			for (int j = 0; j < stu_count; j++) {
				if (stu[i].total < stu[j].total) {
					rank_count++;
				}
				stu[i].rank = rank_count;
			}
		}
		for (int i = 0; i < rank_subject.length; i++) {
			System.out.print(rank_subject[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < stu_count; i++) {
			System.out.print(stu[i].rank + "��\t" + stu[i].name + "\t" + stu[i].avg);
			System.out.println();
		}
	}
}// class

class Student {
	static int stu_num = 1000;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	void total() {
		total = kor + eng + math;
		System.out.print(total + "\t");
	}

	void avg() {
		avg = (kor + eng + math) / 3;
		System.out.print(avg + "\t");
	}

}
