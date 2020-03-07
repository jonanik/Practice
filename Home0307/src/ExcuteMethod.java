import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

import com.sun.tools.jdeprscan.scan.Scan;

public class ExcuteMethod implements Excute {

	@Override // ���θ޴�
	public int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("���θ� ����");
		System.out.println("1.ȸ������    2.�α���   3.�α׾ƿ�");
		System.out.println("4.��ǰ����   5.���Ÿ�� Ȯ��");
		System.out.println("6.ȸ����������  7.ȸ���˻�");
		System.out.println("0.���� ������");
		int select = scan.nextInt();
		return select;
		// TODO Auto-generated method stub

	}

	@Override // ȸ������
	public void join(ArrayList<Member> member, HashMap<String, String> loginId) {
		Scanner scan = new Scanner(System.in);
		String id;
		String psw;

		if (loginId.get("id") != null) {
			System.out.println("�α����߿� ȸ�������� �� �� �����ϴ�.");
			return;
		}
		Calendar now = Calendar.getInstance();
		String date = now.get(Calendar.YEAR) + "-" + (now.get(Calendar.MONTH) + 1) + "-" + now.get(Calendar.DATE) + "-"
				+ now.get(Calendar.HOUR_OF_DAY) + ":" + now.get(Calendar.MINUTE) + ":" + now.get(Calendar.SECOND);

		re: while (true) {
			System.out.println("ID�� �Է����ּ���.(���� �޴�:0)");
			id = scan.next();
			if (id.equals("0")) {
				return;
			}
			for (int i = 0; i < member.size(); i++) {
				if (id.equals(member.get(i).id)) {
					System.out.println("���� ID�� �����մϴ� . �ٽ� �Է��ϼ���.");
					continue re;
				}
			}

			if (id.length() < 3) {
				System.out.println("3���� �̻����� �Է����ּ���.");
			}
			break;
		}
		re1: while (true) {
			System.out.println("��й�ȣ�� �Է����ּ���");
			psw = scan.next();
			if (psw.length() < 3) {
				System.out.println("��й�ȣ�� 3�ڸ� �̻����� �Է����ּ���.");
				continue re1;
			}
			int checkCount = 0;
			for (int i = 0; i < psw.length(); i++) {
				if (psw.charAt(i) > 'A' && psw.charAt(i) < 'Z') {
					checkCount++;
				}
			}
			if (checkCount == 0) {
				System.out.println("��й�ȣ�� 1���̻��� �빮�ڸ� �Է����ּ���.");
				continue re1;
			}
			break;
		}
		System.out.println("�̸��� �Է��ϼ���.");
		String name = scan.next();
		member.add(new Member(id, psw, name, 0, date));
		System.out.println(id + "��" + "ȸ�������� �Ϸ�Ǿ����ϴ�.");
		return;
	}

	@Override // �α���
	public void logIn(ArrayList<Member> member, HashMap<String, String> loginId) {
		Scanner scan = new Scanner(System.in);
		String id;
		String psw;
		if (loginId.get("id") != null) {
			System.out.println("�α����� �Ǿ��ִ� �����Դϴ�.");
			return;
		}

		re: while (true) {
			System.out.print("ID�� �Է��ϼ���(����:0)");
			id = scan.next();
			if (id.equals("0")) {
				return;
			}
			System.out.print("PSW�� �Է��ϼ���.(����:0)");
			psw = scan.next();
			if (psw.equals("0")) {
				return;
			}
			for (int i = 0; i < member.size(); i++) {
				if (id.equals(member.get(i).id) && psw.equals(member.get(i).psw)) {
					loginId.put("id", id);
					System.out.println("�α��� �Ǿ����ϴ�.");
					System.out.println("---------------------------");
					return;
				}
				if (i + 1 == member.size()) {
					System.out.println("ID�Ǵ� ��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���.");
					continue re;
				}
			}

		}

	}

	@Override // �α׾ƿ�
	public void logout(HashMap<String, String> loginId) {
		if (loginId.get("id") == null) {
			System.out.println("�α��� �� ���°� �ƴմϴ�.");
		} else {
			loginId.clear();
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
			return;
		}

	}

	@Override // ȸ������ �˻�
	public void searchMem(ArrayList<Member> member) {
		Scanner scan = new Scanner(System.in);
		re: while (true) {
			System.out.print("�˻��� ȸ���� �̸��� �Է��ϼ���.(����:0)");
			String name;

			name = scan.next();
			if (name.equals("0")) {
				System.out.println("-----------------------------");
				return;
			}
			for (int i = 0; i < member.size(); i++) {
				if (name.equals(member.get(i).name)) {
					System.out.println(member.get(i));
					continue re;
				}
				if (i + 1 == member.size()) {
					System.out.println("�������� �ʴ� ȸ���Դϴ�.");
				}

			}

		}
	}
	@Override//ȸ������ ����
	public void showMem(ArrayList<Member> member,Admin a) {
		Scanner scan=new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���.");
		String id=scan.next();
		System.out.println("������ ��й�ȣ�� �Է��ϼ���.");
		String psw=scan.next();
		if(id.equals(a.adminId)&&psw.equals(a.adminPsw)) {
			System.out.println("ȯ���մϴ�. �����ڴ� ������ Ȯ���ϼ���.");
			for(int i=0;i<member.size();i++) {
				System.out.println(member.get(i));
			}
		}else {
			System.out.println("�����ڸ��� Ȯ�ΰ����մϴ�.");
			return;
		}
		
		
	}
		
}

class Admin{
final	String adminId="yo";
final String adminPsw="123";

}
