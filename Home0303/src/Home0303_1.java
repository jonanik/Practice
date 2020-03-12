import java.util.ArrayList;
import java.util.Scanner;

public class Home0303_1 {

	public static void main(String[] args) {
		// 1)학생정보 입력 2)학생성적처리 입력 3)학생정보출력(전체) 4)학생성적출력(전체)
		// 5)학생정보검색(이름) 6)성적검색(이름) 0)종료
		// -학번/이름/과/학년 -학번/국/영/합/평/등
		// 학번이 없으면 에러 뜨면서 학번입력하라고 뜸
		// 학번 입력하면 이름이 입력되게끔 해라
		// Student 객체
		// Stu_score

		ArrayList<Student> stuinfo = new ArrayList<Student>();
		ArrayList<StuScore> stuscore = new ArrayList<StuScore>();
		String[] subject1 = { "학번", "이름", "학과", "학년" };
		String[] subject = { "학번", "이름", "국어", "영어", "합계", "평균" };
		loop1: while (true) {
			Scanner scan = new Scanner(System.in);
			System.out.println("학생정보프로그램");
			System.out.println("1)학생정보 입력   2)학생성적처리 입력  3)학생정보출력   4)학생성적출력");
			System.out.println("5)학생정보검색    6)성적검색     0)종료");
			System.out.println("메뉴를 입력하세요.");
			int select = scan.nextInt();
			switch (select) {
			case 1:
				while (true) {
					System.out.println("학생정보입력 메뉴 입니다.");
					System.out.println("학번을 입력하세요.(이전 메뉴:99)");
					int hak_num = scan.nextInt();
					if (hak_num == 99) {
						break;
					}
					System.out.println("이름을 입력하세요.");
					String name = scan.next();
					System.out.println("학과를 입력하세요.");
					String major = scan.next();
					System.out.println("학년을 입력하세요.");
					int grade = scan.nextInt();
					stuinfo.add(new Student(hak_num, name, major, grade));
				}
				break;
			case 2:
				System.out.println("학생성적 입력 메뉴 입니다.");
				System.out.println("입력할 학생의 학번을 입력하세요.");
				int searchHak = scan.nextInt();
				for (int i = 0; i < stuinfo.size(); i++) {
					Student s = (Student) stuinfo.get(i);
					if (!(searchHak == s.hak_num)) {
						continue;
					} else if (searchHak == s.hak_num) {
						System.out.println("국어점수를 입력하세요.");
						int kor = scan.nextInt();
						System.out.println("영어점수를 입력하세요.");
						int eng = scan.nextInt();
						stuscore.add(new StuScore(kor, eng));
					}
				}

				break;
			case 3:
				System.out.println("학생정보출력 메뉴 입니다.");
				for (int i = 0; i < subject1.length; i++) {
					System.out.print(subject1[i] + "\t");
				}
				System.out.println();
				for (int i = 0; i < stuinfo.size(); i++) {
					Student s = (Student) stuinfo.get(i);
					System.out.println(s);
				}
				break;
			case 4:
				System.out.println("학생성적출력 메뉴 입니다.");
				for (int i = 0; i < subject.length; i++) {
					System.out.print(subject[i] + "\t");
				}
				System.out.println();
				for (int i = 0; i < stuscore.size(); i++) {
					Student s1 = (Student) stuinfo.get(i);
					StuScore s = (StuScore) stuscore.get(i);

					System.out.println(
							s1.hak_num + "\t" + s1.name + "\t" + s.kor + "\t" + s.eng + "\t" + s.total + "\t" + s.avg);
				}
				break;
			case 5:
				System.out.println("학생정보검색 메뉴 입니다.");
				System.out.println("검색할 학생의 이름을 입력하세요.");
				String name=scan.next();
				for(int i=0; i<stuinfo.size();i++) {
					Student s=(Student)stuinfo.get(i);
					if(!(name.equals(s.name))) {
						continue;
					}else if(name.equals(s.name)) {
						System.out.println(s);
					}
					
				}
				break;
			case 6:
				System.out.println("성적검색 메뉴 입니다.");
				System.out.println("검색할 학생의 이름을 입력하세요.");
				String name1=scan.next();
				for(int i=0; i<stuinfo.size();i++) {
					Student s1=(Student)stuinfo.get(i);
					StuScore s=(StuScore)stuscore.get(i);
					if(!(name1.equals(s1.name))) {
						continue;
					}else if(name1.equals(s1.name)) {
						System.out.println(s1.hak_num + "\t" + s1.name + "\t" + s.kor + "\t" + s.eng + "\t" + s.total + "\t" + s.avg);
					}
					
				}
				break;
			case 0:
				System.out.println("프로그램을 종료합니다.");
				break loop1;

			}
		}
	}

}
