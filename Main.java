package home0419_01;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Excute ex = new Excute();
		Student stu = new Student();
		ArrayList<Student> list = new ArrayList<Student>();
		while (true) {
			switch (ex.main()) {
			case "1":// 성적입력
				ex.insert(list, stu);
				break;
			case "2":// 성적출력
				ex.print(list);
				break;
				
			case "3":// 학생정보검색
				ex.search(list);
				break;
			case "4":// 학생정보삭제
				ex.delete(list);
				break;
			case "5":// 학생정보 수정
				ex.reinsert(list);
				break;
			case "0":// 프로그램 종료
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				
				break;

			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				break;
			}

		}
	}
}
