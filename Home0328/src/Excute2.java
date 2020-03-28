import java.util.ArrayList;
import java.util.Scanner;

public class Excute2 {

	Student s = new Student();

	String main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է� ���α׷�");
		System.out.println("1.���� �Է�   2.���� ���  3.�л��˻�  4.���� ���� 5.�л����� ����");
		System.out.println("0.���α׷� ����.");
		String select = scan.next();
		return select;
	}

	void input(ArrayList<Student> stuList) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("�̸��� �Է����ּ���.(����:0)");
			String name = scan.next();
			if (name.equals("0")) {
				rank(stuList);
				return;
			}
			System.out.println("�������� �Է����ּ���.");
			
			int kor = scan.nextInt();
			System.out.println("�������� �Է����ּ���.");
			int eng = scan.nextInt();
			System.out.println("�������� �Է����ּ���.");
			int math = scan.nextInt();
			stuList.add(new Student(name, kor, eng, math));
		}
	}

	void print(ArrayList<Student> stuList) {
		String[] category = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "��ũ" };
		System.out.println("------------------------------------------------------------");
		for (int i = 0; i < category.length; i++) {
			System.out.print(category[i] + "\t");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		System.out.println("------------------------------------------------------------");
	}

	Student search(ArrayList<Student> stuList) {
		Scanner scan = new Scanner(System.in);
		String[] category = { "�й�", "�̸�", "����", "����", "����", "�հ�", "���", "��ũ" };
		Student search = null;
		System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.");
		String name = scan.next();
		System.out.println("------------------------------------------------------------");
		for (int i = 0; i < category.length; i++) {
			System.out.print(category[i] + "\t");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		for (int i = 0; i < stuList.size(); i++) {
			if (name.equals(stuList.get(i).name)) {
				System.out.println(stuList.get(i));
				search = stuList.get(i);
			}

		}
		return search;
	}

	void rank(ArrayList<Student> stuList) {
		int rank = 1;
		for (int i = 0; i < stuList.size(); i++) {
			rank = 1;
			for (int j = 0; j < stuList.size(); j++) {
				if (stuList.get(i).total < stuList.get(j).total) {
					rank++;
				}
				stuList.get(i).rank = rank;
			}
		}
	}

	void reinput(ArrayList<Student> stuList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �л��� �̸��� �Է����ּ���.");
		String name = scan.next();
		for (int i = 0; i < stuList.size(); i++) {
			if (name.equals(stuList.get(i).name)) {
				while (true) {
					System.out.println(stuList.get(i).name + "�л��� �˻��ϼ̽��ϴ�.");
					System.out.println("� ������ ������ �����Ͻðڽ��ϱ�?");
					System.out.println("1.���� 2.���� 3.����");
					System.out.println("0.�����޴���");
					String select = scan.next();
					if(select.equals("0")) {
						return;
					}
					switch (select) {
					case "1":
						System.out.println("���������� �Է����ּ���. ");
						int kor = scan.nextInt();
						stuList.get(i).kor = kor;
						stuList.get(i).total = stuList.get(i).eng + stuList.get(i).math + kor;
						stuList.get(i).avg = stuList.get(i).total / 3;
						rank(stuList);
						System.out.println("����������"+kor+"������ �����մϴ�.");
						break;
					case "2":
						System.out.println("���������� �Է����ּ���. ");
						int eng = scan.nextInt();
						stuList.get(i).eng = eng;
						stuList.get(i).total = stuList.get(i).kor + stuList.get(i).math + eng;
						stuList.get(i).avg = stuList.get(i).total / 3;
						rank(stuList);
						System.out.println("����������"+eng+"������ �����մϴ�.");
						break;
					case "3":
						System.out.println("���������� �Է����ּ���. ");
						int math = scan.nextInt();
						stuList.get(i).math = math;
						stuList.get(i).total = stuList.get(i).eng + stuList.get(i).kor + math;
						stuList.get(i).avg = stuList.get(i).total / 3;
						rank(stuList);
						System.out.println("����������"+math+"������ �����մϴ�.");
						break;
					default:
						System.out.println("�߸��� �Է��Դϴ�.");
						continue;
					}
					System.out.println("----------------------------");
				}
			}

		}

	}
	void delete(ArrayList<Student> stuList) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������ �л��� �̸��� �Է����ּ���.");
		String name=scan.next();
		for(int i=0; i<stuList.size();i++) {
			if(name.equals(stuList.get(i).name)) {
				System.out.println(stuList.get(i).name+"�л��� ������ ���� �����Ͻðڽ��ϱ�?(y/n)");
				String yn=scan.next();
				if(yn.equals("y")||yn.equals("Y")) {
					System.out.println(stuList.get(i).name+"�л��� ������ �����մϴ�.");
					stuList.remove(i);					
				}else if(yn.equals("n")||yn.equals("N")) {
					System.out.println("�����޴��� ���ư��ϴ�.");
					return;
				}
			}
		}
		
	}

}
