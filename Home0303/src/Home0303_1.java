import java.util.ArrayList;
import java.util.Scanner;

public class Home0303_1 {

	public static void main(String[] args) {
		// 1)�л����� �Է� 2)�л�����ó�� �Է� 3)�л��������(��ü) 4)�л��������(��ü)
		// 5)�л������˻�(�̸�) 6)�����˻�(�̸�) 0)����
		// -�й�/�̸�/��/�г� -�й�/��/��/��/��/��
		// �й��� ������ ���� �߸鼭 �й��Է��϶�� ��
		// �й� �Է��ϸ� �̸��� �ԷµǰԲ� �ض�
		// Student ��ü
		// Stu_score

		ArrayList<Student> stuinfo = new ArrayList<Student>();
		ArrayList<StuScore> stuscore = new ArrayList<StuScore>();
		String[] subject1 = { "�й�", "�̸�", "�а�", "�г�" };
		String[] subject = { "�й�", "�̸�", "����", "����", "�հ�", "���" };
		loop1: while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("�л��������α׷�");
			System.out.println("1)�л����� �Է�   2)�л�����ó�� �Է�  3)�л��������   4)�л��������");
			System.out.println("5)�л������˻�    6)�����˻�     0)����");
			System.out.println("�޴��� �Է��ϼ���.");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				while (true) {
					System.out.println("�л������Է� �޴� �Դϴ�.");
					System.out.println("�й��� �Է��ϼ���.(���� �޴�:99)");
					int hak_num = scan.nextInt();
					if (hak_num == 99) {
						break;
					}
					System.out.println("�̸��� �Է��ϼ���.");
					String name = scan.next();
					System.out.println("�а��� �Է��ϼ���.");
					String major = scan.next();
					System.out.println("�г��� �Է��ϼ���.");
					int grade = scan.nextInt();
					stuinfo.add(new Student(hak_num, name, major, grade));
				}
				break;
			case 2:
				System.out.println("�л����� �Է� �޴� �Դϴ�.");
				System.out.println("�Է��� �л��� �й��� �Է��ϼ���.");
				int searchHak = scan.nextInt();
				for (int i = 0; i < stuinfo.size(); i++) {
					Student s = (Student) stuinfo.get(i);
					if (!(searchHak == s.hak_num)) {
						continue;
					} else if (searchHak == s.hak_num) {
						System.out.println("���������� �Է��ϼ���.");
						int kor = scan.nextInt();
						System.out.println("���������� �Է��ϼ���.");
						int eng = scan.nextInt();
						stuscore.add(new StuScore(kor, eng));
					}
				}

				break;
			case 3:
				System.out.println("�л�������� �޴� �Դϴ�.");
				for (int i = 0; i < subject1.length; i++) {
					System.out.print(subject1[i] + "\t");
				}
				System.out.println();
				for (int i = 0; i < stuinfo.size(); i++) {
					Student s = (Student) stuinfo.get(i);
					System.out.println(s);
				}
				break;
			case 4:
				System.out.println("�л�������� �޴� �Դϴ�.");
				for (int i = 0; i < subject.length; i++) {
					System.out.print(subject[i] + "\t");
				}
				System.out.println();
				for (int i = 0; i < stuscore.size(); i++) {
					Student s1 = (Student) stuinfo.get(i);
					StuScore s = (StuScore) stuscore.get(i);

					System.out.println(
							s1.hak_num + "\t" + s1.name + "\t" + s.kor + "\t" + s.eng + "\t" + s.total + "\t" + s.avg);
				}
				break;
			case 5:
				System.out.println("�л������˻� �޴� �Դϴ�.");
				System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.");
				String name=scan.next();
				for(int i=0; i<stuinfo.size();i++) {
					Student s=(Student)stuinfo.get(i);
					if(!(name.equals(s.name))) {
						continue;
					}else if(name.equals(s.name)) {
						System.out.println(s);
					}
					
				}
				break;
			case 6:
				System.out.println("�����˻� �޴� �Դϴ�.");
				System.out.println("�˻��� �л��� �̸��� �Է��ϼ���.");
				String name1=scan.next();
				for(int i=0; i<stuinfo.size();i++) {
					Student s1=(Student)stuinfo.get(i);
					StuScore s=(StuScore)stuscore.get(i);
					if(!(name1.equals(s1.name))) {
						continue;
					}else if(name1.equals(s1.name)) {
						System.out.println(s1.hak_num + "\t" + s1.name + "\t" + s.kor + "\t" + s.eng + "\t" + s.total + "\t" + s.avg);
					}
					
				}
				break;
			case 0:
				System.out.println("���α׷��� �����մϴ�.");
				break loop1;

			}
		}
	}

}
