import java.util.Scanner;

public class Home0208_1 {

	public static void main(String[] args) {
		// �п� ����� �ڵ� ����.(���Է� �ϸ鼭 �ڵ� ����)
		// for�� �ȿ��� ��,��,���� Ƚ���� ���������� Ȯ���� �� �ִ�. 
		//�̶� 1,2,3 �̿��� ���� ���� ���� count++�Ǿ� ���� Ƚ���� ġ�� �ȵǱ⶧���� 
		//if���� �̿��Ͽ� 1,2,3�̿��� ���� ���� ��� i--�� ����� ���� Ƚ���� �ùٷ� �����ȴ�.
		String id = "aaa";
		String pass = "1234";
		String id_ch = "";
		String pass_ch = "";

		int user = 0;
		int com = 0;
		int count = 0;
		int win = 0;
		int draw = 0;
		int lose = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("�ݺ� Ƚ���� �Է��ϼ���.>>");
		count = sc.nextInt();

		while (true) {
			System.out.println("�����ϱ� ���� log in ���ּ���");
			System.out.println("���� id�� �Է����ּ���>>");
			id_ch = sc.next();
			if (!(id.equals(id_ch))) {
				System.out.println("id�� ��ġ���� �ʽ��ϴ�.�ٽ� �Է��ϼ���.");
				continue;
			}
			System.out.println("pass�� �Է��� �ּ���.");
			pass_ch = sc.next();
			if (!(pass.equals(pass_ch))) {
				System.out.println("pass�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
				continue;
			}
			for (int i = 1; i <= count; i++) {
				System.out.println("|1.���� |2.����| 3.��| �߿� �ϳ��� �����ϼ���.");
				user = sc.nextInt();

				if (user < 1 || user > 3) {
					System.out.println("��� ���ڸ� �߸��־����ϴ�. ����������(1-3������)");
					i--;
					continue;
				}
				com = (int) (Math.random() * 3) + 1;
				System.out.println(i + "��° �� ���ڴ�?");
				System.out.println("---------------");
				// ���� 1 ���� 2 �� 3
				// 1-3=-2(�¸�) 1-1=0(���º�) 1-2=-1(�й�)
				// 2-1=1(�¸�) 2-2=0(���º�) 2-3=-1(�й�)
				// 3-2=1(�¸�) 3-3=0(���º�) 3-1=2(��)
				switch (user - com) {
				case 1:
				case -2:
					System.out.println("����� �¸�");
					win++;
					break;
				case 0:
					System.out.println("���º�");
					draw++;
					break;
				case -1:
				case 2:
					System.out.println("��ǻ�� �¸�");
					lose++;
					break;
				default:
					break;
				}// switch

			} // for
			break;
		} // while
		System.out.println("���� Ƚ��:" + count);
		System.out.println("�¸� Ƚ��:" + win);
		System.out.println("���º� Ƚ��:" + draw);
		System.out.println("�й� Ƚ��:" + lose);
	}// main

}// class
