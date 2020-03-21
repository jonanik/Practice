import java.util.ArrayList;
import java.util.Scanner;

public class Excute implements Interface {

	@Override
	public String main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------");
		System.out.println("�л����� ó�� ���α׷�");
		System.out.println("-----------------");
		System.out.println("1.�����Է�  2.������� 3.�л� �˻� �� ��������");
		System.out.println();
		System.out.println("4.���ó��  5.������");
		System.out.println();
		System.out.println("0.���α׷� ����");
		String select = "0";
		select = scan.next();
		return select;
	}

	@Override
	public void inputScore(ArrayList<Student> stuList) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("-------------------");
			System.out.println("[�����Է� �޴��Դϴ�.]");
			System.out.println("-------------------");

			System.out.println("�̸��� �Է��ϼ���.(�����޴�:0)");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println(stuList.size() + "���� ������ �ԷµǾ����ϴ�.");
				System.out.println("-------------------");
				return;
			}
			System.out.println("�а��� �Է��ϼ���.");
			String major = scan.next();
			System.out.println("���������� �Է��ϼ���.");
			int kor = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.");
			int eng = scan.nextInt();
			System.out.println("���������� �Է��ϼ���.");
			int math = scan.nextInt();

			stuList.add(new Student(name, major, kor, eng, math));
		}
	}

	@Override
	public void printScore(ArrayList<Student> stuList, String[] category) {

		System.out.println("-------------------");
		System.out.println("[���� ��¸޴��Դϴ�.]");
		System.out.println("-------------------");
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < category.length; i++) {
			System.out.print(category[i] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("�Էµ� �л��� ������ ��� ����Ͽ����ϴ�.");
		System.out.println("----------------------------");
	}

	@Override
	public void searchStu(ArrayList<Student> stuList, ArrayList<Student> reinput) {
		Scanner scan = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("[�л������˻� �޴��Դϴ�.]");
		System.out.println("-------------------");

		re: while (true) {
			System.out.println("�˻� �� �л��� �̸��� �Է��ϼ���.(����:0)");
			String name = scan.next();
			if (name.equals("0")) {
				return;
			}
			for (int i = 0; i < stuList.size(); i++) {
				if (name.equals(stuList.get(i).name)) {
					System.out.println("---------------------");
					System.out.println(stuList.get(i).name + "�л��� ������ ����մϴ�.");
					System.out.println("---------------------");
					System.out.println("-------------------------------------------------------------------");
					System.out.println("�й�" + "\t" + "�̸�" + "\t" + "�а�" + "\t" + "����" + "\t" + "����" + "\t" + "����" + "\t"
							+ "�հ�" + "\t" + "���"+"\t"+"���");
					System.out.println(stuList.get(i));
					reinput.add(stuList.get(i));
					System.out.println("-------------------------------------------------------------------");
					while (true) {
						System.out.println("������ �����Ͻðڽ��ϱ�?(y:�����޴����̵�/n:�л��˻������̵�)");
						String yn = scan.next();
						if (yn.equals("y") || yn.equals("Y") || yn.equals("��")) {
							reinput(stuList, reinput);
							return;
						} else if (yn.equals("n") || yn.equals("N") || yn.equals("��")) {
							reinput.clear();
							continue re;
						} else {
							System.out.println("�߸��� �Է��Դϴ�.");
							continue;
						}
					}
				}

			}
			System.out.println("�������� �ʴ� �̸��Դϴ�. �л��̸��� ��Ȯ�� �Է����ּ���.");
			System.out.println("-----------------------------------------");
			continue re;
		}

	}

	@Override
	public void reinput(ArrayList<Student> stuList, ArrayList<Student> reinput) {
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------");
		System.out.println("[�������� �޴��Դϴ�.]");
		System.out.println("----------------");
		System.out.println("�˻���" + " " + reinput.get(0).name + "�л��� ������ �����Ͻðڽ��ϱ�?(y/n)");
		String yn = scan.next();
		if (yn.equals("y") || yn.equals("Y")) {
			for (int i = 0; i < stuList.size(); i++) {
				if (reinput.get(0).name.equals(stuList.get(i).name)) {
					while (true) {
						System.out.println("---------------------------");
						System.out.println("���������� ������ �������ּ���.(����:0)");
						System.out.println("1.����  2.����  3.����");
						int select = 0;
						select = scan.nextInt();

						if (select == 0) {
							System.out.println("���� ������ ��Ĩ�ϴ�.");
							System.out.println("---------------");
							reinput.clear();
							return;
						}
						switch (select) {
						case 1:
							System.out.println("[����� ����]");
							System.out.println("������ �Է��ϼ���.");
							int kor = scan.nextInt();
							stuList.get(i).kor = kor;
							System.out.println(stuList.get(i).name + "�л��� ����������  " + kor + "������ ����Ǿ����ϴ�.");
							stuList.get(i).total = kor + stuList.get(i).eng + stuList.get(i).math;
							stuList.get(i).avg = stuList.get(i).total / 3;
							break;
						case 2:
							System.out.println("[����� ����]");
							System.out.println("������ �Է��ϼ���.");
							int eng = scan.nextInt();
							stuList.get(i).eng = eng;
							System.out.println(stuList.get(i).name + "�л��� ����������  " + eng + "������ ����Ǿ����ϴ�.");
							stuList.get(i).total = eng + stuList.get(i).kor + stuList.get(i).math;
							stuList.get(i).avg = stuList.get(i).total / 3;
							break;
						case 3:
							System.out.println("[���м��� ����]");
							System.out.println("������ �Է��ϼ���.");
							int math = scan.nextInt();
							stuList.get(i).math = math;
							System.out.println(stuList.get(i).name + "�л��� ����������  " + math + "������ ����Ǿ����ϴ�.");
							stuList.get(i).total = math + stuList.get(i).eng + stuList.get(i).kor;
							stuList.get(i).avg = stuList.get(i).total / 3;
							break;
						default:
							System.out.println("�߸��� �Է��Դϴ�.");
							break;
						}// switch
					} // while
				} // if

			} // for
		} // if
		else if (yn.equals("n") || yn.equals("N")) {
			reinput.clear();
			System.out.println("���θ޴��� �̵��մϴ�.");
			return;
		}
	}

	@Override
	public void rankprocess(ArrayList<Student> stuList) {
		System.out.println("[���ó�� �޴��Դϴ�.]");
		int rankCount = 1;
		for (int i = 0; i < stuList.size(); i++) {
			rankCount=1;
			for (int j = 0; j < stuList.size(); j++) {
				if (stuList.get(i).total < stuList.get(j).total) {
					rankCount++;
				}

			}
			stuList.get(i).rank=rankCount;
		}
System.out.println("���ó���� �Ϸ�Ǿ����ϴ�. ������¿��� Ȯ���غ�����.");
System.out.println("-------------------------------------");
	}

	@Override
	public void printRank() {
		// TODO Auto-generated method stub

	}

}
