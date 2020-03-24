import java.util.ArrayList;
import java.util.Scanner;

public class Ex0324_01 {

	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		Excute1 e = new Excute1();
		while (true) {
			switch (e.main()) {
			case "1":
				e.input(stuList);
				break;
			case "2":
				e.print(stuList);
				break;
			case "3":
				e.search(stuList);
				
				break;
			case "4":
				e.rank(stuList);
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				System.out.println("잘못입력했습니다.");
				break;
			}

		}
	}
}

class Excute1 {
	String main() {
		Scanner scan = new Scanner(System.in);
		System.out.println("성정처리프로그램");
		System.out.println("1.성적입력 2.성적 출력 3.성적검색 4.등수처리 ");
		System.out.println("0.프로그램을 종료합니다.");
		String select = "0";
		select = scan.next();
		return select;
	}

	void input(ArrayList<Student> stuList) {

		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		String name = scan.next();
		System.out.println("학과를 입력해주세요.");
		String major = scan.next();
		System.out.println("국어점수를 입력해주세요.");
		int kor = scan.nextInt();
		System.out.println("영어점수를 입력해주세요.");
		int eng = scan.nextInt();
		System.out.println("수학점수를 입력해주세요.");
		int math = scan.nextInt();
		stuList.add(new Student(name, major, kor, eng, math));

	}

	void print(ArrayList<Student> stuList) {
		for (int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
	}

	void search(ArrayList<Student> stuList) {
		Scanner scan = new Scanner(System.in);
		System.out.println("검색할 이름을 검색하세요.");
		String name = scan.next();
		for (int i = 0; i < stuList.size(); i++) {
			if (name.equals(stuList.get(i).name)) {
				System.out.println(stuList.get(i));
			}
		}
	}

	void rank(ArrayList<Student> stuList) {

		int rankCount = 1;
		for (int i = 0; i < stuList.size(); i++) {
			rankCount = 1;
			for (int j = 0; j < stuList.size(); j++) {
				if (stuList.get(i).total < stuList.get(j).total) {
					rankCount++;
				}

			}
			stuList.get(i).rank = rankCount;
		}
		print(stuList);
	}

}

class Student {
	static int count = 0;
	int hakNum;
	String name;
	String major;
	int kor;
	int eng;
	int math;
	int total;
	int avg;
	int rank;
	{
		count++;
		hakNum = count;
	}

	Student() {

	}

	Student(String name, String major, int kor, int eng, int math) {
		this.name = name;
		this.major = major;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = total / 3;
		this.rank = 0;
	}

	public String toString() {
		return hakNum + "\t" + name + "\t" + major + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg
				+ "\t" + rank;
	}
}