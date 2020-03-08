import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class ExcuteMethod implements Excute {

	@Override // ���θ޴�
	public String menu() {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("���θ� ����");
			System.out.println("1.ȸ������    2.�α���   3.�α׾ƿ�");
			System.out.println("4.��ǰ����   5.���Ÿ�� Ȯ��");
			System.out.println("6.ȸ����������  7.ȸ���˻�");
			System.out.println("0.���� ������");
			String select = scan.next();
			
			if (!(Integer.parseInt(select) >= 0 && Integer.parseInt(select) <= 7)) {
				System.out.println("�ùٸ� ���� �Է����ּ���.");
				continue;
			}
			return select;
		}
		

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

	@Override // ȸ������ ����
	public void showMem(ArrayList<Member> member, Admin a) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���.");
		String id = scan.next();
		System.out.println("������ ��й�ȣ�� �Է��ϼ���.");
		String psw = scan.next();
		if (id.equals(a.adminId) && psw.equals(a.adminPsw)) {
			System.out.println("ȯ���մϴ�. �����ڴ� ������ Ȯ���ϼ���.");
			for (int i = 0; i < member.size(); i++) {
				System.out.println(member.get(i));
			}
		} else {
			System.out.println("�����ڸ��� Ȯ�ΰ����մϴ�.");
			return;
		}

	}

	@Override // ��ǰ ���
	public void setProduct(ArrayList<Product> product) {
		product.add(new Tv("1", "LCDTV", 1000, 100, "LCD", "40"));
		product.add(new Tv("2", "LEDTV", 1100, 110, "LED", "50"));
		product.add(new Tv("3", "OLEDTV", 1300, 130, "OLED", "60"));
		product.add(new Fridge("4", "�Ϲݳ����", 1000, 100, "200", "�ܹ���"));
		product.add(new Fridge("5", "�繮�������", 1200, 120, "250", "�繮��"));
		product.add(new Laundary("6", "�뵹�̼�Ź��", 1000, 80, "18kg", "�뵹��"));
		product.add(new Laundary("7", "�巳��Ź��", 1000, 100, "18kg", "�巳"));
		return;
	}

	@Override
	public void buy(ArrayList<Member> member, HashMap<String, String> loginId, ArrayList<Product> product,
			ArrayList<BuyList> buyList) {
		Scanner scan = new Scanner(System.in);

		Calendar now = Calendar.getInstance();
		String buyTime = now.get(Calendar.YEAR) + "��-" + (now.get(Calendar.MONTH) + 1) + "��-" + now.get(Calendar.DATE)
				+ "��|" + now.get(Calendar.HOUR_OF_DAY) + "��:" + now.get(Calendar.MINUTE) + "��:"
				+ now.get(Calendar.SECOND) + "��";

		if (loginId.get("id") == null) {
			System.out.println("�α����� �̿밡���մϴ�.");
			logIn(member, loginId);
			if (loginId.get("id") == null) {
				System.out.println("���̵� �����ôٸ� ȸ������ �� �α����Ͽ� �̿����ֽʽÿ�.");
				return;
			}
		}
		while (true) {

			for (int i = 0; i < product.size(); i++) {
				System.out.println(product.get(i));
			}

			System.out.println("�����Ͻ� ��ǰ�� ������.(����:0)");
			String buy = scan.next();
			if (buy.equals("0")) {
				return;
			}
			if (Integer.parseInt(buy) < 0 || Integer.parseInt(buy) > 7) {
				System.out.println("���ð����� ��ǰ�� �������ּ���.");
				continue;
			}
			for (int i = 0; i < member.size(); i++) {
				if (loginId.get("id").equals(member.get(i).id)) {
					member.get(i).point += product.get(Integer.parseInt(buy) - 1).bonusPoint;

				}

			}

			for (int i = 0; i < product.size(); i++) {
				if (buy.equals(product.get(i).code)) {
					buyList.add(new BuyList(loginId.get("id"), product.get(Integer.parseInt(buy) - 1).name,
							product.get(Integer.parseInt(buy) - 1).price, buyTime));
					System.out.println(product.get(Integer.parseInt(buy) - 1).name + " ��/�� �����ϼ̽��ϴ�.");
					System.out.println("����Ʈ  " + product.get(Integer.parseInt(buy) - 1).bonusPoint + "���� �߰��Ǿ����ϴ�.");
					return;
				}
			}

		}
	}

	@Override
	public void showBuyList(ArrayList<BuyList> buyList) {
		for (int i = 0; i < buyList.size(); i++) {
			System.out.println(buyList.get(i));
		}
		return;
	}

}

class Admin {
	final String adminId = "yo";
	final String adminPsw = "123";

}
