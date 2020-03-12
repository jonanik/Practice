import java.util.Scanner;

public class Home0220_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Student[] stu = new Student[10];
		String[] subject = { "학번", "이름", "국어", "영어", "수학", "합계", "평균" };
		String[] rank_subject = { "등수", "이름", "평균" };
		String name = "";
		int select = 0, select1 = 0;
		int stu_count = 0;
		int rank_count = 0;

		loop2: while (true) {
			menu();// 성적처리프로그램 메뉴
			select = scan.nextInt();

			switch (select) {
			case 1:
				while (true) {
					System.out.println("성적입력을 선택하셨습니다.");
					for (int i = 0; i < stu.length; i++) {
						stu[i] = new Student();
						System.out.println("이름을 입력하세요.(이전메뉴:99)");
						stu[i].name = scan.next();
						if (stu[i].name.equals("99")) {
							continue loop2;
						}
						System.out.println("국어 점수를 입력하세요.");
						stu[i].kor = scan.nextInt();
						System.out.println("영어 점수를 입력하세요.");
						stu[i].eng = scan.nextInt();
						System.out.println("수학 점수를 입력하세요.");
						stu[i].math = scan.nextInt();
						stu_count++;
					}
					break;
				}
				break;
			case 2:// 성적 출력
				print(stu, subject, stu_count);
				continue loop2;
			case 3:// 성적 수정
				reinput(stu, name, stu_count, select1);
				continue loop2;
			case 4:// 등수처리
				rank_method(stu, rank_count, stu_count, rank_subject);

				continue loop2;
			case 0:
				System.out.println("프로그램을 종료합니다.");

				break;

			}// switch
			break;
		} // while
	}// main

	static void menu() {

		System.out.println("성적입력 프로그램");
		System.out.println("1.성적 입력  2.성적 출력");
		System.out.println("3.성적 수정  4.등수처리");
		System.out.println("0.프로그램 종료");

	}

	static void print(Student[] stu, String[] subject, int stu_count) {
		System.out.println("성적 출력을 입력하셨습니다.");
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i] + "\t");
		}
		System.out.println();

		Student.stu_num = 1000;
		for (int i = 0; i < stu_count; i++) {
			System.out.print(Student.stu_num + "\t");
			System.out.print(stu[i].name + "\t" + stu[i].kor + "\t" + stu[i].eng + "\t" + stu[i].math + "\t");
			stu[i].total();
			stu[i].avg();
			Student.stu_num++;
			System.out.println();
		}

	}

	static void reinput(Student[] stu, String name, int stu_count, int select1) {
		loop1: while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("성적 수정을 선택하셨습니다.");
			System.out.println("성적변경할 학생의 이름을 입력하세요.(이전메뉴:99)");
			name = scan.next();
			for (int i = 0; i < stu_count; i++) {
				if (name.equals("99")) {
					break loop1;
				}

				else if (!(name.equals(stu[i].name))) {
					System.out.println("존재하지 않습니다. 다시 입력하세요.");
					continue loop1;
				} else if (name.equals(stu[i].name)) {
					System.out.println(stu[i].name + "학생을 검색하셨습니다.");
					System.out.println("변경할 점수를 선택하세요.");
					System.out.println("1.국어  2.영어  3.수학");
					select1 = scan.nextInt();
					switch (select1) {
					case 1:
						System.out.println("국어점수 변경을 선택하셨습니다.");
						System.out.println("점수를 입력하세요.");
						stu[i].kor = scan.nextInt();
						System.out.println(stu[i].kor + "점이 입력됬습니다.");
						break;
					case 2:
						System.out.println("영어점수 변경을 선택하셨습니다.");
						System.out.println("점수를 입력하세요.");
						stu[i].eng = scan.nextInt();
						System.out.println(stu[i].eng + "점이 입력됬습니다.");
						break;
					case 3:
						System.out.println("수학점수 변경을 선택하셨습니다.");
						System.out.println("점수를 입력하세요.");
						stu[i].math = scan.nextInt();
						System.out.println(stu[i].math + "점이 입력됬습니다.");
						break;
					}// 작은 switch
					continue loop1;
				}
			} // for
			break;
		} // while

	}

	static void rank_method(Student[] stu, int rank_count, int stu_count, String[] rank_subject) {

		for (int i = 0; i < stu_count; i++) {
			rank_count = 1;
			for (int j = 0; j < stu_count; j++) {
				if (stu[i].total < stu[j].total) {
					rank_count++;
				}
				stu[i].rank = rank_count;
			}
		}
		for (int i = 0; i < rank_subject.length; i++) {
			System.out.print(rank_subject[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < stu_count; i++) {
			System.out.print(stu[i].rank + "등\t" + stu[i].name + "\t" + stu[i].avg);
			System.out.println();
		}
	}
}// class

class Student {
	static int stu_num = 1000;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;

	void total() {
		total = kor + eng + math;
		System.out.print(total + "\t");
	}

	void avg() {
		avg = (kor + eng + math) / 3;
		System.out.print(avg + "\t");
	}

}
