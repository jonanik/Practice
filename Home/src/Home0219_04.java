import java.util.Scanner;

public class Home0219_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select = 0;
		int stu_count = 0;
		String name = "";
		String out = "";
		String[] subject = { "학번", "이름", "국어", "영어", "수학", "합계", "평균" };
		Stu[] stu = new Stu[10];
		loop1: while (true) {
			System.out.println("[성적처리 프로그램]");
			System.out.println("1.성적 입력 2.성적 출력 3.성적 수정 0.종료");
			System.out.println("메뉴를 선택하세요.");
			select = scan.nextInt();

			switch (select) {

			case 1:// 성적 입력
				loop3: while (true) {
					for (int i = 0; i < stu.length; i++) {
						stu[i] = new Stu();
						System.out.println("이름을 입력하세요.");
						stu[i].name = scan.next();
						System.out.println("국어점수 입력하세요.");
						stu[i].kor = scan.nextInt();
						System.out.println("영어를 입력하세요.");
						stu[i].eng = scan.nextInt();
						System.out.println("수학점수를 입력하세요.");
						stu[i].math = scan.nextInt();
						stu_count++;

						while (true) {
							System.out.println("더 입력하시겠습니까?(y/n)");
							out = scan.next();
							if (out.equals("y")) {
								continue loop3;
							} else if (out.equals("n")) {
								continue loop1;
							} else {
								System.out.println("y와 n중에 선택해주세요.");
								continue;
							}
						}
					}
				}
			case 2:// 성적 출력
				System.out.println("성적출력을 선택하셨습니다.");
				Stu.stu_num = 1000;
				for (int i = 0; i < subject.length; i++) {
					System.out.print(subject[i] + "\t");
					System.out.println(stu[i].name);
				}
				System.out.println();
				for (int i = 0; i < stu_count; i++) {
					System.out.print(Stu.stu_num + "\t" + stu[i].name + "\t" + stu[i].kor + "\t" + stu[i].eng + "\t"+ stu[i].math + "\t");
					stu[i].total();
					stu[i].avg();
					Stu.stu_num++;
					System.out.println();
				}
				break;
			case 3:// 성적 수정
				loop2: while (true) {
					System.out.println("성적수정을 선택하셨습니다.");
					System.out.println("수정할 학생의 이름을 입력해주세요.(메뉴선택:99)");
					name = scan.next();
					if (name.equals("99")) {
						continue loop1;
					}
					for (int i = 0; i < stu_count; i++) {
						if (stu[i].name.equals(name)) {
							System.out.println(stu[i].name + "학생을 검색하셨습니다.");
						}
						while (true) {
							System.out.println("수정할 과목을 선택하세요(학생 검색:99)");
							System.out.println("1.국어 2.영어 3.수학");
							select = scan.nextInt();
							if (select == 99) {
								break loop2;
							}
							switch (select) {
							case 1:
								System.out.println("국어를 선택하셨습니다.");
								System.out.println("점수를 수정해주세요.");
								stu[i].kor = scan.nextInt();
								System.out.println(stu[i].kor + "점이 입력되었습니다.");
								break;
							case 2:
								System.out.println("영어를 선택하셨습니다.");
								System.out.println("점수를 수정해주세요.");
								stu[i].eng = scan.nextInt();
								System.out.println(stu[i].eng + "점이 입력되었습니다.");
								break;
							case 3:
								System.out.println("수학을 선택하셨습니다.");
								System.out.println("점수를 수정해주세요.");
								stu[i].math = scan.nextInt();
								System.out.println(stu[i].math + "이 입력되었습니다.");
								break;
							}
						}
					} // 학생검색 전체 for
				} // 학생수정메뉴 while

			case 0:
				System.out.println("시스템을 종료합니다.");
				break loop1;
			// switch
			}// while

		} // main
	}

	static void input() {

	}// 메소드

}// class
