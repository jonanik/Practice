import java.util.Scanner;

public class Home0209_01 {
//2020.02.09수정 
//자판기기능 1. 메뉴선택->재고감량->재고표시
//		 2.	재고부족시 선택메뉴에서 해당 메뉴 사라짐
//		 3. 로그인 기능 5회이상 틀리면 시스템 종료
//		 4. 재고부족시 관리자 메뉴에서 재고 투입가능하다.Y/N으로 선택하여 Y일겨우 투입 메뉴로 들어감 
//	 		4-1투입량 입력하면 각 재료에 추가되고 추가된 잔량과 전체 재고량 표시됨
//		 5. 재고 충전후 다른 메뉴를 충전할지 처음 선택메뉴로 돌아올지 선택가능
//	+
//		6.메뉴외의 선택을 할시 1~4,0,9 중에서 선택하라고 말하고 다시 선택메뉴로 온다
//		
//추후 수정		
//		1.재고 부족시 선택메뉴에서 해당 메뉴 사라질 뿐아니라 선택 불가능하게 만들기
//		2.동전 투입하여 메뉴 선택할때마다 투입한 돈에서 돈이 감량되게 하고 돈이 부족할시 동전 투입 단계로 이동

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
			System.out.println("       커피자판기                ");
			System.out.println("----------------------");
			if (black_check == false) {
				System.out.println("1)블랙커피 -100원");
			}
			if (latte_check == false) {
				System.out.println("2)라떼커피 -200원");
			}
			if (sugar_check == false) {
				System.out.println("3)흑당커피-300원");
			}
			if (milk_check == false) {
				System.out.println("4)밀크커피-100원");
			}
			System.out.println("9)관리자");
			System.out.println("0)시스템 종료");
			System.out.println("-----------------");
//			System.out.println("   동전을 투입해주세요    ");
//			System.out.println("100원 또는 500원만 투입가능합니다.");
//			while(true) {
//				input_coin=scan.nextInt();
//			if(!(input_coin==100||input_coin==500)) {
//				System.out.println("100원 또는 500원 만 투입해주십시오.");
//				continue;
//			}
//			}//동전 투입 while
			System.out.println("마시고  싶은 커피번호를 입력하세요.>>");
			order_num = scan.nextInt();
			if (!(order_num == 1 || order_num == 2 || order_num == 3 || order_num == 4 || order_num == 9
					|| order_num == 0)) {
				System.out.println("!!!!!선택가능한 옵션중에서 다시 선택해주세요!!!!!(1~4 또는 9,0)");
				continue;
			}
			switch (order_num) {
			case 1:
				if (!(coffee_amount > 10)) {
					System.out.println("커피가 부족합니다. 관리자에게 연락해주세요");
					black_check = !(black_check);
					continue;
				}
				coffee_amount -= 10;
				total_sale++;
				total_price += 100;
				input_price -= 100;
				System.out.println("블랙커피 1잔이 나왔습니다. 여유로운 한잔~의 커피");

				continue;

			case 2:
				if (!(coffee_amount >= 10)) {
					System.out.println("커피가 부족합니다. 관리자에게 연락해주세요");
					latte_check = !(black_check);
					continue;

				}
				if (!(milk_amount >= 5)) {
					System.out.println("우유가 부족합니다. 관리자에게 연락해주세요");
					latte_check = !(latte_check);
					continue;
				}
				coffee_amount -= 10;
				milk_amount -= 5;
				total_sale++;
				total_price += 200;
				input_price -= 200;
				System.out.println("카페라떼 1잔이 나왔습니다. 여유로운 한잔~의 커피");

				continue;

			case 3:
				if (!(coffee_amount >= 5)) {
					System.out.println("커피가 부족합니다. 관리자에게 연락해주세요");
					sugar_check = !(black_check);
					continue;
				}
				if (!(milk_amount >= 5)) {
					System.out.println("우유가 부족합니다. 관리자에게 연락해주세요");
					sugar_check = !(black_check);
					continue;
				}
				if (!(sugar_amount >= 5)) {
					System.out.println("설탕이 부족합니다. 관리자에게 연락해주세요");
					sugar_check = !(black_check);
					continue;
				}
				coffee_amount -= 5;
				milk_amount -= 5;
				sugar_amount -= 5;
				total_sale++;
				total_price += 300;
				input_price -= 300;
				System.out.println("흑당커피 1잔이 나왔습니다. 여유로운 한잔~의 커피");

				continue;

			case 4:
				if (!(coffee_amount >= 3)) {
					System.out.println("커피가 부족합니다. 관리자에게 연락해주세요");
					milk_check = !(black_check);
					continue;
				}
				if (!(milk_amount >= 5)) {
					System.out.println("우유가 부족합니다. 관리자에게 연락해주세요");
					milk_check = !(black_check);
					continue;
				}
				if (!(sugar_amount >= 3)) {
					System.out.println("설탕이 부족합니다. 관리자에게 연락해주세요");
					milk_check = !(black_check);
					continue;
				}
				coffee_amount -= 3;
				milk_amount -= 5;
				sugar_amount -= 3;
				total_sale++;
				total_price += 100;
				input_price -= 100;
				System.out.println("밀크커피 1잔이 나왔습니다. 여유로운 한잔~의 커피");

				continue;

			case 9:
				while (true) {
					if ((id_count + pass_count) > 4) {
						System.out.println("5회 이상 아이디, 비밀번호오류로 메뉴로 돌아갑니다.");
						break;
					}
					System.out.println("관리자아이디를 입력하세요>>");
					id_check = scan.next();
					if (!(id_check.equals(id))) {
						System.out.println("아이디가 일치하지 않습니다. 다시입력하세요.");
						id_count++;
						;
						continue;
					} // if
					System.out.println("관리자 비밀번호를 입력하세요.");
					pass_check = scan.next();
					if (!(pass_check.equals(pass))) {
						System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
						pass_count++;
					}
					System.out.println("----------------------");
					System.out.println("         [재고]        ");
					System.out.println("----------------------");
					System.out.println("coffee_amount량:" + coffee_amount);
					System.out.println("sugar_amount량:" + sugar_amount);
					System.out.println("milk_amount량:" + milk_amount);
					System.out.println("");
					System.out.println("----------------------");
					System.out.println("        [판매요약]       ");
					System.out.println("----------------------");
					System.out.println("total_sale량:" + total_sale);
					System.out.println("total_price:" + total_price);
					System.out.println("----------------------");
					while (true) {
						System.out.println("재고를 충전하시겠습니까?y/n");
						System.out.println("커피 잔량:" + coffee_amount);
						System.out.println("설탕 잔량:" + sugar_amount);
						System.out.println("우유 잔량:" + milk_amount);
						yn = scan.next();
						if (yn.equals("y") || yn.contentEquals("Y")) {
							System.out.println("충전할 재료를 선택하세요.");

							System.out.println("1)커피 2)설탕 3)우유");
							add_select = scan.nextInt();
							switch (add_select) {
							case 1:
								System.out.println("커피를 충전합니다.");
								System.out.println("얼마나 충전하시겠습니까?");
								add_amount = scan.nextInt();
								coffee_amount += add_amount;
								break;
							case 2:
								System.out.println("설탕을 충전합니다.");
								System.out.println("얼마나 충전하시겠습니까?");
								add_amount = scan.nextInt();
								sugar_amount += add_amount;	
								break;

							case 3:
								System.out.println("우유를 충전합니다.");
								System.out.println("얼마나 충전하시겠습니까?");
								add_amount = scan.nextInt();
								milk_amount += add_amount;
								break;

							}
						} else if (yn.equals("n") || yn.contentEquals("N")) {
							System.out.println("메뉴로 돌아갑니다.");
							continue loop1;
						}

						// 재고충전 if
					} // case 9(관리자메뉴)-while-재고충전 while

				} // case 9(관리자메뉴)의 while
			case 0:
				System.out.println("시스템을 종료합니다.");

				break;

			}// switch

			break;

		} // while

	}// main

}// class