import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortPactice {

	public static void main(String[] args) {
		ArrayList<Stui> stu = new ArrayList<Stui>();
		Stui s = new Stui();
		input(stu, s);

		while (true) {
			switch (main()) {
			case 1:
				print(stu, s);

				break;
			case 2:
				s.compare(s, s);

				break;
			case 3:
				s.nameCompare(s, s);

				break;
			case 4:
				s.totalCompare(s, s);

				break;

			}
		}
	}

	static int main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("1.���  2.�й�����  3.�̸�����  4.�հ�����");
		int select = 0;

		return select = scan.nextInt();
	}

	static void input(ArrayList<Stui> stu, Stui s) {
		String[] subject = { "�й�", "�̸�", "�հ�" };
		int[] hakNum = { 1, 2, 3, 4 };
		String[] name = { "��ȣ��", "�躴��", "ȭ����", "�ֿ���" };
		int[] total = { 300, 200, 150, 250 };

		for (int i = 0; i < name.length; i++) {
			stu.add(new Stui(hakNum[i], name[i], total[i]));
		}
	}

	static void print(ArrayList<Stui> stu, Stui s) {
		Collections.sort(stu, new Stui());
		String[] subject = { "�й�", "�̸�", "�հ�" };
		for (int i = 0; i < 3; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			System.out.println(stu.get(i));
		}
	}

	void hakNumSort(ArrayList<Stui> stu, Stui s) {

	}
}

class Stui implements Comparator<Stui> {
	int hakNum;
	String name;
	int total;

	Stui() {

	}

	Stui(int hakNum, String name, int total) {
		this.hakNum = hakNum;
		this.name = name;
		this.total = total;
	}

	@Override
	public String toString() {
		return hakNum + "\t" + name + "\t" + total;
	}

	public int compare(Stui s1, Stui s2) {
		if (s1.hakNum < s2.hakNum) {
			return -1;
		} else if (s1.hakNum > s2.hakNum) {
			return 1;
		}
		return 0;
	}

	public int totalCompare(Stui s1, Stui s2) {
		if (s1.total < s2.total) {
			return 1;
		} else if (s1.total > s2.total) {
			return -1;
		}
		return 0;
	}

	public int nameCompare(Stui s1, Stui s2) {
		return s1.name.compareTo(s2.name);

	}

}