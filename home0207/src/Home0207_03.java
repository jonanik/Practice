import java.util.Scanner;

public class Home0207_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String jumin = "";
		String jumin_check1 = "";// 나이계산
		String month = "";
		String day = "";

		int jumin_check2 = 0;// 1900년대 와 2000년대생 구별
		int korea_age = 0;
		int age = 0;
		int korea_age2 = 0;
		int age2 = 0;
		int select = 0;// 메뉴선택
		int out = 0;// 상위 메뉴이동
		int reselect=0;
		loop1: while (true) {

			System.out.println("[주민번호 정보확인 프로그램]");
			System.out.println("1.나이 확인");
			System.out.println("2.성별 확인");
			System.out.println("3.생일 확인");
			System.out.println("프로그램을 선택하세요.(종료:0)");

			select = sc.nextInt();
			if (select == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(select >= 1 && select <= 3)) {
				System.out.println("1~3번중 프로그램을 다시 선택해주세요");
				continue;
			} else if (select == 1) {
				while (true) {
					System.out.println("-----------------");
					System.out.println("나이 확인 프로그램입니다.");
					System.out.println("-----------------");
					System.out.println("주민번호를 입력하세요.");

					jumin = sc.next();
					jumin_check1 = jumin.substring(0, 2);
					jumin_check2 = jumin.charAt(7) - '0';

					korea_age = 2020 - (1900 + Integer.parseInt(jumin_check1)) + 1;
					age = 2020 - (1900 + Integer.parseInt(jumin_check1));
					korea_age2 = Integer.parseInt(jumin_check1);
					age2 = Integer.parseInt(jumin_check1) - 1;

					if (jumin_check2 == 1 || jumin_check2 == 2) {
						System.out.println("-----------");
						System.out.println("한국나이:" + korea_age + "세");
						System.out.println("만 나이:" + age + "세");
					} else if (jumin_check2 == 3 || jumin_check2 == 4) {
						System.out.println("------------");
						System.out.println("한국나이:" + korea_age2 + "세");
						System.out.println("만 나이:" + age2 + "세");
					}
					System.out.println("-----------");
					System.out.println("상위 메뉴로 이동:99");
					System.out.println("다시 한번 확인:88");
					
					out = sc.nextInt();
					if (out == 99)
						continue loop1;
					if (out==88) {
						continue;
					}
				} // 나이계산 프로그램 while

			} // 나이계산 프로그램 else if

			else if (select == 2) {
				while (true) {
					System.out.println("----------------");
					System.out.println("성별확인 프로그램입니다.");
					System.out.println("----------------");
					System.out.println("주민번호를 입력해주세요");
					jumin = sc.next();
					jumin_check2 = jumin.charAt(7) - '0';
					if (jumin_check2 == 1 || jumin_check2 == 3) {
						System.out.println("남자입니다.");
					} else if (jumin_check2 == 2 || jumin_check2 == 4) {
						System.out.println("여자입니다.");
					}
					System.out.println("------------");
					System.out.println("상위 메뉴로 이동:99");
					System.out.println("다시 한번 확인:88");
					out = sc.nextInt();
					if (out == 99)
						continue loop1;
					if (out==88) {
						continue;
					}
				} // 나이확인 프로그램 while
			} // 나이확인 프로그램 else if
			
			else if (select == 3) {
				while(true) {
				System.out.println("-----------------");
				System.out.println("생일확인 프로그램입니다.");
				System.out.println("-----------------");
				System.out.println("주민번호를 입력해주세요");
				jumin = sc.next();
				month = jumin.substring(2, 4);
				day = jumin.substring(4, 6);
				jumin_check1 = jumin.substring(0, 2);
				jumin_check2 = jumin.charAt(7) - '0';

				if (jumin_check2 == 1 || jumin_check2 == 2) {
					System.out.println("당신의 생일은19" + jumin_check1 + "년" + " " + month + "월" + "  " + day + "일 입니다.");
				} else if (jumin_check2 == 3 || jumin_check2 == 4) {
					System.out.println("당신의 생일은20" + jumin_check1 + "년" + " " + month + "월" + "  " + day + "일 입니다.");
				}
				System.out.println("---------------");
				System.out.println("상위 메뉴로 이동:99");
				System.out.println("다시 한번 확인:88");
				out = sc.nextInt();
				if (out == 99)
					continue loop1;
				if (out==88) {
					continue;
				}
			}
			}//else if
			
		} // while

	}// switch

}// class
