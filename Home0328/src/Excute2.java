import java.util.ArrayList;
import java.util.Scanner;

public class Excute2 {

	Student s = new Student();

	String main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적입력 프로그램");
		System.out.println("1.성적 입력   2.성적 출력  3.학생검색  4.성적 수정 5.학생정보 삭제");
		System.out.println("0.프로그램 종료.");
		String select = scan.next();
		return select;
	}

	void input(ArrayList<Student> stuList) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("이름을 입력해주세요.(이전:0)");
			String name = scan.next();
			if (name.equals("0")) {
				rank(stuList);
				return;
			}
			System.out.println("국어점수 입력해주세요.");
			
			int kor = scan.nextInt();
			System.out.println("영어점수 입력해주세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수 입력해주세요.");
			int math = scan.nextInt();
			stuList.add(new Student(name, kor, eng, math));
		}
	}

	void print(ArrayList<Student> stuList) {
		String[] category = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "랭크" };
		System.out.println("------------------------------------------------------------");
		for (int i = 0; i < category.length; i++) {
			System.out.print(category[i] + "\t");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		System.out.println("------------------------------------------------------------");
	}

	Student search(ArrayList<Student> stuList) {
		Scanner scan = new Scanner(System.in);
		String[] category = { "학번", "이름", "국어", "영어", "수학", "합계", "평균", "랭크" };
		Student search = null;
		System.out.println("검색할 학생의 이름을 입력하세요.");
		String name = scan.next();
		System.out.println("------------------------------------------------------------");
		for (int i = 0; i < category.length; i++) {
			System.out.print(category[i] + "\t");
		}
		System.out.println();
		System.out.println("------------------------------------------------------------");
		for (int i = 0; i < stuList.size(); i++) {
			if (name.equals(stuList.get(i).name)) {
				System.out.println(stuList.get(i));
				search = stuList.get(i);
			}

		}
		return search;
	}

	void rank(ArrayList<Student> stuList) {
		int rank = 1;
		for (int i = 0; i < stuList.size(); i++) {
			rank = 1;
			for (int j = 0; j < stuList.size(); j++) {
				if (stuList.get(i).total < stuList.get(j).total) {
					rank++;
				}
				stuList.get(i).rank = rank;
			}
		}
	}

	void reinput(ArrayList<Student> stuList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("수정할 학생의 이름을 입력해주세요.");
		String name = scan.next();
		for (int i = 0; i < stuList.size(); i++) {
			if (name.equals(stuList.get(i).name)) {
				while (true) {
					System.out.println(stuList.get(i).name + "학생을 검색하셨습니다.");
					System.out.println("어떤 과목의 성적을 수정하시겠습니까?");
					System.out.println("1.국어 2.영어 3.수학");
					System.out.println("0.이전메뉴로");
					String select = scan.next();
					if(select.equals("0")) {
						return;
					}
					switch (select) {
					case "1":
						System.out.println("국어점수를 입력해주세요. ");
						int kor = scan.nextInt();
						stuList.get(i).kor = kor;
						stuList.get(i).total = stuList.get(i).eng + stuList.get(i).math + kor;
						stuList.get(i).avg = stuList.get(i).total / 3;
						rank(stuList);
						System.out.println("국어점수를"+kor+"점으로 변경합니다.");
						break;
					case "2":
						System.out.println("영어점수를 입력해주세요. ");
						int eng = scan.nextInt();
						stuList.get(i).eng = eng;
						stuList.get(i).total = stuList.get(i).kor + stuList.get(i).math + eng;
						stuList.get(i).avg = stuList.get(i).total / 3;
						rank(stuList);
						System.out.println("영어점수를"+eng+"점으로 변경합니다.");
						break;
					case "3":
						System.out.println("수학점수를 입력해주세요. ");
						int math = scan.nextInt();
						stuList.get(i).math = math;
						stuList.get(i).total = stuList.get(i).eng + stuList.get(i).kor + math;
						stuList.get(i).avg = stuList.get(i).total / 3;
						rank(stuList);
						System.out.println("수학점수를"+math+"점으로 변경합니다.");
						break;
					default:
						System.out.println("잘못된 입력입니다.");
						continue;
					}
					System.out.println("----------------------------");
				}
			}

		}

	}
	void delete(ArrayList<Student> stuList) {
		Scanner scan=new Scanner(System.in);
		System.out.println("삭제할 학생의 이름을 입력해주세요.");
		String name=scan.next();
		for(int i=0; i<stuList.size();i++) {
			if(name.equals(stuList.get(i).name)) {
				System.out.println(stuList.get(i).name+"학생의 정보를 정말 삭제하시겠습니까?(y/n)");
				String yn=scan.next();
				if(yn.equals("y")||yn.equals("Y")) {
					System.out.println(stuList.get(i).name+"학생의 정보를 삭제합니다.");
					stuList.remove(i);					
				}else if(yn.equals("n")||yn.equals("N")) {
					System.out.println("이전메뉴로 돌아갑니다.");
					return;
				}
			}
		}
		
	}

}
