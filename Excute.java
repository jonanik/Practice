package home0419_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {

	ArrayList<Student> list = new ArrayList<Student>();

	String main() {
		Scanner scan = new Scanner(System.in);

		System.out.println("[�л����� ó�����α׷�]");
		System.out.println("1.�����Է�  2.�������  3.�л������˻� ");
		System.out.println("4.�л����� ���� 5.�л����� ���� 0.���α׷� ����");
		String select;
		select = scan.next();

		return select;
	}

	void insert(ArrayList<Student> list, Student stu) {
		Scanner scan = new Scanner(System.in);
		String name;
		int kor, eng, math;

		while (true) {
			System.out.println("[�л����� �Է�.] �����޴�:0");
			System.out.println("�̸��� �Է��ϼ���.");
			name = scan.next();
			if (name.equals("0")) {
				System.out.println("���θ޴��� ���ư��ϴ�.");
				return;
			}
			System.out.println("���������� �Է��ϼ���.");
			kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.");
			eng = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.");
			math = scan.nextInt();

			stu = new Student(name, kor, eng, math);
			list.add(stu);

		}
	}

	void print(ArrayList<Student> list) {
		String[] category = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "���" };
		System.out.println("[�л����� ���]");

		for (int i = 0; i < category.length; i++) {
			System.out.print(category[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		return;

	}

	void search(ArrayList<Student> list) {
		String category = "�й�\t�̸�\t����\t����\t����\t�հ�\t���\t���";
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("[�л����� �˻�] �����޴�:0");
			System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.");

			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("���θ޴��� �̵��մϴ�.");
				return;
			}
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).name)) {
					System.out.println(category);
					System.out.println(list.get(i));
					System.out.println("�� �˻��Ͻðڽ��ϱ�?(y/n)");
					String yn = scan.next();
					if (yn.equals("y") || yn.equals("Y")) {
						break;
					} else if (yn.equals("n") || yn.equals("N")) {
						return;
					}
				} // if
			} // for
		} // while
	}// search

	void delete(ArrayList<Student> list) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("[�л����� ����] �����޴�:0");
			System.out.println("������ �л��� �̸��� �Է��ϼ���.");
			String name = scan.next();
			for (int i = 0; i < list.size(); i++) {
				if (name.equals("0")) {
					System.out.println("���θ޴��� �̵��մϴ�.");
					return;
				}
				if (name.equals(list.get(i).name)) {
					System.out.println(list.get(i).name + "�л��� ������ �����Ͻðڽ��ϱ�?(y/n)");
					String yn = scan.next();
					if (yn.equals("y") || yn.equals("Y")) {
						System.out.println(list.get(i).name + "�л��� ������ �����մϴ�.");
						list.remove(i);
						System.out.println("������ �� �����Ͻðڽ��ϱ�?(y/n)");
						String yn1 = scan.next();
						if (yn1.equals("y") || yn1.equals("Y")) {
							break;
						} else if (yn1.equals("n") || yn1.equals("N")) {
							System.out.println("���θ޴��� �̵��մϴ�.");
							return;
						}
					} else if (yn.equals("n") || yn.equals("N")) {
						break;
					}

				}
			}
		} // while
	}// delete

	void reinsert(ArrayList<Student> list) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("[�л����� ����] �����޴�:0");
			System.out.println("������ �л��� �̸��� �Է����ּ���.");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("���θ޴��� �̵��մϴ�.");
				return;
			}
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).name)) {
					System.out.println(list.get(i).name + "�л��� ������ �˻��ϼ̽��ϴ�.");
					System.out.println("������ ������ �����ϼ���. �����޴�:0");
					System.out.println("1.�̸� 2.�������� 3.�������� 4.�������� ");
					String select = scan.next();
					if (select.equals("0")) {
						System.out.println("���θ޴��� �̵��մϴ�.");
						return;
					}
					switch (select) {
					case "1":
						System.out.println("�̸������� �����ϼ̽��ϴ�.");
						System.out.println("������ �̸��� �Է����ּ���");
						String rename = scan.next();
						System.out.println(list.get(i).name + "�л��� �̸���  " + rename + "���� �������ϴ�.");
						list.get(i).name = rename;
						break;
					case "2":
						System.out.println("�������� ������ �����ϼ̽��ϴ�.");
						System.out.println("���ο� ���������� �Է����ּ���");
						int rekor = scan.nextInt();
						System.out
								.println(list.get(i).name + "�л��� ����������" + list.get(i).kor + "����" + rekor + "�� �������ϴ�.");
						list.get(i).kor = rekor;
						list.get(i).total = rekor + list.get(i).eng + list.get(i).math;
						list.get(i).avg = list.get(i).total / 3;
						break;
					case "3":
						System.out.println("�������� ������ �����ϼ̽��ϴ�.");
						System.out.println("���ο� ���������� �Է����ּ���");
						int reeng = scan.nextInt();
						System.out
								.println(list.get(i).name + "�л��� ����������" + list.get(i).eng + "����" + reeng + "�� �������ϴ�.");
						list.get(i).eng = reeng;
						list.get(i).total = reeng + list.get(i).kor + list.get(i).math;
						list.get(i).avg = list.get(i).total / 3;
						break;
					case "4":
						System.out.println("�������� ������ �����ϼ̽��ϴ�.");
						System.out.println("���ο� ���������� �Է����ּ���");
						int remath = scan.nextInt();
						System.out.println(
								list.get(i).name + "�л��� ����������" + list.get(i).math + "����" + remath + "�� �������ϴ�.");
						list.get(i).math = remath;
						list.get(i).total = remath + list.get(i).eng + list.get(i).kor;
						list.get(i).avg = list.get(i).total / 3;
						break;
					default:
						System.out.println("�߸��� �Է��Դϴ�.");
						;
						break;
					}//switch
				}//if

			}//for

		}//while
	}//reinsert
}
