import java.util.Scanner;

public class Home0209_01 {
//2020.02.09���� 
//���Ǳ��� 1. �޴�����->�����->���ǥ��
//		 2.	�������� ���ø޴����� �ش� �޴� �����
//		 3. �α��� ��� 5ȸ�̻� Ʋ���� �ý��� ����
//		 4. �������� ������ �޴����� ��� ���԰����ϴ�.Y/N���� �����Ͽ� Y�ϰܿ� ���� �޴��� �� 
//	 		4-1���Է� �Է��ϸ� �� ��ῡ �߰��ǰ� �߰��� �ܷ��� ��ü ��� ǥ�õ�
//		 5. ��� ������ �ٸ� �޴��� �������� ó�� ���ø޴��� ���ƿ��� ���ð���
//	+
//		6.�޴����� ������ �ҽ� 1~4,0,9 �߿��� �����϶�� ���ϰ� �ٽ� ���ø޴��� �´�
//		
//���� ����		
//		1.��� ������ ���ø޴����� �ش� �޴� ����� �Ӿƴ϶� ���� �Ұ����ϰ� �����
//		2.���� �����Ͽ� �޴� �����Ҷ����� ������ ������ ���� �����ǰ� �ϰ� ���� �����ҽ� ���� ���� �ܰ�� �̵�

