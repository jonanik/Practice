import java.util.Scanner;

public class Home0208_02 {

	public static void main(String[] args) {
		// �п� ����� �ڵ� ���� �� �߸��� �κ� ����(���Է� �ϸ鼭 �ڵ� ����)
		// id ����� , pass������ �̸� �����ϰ� ���� �Է°��� if�� ���Ѵ�. �̋�
		// ���� ���� �����ؼ� if������ id,pass 5ȸ�̻� �߸��Էµ� ��� �ý��� ����

		final String ID = "aaa";
		String pass = "1234";
		String id_check = "";
		String pass_check = "";
		int login_check = 0;
		int count = 0;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			if (login_check > 4) {
				System.out.println("id,pass�� 5���̻� �ԷµǾ����ϴ�. �ý����� �����մϴ�.");
				break;
			}
			System.out.println("ID�� �Է��ϼ���");
			id_check = sc.next();
			if (!(id_check.equals(ID))) {
				login_check++;
				System.out.println("ID�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���" + login_check + "ȸ ����");
				continue;
			}
			System.out.println("PASS�� �Է����ּ���.");
			pass_check = sc.next();
			if (!(pass_check.equals(pass))) {
				login_check++;
				System.out.println("Pass�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���." + login_check + "ȸ ����");
				continue;
			}
			System.out.println("1���� ���ϰ� ���� ���ڸ� �Է��ϼ���.");
			count = sc.nextInt();
			for (int i = 1; i <= count; i++) {
				sum += i;
			}
			System.out.printf("1���� %d���� ����: %d", count, sum);
			System.out.println("���α׷��� �����մϴ�.");
			break;

		} // while

	}// main

}// class
