package home0419_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {

	ArrayList<Student> list = new ArrayList<Student>();

	String main() {
		Scanner scan = new Scanner(System.in);

		System.out.println("[학생정보 처리프로그램]");
		System.out.println("1.성적입력  2.성적출력  3.학생정보검색 ");
		System.out.println("4.학생정보 삭제 5.학생정보 수정 0.프로그램 종료");
		String select;
		select = scan.next();

		return select;
	}

	void insert(ArrayList<Student> list, Student stu) {
		Scanner scan = new Scanner(System.in);
		String name;
		int kor, eng, math;

		while (true) {
			System.out.println("[학생정보 입력.] 이전메뉴:0");
			System.out.println("이름을 입력하세요.");
			name = scan.next();
			if (name.equals("0")) {
				System.out.println("메인메뉴로 돌아갑니다.");
				return;
			}
			System.out.println("국어점수를 입력하세요.");
			kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			math = scan.nextInt();

			stu = new Student(name, kor, eng, math);
			list.add(stu);

		}
	}

	void print(ArrayList<Student> list) {
		String[] category = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "등수" };
		System.out.println("[학생정보 출력]");

		for (int i = 0; i < category.length; i++) {
			System.out.print(category[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		return;

	}

	void search(ArrayList<Student> list) {
		String category = "학번\t이름\t국어\t영어\t수학\t합계\t평균\t등수";
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("[학생정보 검색] 이전메뉴:0");
			System.out.println("검색할 학생의 이름을 입력하세요.");

			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("메인메뉴로 이동합니다.");
				return;
			}
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).name)) {
					System.out.println(category);
					System.out.println(list.get(i));
					System.out.println("더 검색하시겠습니까?(y/n)");
					String yn = scan.next();
					if (yn.equals("y") || yn.equals("Y")) {
						break;
					} else if (yn.equals("n") || yn.equals("N")) {
						return;
					}
				} // if
			} // for
		} // while
	}// search

	void delete(ArrayList<Student> list) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("[학생정보 삭제] 이전메뉴:0");
			System.out.println("삭제할 학생의 이름을 입력하세요.");
			String name = scan.next();
			for (int i = 0; i < list.size(); i++) {
				if (name.equals("0")) {
					System.out.println("메인메뉴로 이동합니다.");
					return;
				}
				if (name.equals(list.get(i).name)) {
					System.out.println(list.get(i).name + "학생의 정보를 제거하시겠습니까?(y/n)");
					String yn = scan.next();
					if (yn.equals("y") || yn.equals("Y")) {
						System.out.println(list.get(i).name + "학생의 정보를 제거합니다.");
						list.remove(i);
						System.out.println("정보를 더 삭제하시겠습니까?(y/n)");
						String yn1 = scan.next();
						if (yn1.equals("y") || yn1.equals("Y")) {
							break;
						} else if (yn1.equals("n") || yn1.equals("N")) {
							System.out.println("메인메뉴로 이동합니다.");
							return;
						}
					} else if (yn.equals("n") || yn.equals("N")) {
						break;
					}

				}
			}
		} // while
	}// delete

	void reinsert(ArrayList<Student> list) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("[학생정보 수정] 이전메뉴:0");
			System.out.println("수정할 학생의 이름을 입력해주세요.");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println("메인메뉴로 이동합니다.");
				return;
			}
			for (int i = 0; i < list.size(); i++) {
				if (name.equals(list.get(i).name)) {
					System.out.println(list.get(i).name + "학생의 정보를 검색하셨습니다.");
					System.out.println("수정할 정보를 선택하세요. 이전메뉴:0");
					System.out.println("1.이름 2.국어점수 3.영어점수 4.수학점수 ");
					String select = scan.next();
					if (select.equals("0")) {
						System.out.println("메인메뉴로 이동합니다.");
						return;
					}
					switch (select) {
					case "1":
						System.out.println("이름수정을 선택하셨습니다.");
						System.out.println("수정할 이름을 입력해주세요");
						String rename = scan.next();
						System.out.println(list.get(i).name + "학생의 이름이  " + rename + "으로 변경됬습니다.");
						list.get(i).name = rename;
						break;
					case "2":
						System.out.println("국어점수 수정을 선택하셨습니다.");
						System.out.println("새로운 국어점수를 입력해주세요");
						int rekor = scan.nextInt();
						System.out
								.println(list.get(i).name + "학생의 국어점수가" + list.get(i).kor + "에서" + rekor + "로 변경됬습니다.");
						list.get(i).kor = rekor;
						list.get(i).total = rekor + list.get(i).eng + list.get(i).math;
						list.get(i).avg = list.get(i).total / 3;
						break;
					case "3":
						System.out.println("영어점수 수정을 선택하셨습니다.");
						System.out.println("새로운 영어점수를 입력해주세요");
						int reeng = scan.nextInt();
						System.out
								.println(list.get(i).name + "학생의 영어점수가" + list.get(i).eng + "에서" + reeng + "로 변경됬습니다.");
						list.get(i).eng = reeng;
						list.get(i).total = reeng + list.get(i).kor + list.get(i).math;
						list.get(i).avg = list.get(i).total / 3;
						break;
					case "4":
						System.out.println("수학점수 수정을 선택하셨습니다.");
						System.out.println("새로운 수학점수를 입력해주세요");
						int remath = scan.nextInt();
						System.out.println(
								list.get(i).name + "학생의 수학점수가" + list.get(i).math + "에서" + remath + "로 변경됬습니다.");
						list.get(i).math = remath;
						list.get(i).total = remath + list.get(i).eng + list.get(i).kor;
						list.get(i).avg = list.get(i).total / 3;
						break;
					default:
						System.out.println("잘못된 입력입니다.");
						;
						break;
					}//switch
				}//if

			}//for

		}//while
	}//reinsert
}