	public static void main(String[] args) {
		String id = "aaa";
		String pass = "1234";
		String id_check = "";
		String pass_check = "";
		String yn = "";
		int id_count = 0;
		int pass_count = 0;

		int coffee_amount = 100;
		int sugar_amount = 50;
		int milk_amount = 70;
		int total_sale = 0;
		int total_price = 0;
		int order_num = 0;
		int input_price = 0;
		int add_select = 0;
		int add_amount = 0;
		int input_coin = 0;
		final int BLACK_PRICE = 100;
		final int SUGAR_PRICE = 300;
		final int LATTE_PRICE = 200;
		final int MILK_PRICE = 100;
		boolean black_check = false;
		boolean sugar_check = false;
		boolean latte_check = false;
		boolean milk_check = false;

		Scanner scan = new Scanner(System.in);

		loop1: while (true) {
			System.out.println("----------------------");
			System.out.println("       Ŀ�����Ǳ�                ");
			System.out.println("----------------------");
			if (black_check == false) {
				System.out.println("1)��Ŀ�� -100��");
			}
			if (latte_check == false) {
				System.out.println("2)��Ŀ�� -200��");
			}
			if (sugar_check == false) {
				System.out.println("3)���Ŀ��-300��");
			}
			if (milk_check == false) {
				System.out.println("4)��ũĿ��-100��");
			}
			System.out.println("9)������");
			System.out.println("0)�ý��� ����");
			System.out.println("-----------------");
//			System.out.println("   ������ �������ּ���    ");
//			System.out.println("100�� �Ǵ� 500���� ���԰����մϴ�.");
//			while(true) {
//				input_coin=scan.nextInt();
//			if(!(input_coin==100||input_coin==500)) {
//				System.out.println("100�� �Ǵ� 500�� �� �������ֽʽÿ�.");
//				continue;
//			}
//			}//���� ���� while
			System.out.println("���ð�  ���� Ŀ�ǹ�ȣ�� �Է��ϼ���.>>");
			order_num = scan.nextInt();
			if (!(order_num == 1 || order_num == 2 || order_num == 3 || order_num == 4 || order_num == 9
					|| order_num == 0)) {
				System.out.println("!!!!!���ð����� �ɼ��߿��� �ٽ� �������ּ���!!!!!(1~4 �Ǵ� 9,0)");
				continue;
			}
			switch (order_num) {
			case 1:
				if (!(coffee_amount > 10)) {
					System.out.println("Ŀ�ǰ� �����մϴ�. �����ڿ��� �������ּ���");
					black_check = !(black_check);
					continue;
				}
				coffee_amount -= 10;
				total_sale++;
				total_price += 100;
				input_price -= 100;
				System.out.println("��Ŀ�� 1���� ���Խ��ϴ�. �����ο� ����~�� Ŀ��");

				continue;

			case 2:
				if (!(coffee_amount >= 10)) {
					System.out.println("Ŀ�ǰ� �����մϴ�. �����ڿ��� �������ּ���");
					latte_check = !(black_check);
					continue;

				}
				if (!(milk_amount >= 5)) {
					System.out.println("������ �����մϴ�. �����ڿ��� �������ּ���");
					latte_check = !(latte_check);
					continue;
				}
				coffee_amount -= 10;
				milk_amount -= 5;
				total_sale++;
				total_price += 200;
				input_price -= 200;
				System.out.println("ī��� 1���� ���Խ��ϴ�. �����ο� ����~�� Ŀ��");

				continue;

			case 3:
				if (!(coffee_amount >= 5)) {
					System.out.println("Ŀ�ǰ� �����մϴ�. �����ڿ��� �������ּ���");
					sugar_check = !(black_check);
					continue;
				}
				if (!(milk_amount >= 5)) {
					System.out.println("������ �����մϴ�. �����ڿ��� �������ּ���");
					sugar_check = !(black_check);
					continue;
				}
				if (!(sugar_amount >= 5)) {
					System.out.println("������ �����մϴ�. �����ڿ��� �������ּ���");
					sugar_check = !(black_check);
					continue;
				}
				coffee_amount -= 5;
				milk_amount -= 5;
				sugar_amount -= 5;
				total_sale++;
				total_price += 300;
				input_price -= 300;
				System.out.println("���Ŀ�� 1���� ���Խ��ϴ�. �����ο� ����~�� Ŀ��");

				continue;

			case 4:
				if (!(coffee_amount >= 3)) {
					System.out.println("Ŀ�ǰ� �����մϴ�. �����ڿ��� �������ּ���");
					milk_check = !(black_check);
					continue;
				}
				if (!(milk_amount >= 5)) {
					System.out.println("������ �����մϴ�. �����ڿ��� �������ּ���");
					milk_check = !(black_check);
					continue;
				}
				if (!(sugar_amount >= 3)) {
					System.out.println("������ �����մϴ�. �����ڿ��� �������ּ���");
					milk_check = !(black_check);
					continue;
				}
				coffee_amount -= 3;
				milk_amount -= 5;
				sugar_amount -= 3;
				total_sale++;
				total_price += 100;
				input_price -= 100;
				System.out.println("��ũĿ�� 1���� ���Խ��ϴ�. �����ο� ����~�� Ŀ��");

				continue;

			case 9:
				while (true) {
					if ((id_count + pass_count) > 4) {
						System.out.println("5ȸ �̻� ���̵�, ��й�ȣ������ �޴��� ���ư��ϴ�.");
						break;
					}
					System.out.println("�����ھ��̵� �Է��ϼ���>>");
					id_check = scan.next();
					if (!(id_check.equals(id))) {
						System.out.println("���̵� ��ġ���� �ʽ��ϴ�. �ٽ��Է��ϼ���.");
						id_count++;
						;
						continue;
					} // if
					System.out.println("������ ��й�ȣ�� �Է��ϼ���.");
					pass_check = scan.next();
					if (!(pass_check.equals(pass))) {
						System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է��ϼ���.");
						pass_count++;
					}
					System.out.println("----------------------");
					System.out.println("         [���]        ");
					System.out.println("----------------------");
					System.out.println("coffee_amount��:" + coffee_amount);
					System.out.println("sugar_amount��:" + sugar_amount);
					System.out.println("milk_amount��:" + milk_amount);
					System.out.println("");
					System.out.println("----------------------");
					System.out.println("        [�Ǹſ��]       ");
					System.out.println("----------------------");
					System.out.println("total_sale��:" + total_sale);
					System.out.println("total_price:" + total_price);
					System.out.println("----------------------");
					while (true) {
						System.out.println("��� �����Ͻðڽ��ϱ�?y/n");
						System.out.println("Ŀ�� �ܷ�:" + coffee_amount);
						System.out.println("���� �ܷ�:" + sugar_amount);
						System.out.println("���� �ܷ�:" + milk_amount);
						yn = scan.next();
						if (yn.equals("y") || yn.contentEquals("Y")) {
							System.out.println("������ ��Ḧ �����ϼ���.");

							System.out.println("1)Ŀ�� 2)���� 3)����");
							add_select = scan.nextInt();
							switch (add_select) {
							case 1:
								System.out.println("Ŀ�Ǹ� �����մϴ�.");
								System.out.println("�󸶳� �����Ͻðڽ��ϱ�?");
								add_amount = scan.nextInt();
								coffee_amount += add_amount;
								break;
							case 2:
								System.out.println("������ �����մϴ�.");
								System.out.println("�󸶳� �����Ͻðڽ��ϱ�?");
								add_amount = scan.nextInt();
								sugar_amount += add_amount;	
								break;

							case 3:
								System.out.println("������ �����մϴ�.");
								System.out.println("�󸶳� �����Ͻðڽ��ϱ�?");
								add_amount = scan.nextInt();
								milk_amount += add_amount;
								break;

							}
						} else if (yn.equals("n") || yn.contentEquals("N")) {
							System.out.println("�޴��� ���ư��ϴ�.");
							continue loop1;
						}

						// ������� if
					} // case 9(�����ڸ޴�)-while-������� while

				} // case 9(�����ڸ޴�)�� while
			case 0:
				System.out.println("�ý����� �����մϴ�.");

				break;

			}// switch

			break;

		} // while

	}// main

}// class