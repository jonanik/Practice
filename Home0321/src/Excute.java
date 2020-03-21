import java.util.ArrayList;
import java.util.Scanner;

public class Excute implements Interface {

	@Override
	public String main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("-----------------");
		System.out.println("학생성적 처리 프로그램");
		System.out.println("-----------------");
		System.out.println("1.성적입력  2.성적출력 3.학생 검색 및 성적수정");
		System.out.println();
		System.out.println("4.등수처리  5.등수출력");
		System.out.println();
		System.out.println("0.프로그램 종료");
		String select = "0";
		select = scan.next();
		return select;
	}

	@Override
	public void inputScore(ArrayList<Student> stuList) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("-------------------");
			System.out.println("[성적입력 메뉴입니다.]");
			System.out.println("-------------------");

			System.out.println("이름을 입력하세요.(이전메뉴:0)");
			String name = scan.next();
			if (name.equals("0")) {
				System.out.println(stuList.size() + "명의 성적이 입력되었습니다.");
				System.out.println("-------------------");
				return;
			}
			System.out.println("학과를 입력하세요.");
			String major = scan.next();
			System.out.println("국어점수를 입력하세요.");
			int kor = scan.nextInt();
			System.out.println("영어점수를 입력하세요.");
			int eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			int math = scan.nextInt();

			stuList.add(new Student(name, major, kor, eng, math));
		}
	}

	@Override
	public void printScore(ArrayList<Student> stuList, String[] category) {

		System.out.println("-------------------");
		System.out.println("[성적 출력메뉴입니다.]");
		System.out.println("-------------------");
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < category.length; i++) {
			System.out.print(category[i] + "\t");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println("입력된 학생의 성적을 모두 출력하였습니다.");
		System.out.println("----------------------------");
	}

	@Override
	public void searchStu(ArrayList<Student> stuList, ArrayList<Student> reinput) {
		Scanner scan = new Scanner(System.in);
		System.out.println("-------------------");
		System.out.println("[학생정보검색 메뉴입니다.]");
		System.out.println("-------------------");

		re: while (true) {
			System.out.println("검색 할 학생의 이름을 입력하세요.(이전:0)");
			String name = scan.next();
			if (name.equals("0")) {
				return;
			}
			for (int i = 0; i < stuList.size(); i++) {
				if (name.equals(stuList.get(i).name)) {
					System.out.println("---------------------");
					System.out.println(stuList.get(i).name + "학생의 정보를 출력합니다.");
					System.out.println("---------------------");
					System.out.println("-------------------------------------------------------------------");
					System.out.println("학번" + "\t" + "이름" + "\t" + "학과" + "\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t"
							+ "합계" + "\t" + "평균"+"\t"+"등수");
					System.out.println(stuList.get(i));
					reinput.add(stuList.get(i));
					System.out.println("-------------------------------------------------------------------");
					while (true) {
						System.out.println("성적을 수정하시겠습니까?(y:수정메뉴로이동/n:학생검색으로이동)");
						String yn = scan.next();
						if (yn.equals("y") || yn.equals("Y") || yn.equals("ㅛ")) {
							reinput(stuList, reinput);
							return;
						} else if (yn.equals("n") || yn.equals("N") || yn.equals("ㅜ")) {
							reinput.clear();
							continue re;
						} else {
							System.out.println("잘못된 입력입니다.");
							continue;
						}
					}
				}

			}
			System.out.println("존재하지 않는 이름입니다. 학생이름을 정확히 입력해주세요.");
			System.out.println("-----------------------------------------");
			continue re;
		}

	}

	@Override
	public void reinput(ArrayList<Student> stuList, ArrayList<Student> reinput) {
		Scanner scan = new Scanner(System.in);
		System.out.println("----------------");
		System.out.println("[성적수정 메뉴입니다.]");
		System.out.println("----------------");
		System.out.println("검색한" + " " + reinput.get(0).name + "학생의 성적을 수정하시겠습니까?(y/n)");
		String yn = scan.next();
		if (yn.equals("y") || yn.equals("Y")) {
			for (int i = 0; i < stuList.size(); i++) {
				if (reinput.get(0).name.equals(stuList.get(i).name)) {
					while (true) {
						System.out.println("---------------------------");
						System.out.println("점수변경할 과목을 선택해주세요.(이전:0)");
						System.out.println("1.국어  2.영어  3.수학");
						int select = 0;
						select = scan.nextInt();

						if (select == 0) {
							System.out.println("성적 수정을 마칩니다.");
							System.out.println("---------------");
							reinput.clear();
							return;
						}
						switch (select) {
						case 1:
							System.out.println("[국어성적 수정]");
							System.out.println("점수를 입력하세요.");
							int kor = scan.nextInt();
							stuList.get(i).kor = kor;
							System.out.println(stuList.get(i).name + "학생의 국어점수가  " + kor + "점으로 변경되었습니다.");
							stuList.get(i).total = kor + stuList.get(i).eng + stuList.get(i).math;
							stuList.get(i).avg = stuList.get(i).total / 3;
							break;
						case 2:
							System.out.println("[영어성적 수정]");
							System.out.println("점수를 입력하세요.");
							int eng = scan.nextInt();
							stuList.get(i).eng = eng;
							System.out.println(stuList.get(i).name + "학생의 영어점수가  " + eng + "점으로 변경되었습니다.");
							stuList.get(i).total = eng + stuList.get(i).kor + stuList.get(i).math;
							stuList.get(i).avg = stuList.get(i).total / 3;
							break;
						case 3:
							System.out.println("[수학성적 수정]");
							System.out.println("점수를 입력하세요.");
							int math = scan.nextInt();
							stuList.get(i).math = math;
							System.out.println(stuList.get(i).name + "학생의 수학점수가  " + math + "점으로 변경되었습니다.");
							stuList.get(i).total = math + stuList.get(i).eng + stuList.get(i).kor;
							stuList.get(i).avg = stuList.get(i).total / 3;
							break;
						default:
							System.out.println("잘못된 입력입니다.");
							break;
						}// switch
					} // while
				} // if

			} // for
		} // if
		else if (yn.equals("n") || yn.equals("N")) {
			reinput.clear();
			System.out.println("메인메뉴로 이동합니다.");
			return;
		}
	}

	@Override
	public void rankprocess(ArrayList<Student> stuList) {
		System.out.println("[등수처리 메뉴입니다.]");
		int rankCount = 1;
		for (int i = 0; i < stuList.size(); i++) {
			rankCount=1;
			for (int j = 0; j < stuList.size(); j++) {
				if (stuList.get(i).total < stuList.get(j).total) {
					rankCount++;
				}

			}
			stuList.get(i).rank=rankCount;
		}
System.out.println("등수처리가 완료되었습니다. 성적출력에서 확인해보세요.");
System.out.println("-------------------------------------");
	}

	@Override
	public void printRank() {
		// TODO Auto-generated method stub

	}

}
