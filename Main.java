package home0419_01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Excute ex = new Excute();
		Student stu = new Student();
		ArrayList<Student> list = new ArrayList<Student>();
		while (true) {
			switch (ex.main()) {
			case "1":// �����Է�
				ex.insert(list, stu);
				break;
			case "2":// �������
				ex.print(list);
				break;
				
			case "3":// �л������˻�
				ex.search(list);
				break;
			case "4":// �л���������
				ex.delete(list);
				break;
			case "5":// �л����� ����
				ex.reinsert(list);
				break;
			case "0":// ���α׷� ����
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
				
				break;

			default:
				System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�.");
				break;
			}

		}
	}
}
