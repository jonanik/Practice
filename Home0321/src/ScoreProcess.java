import java.lang.reflect.Array;
import java.util.ArrayList;

public class ScoreProcess {

	public static void main(String[] args) {
		ArrayList<Student> stuList = new ArrayList<Student>();
		ArrayList<Student> reinput = new ArrayList<Student>();
		String[] category= {"학번","이름","학과","국어","영어","수학","합계","평균","등수"};
		
		Interface i = new Excute();

		while (true) {
			switch (i.main()) {
			case "1":
				i.inputScore(stuList);
				break;
			case "2":
				i.printScore(stuList,category);
				break;
			case "3":
				i.searchStu(stuList,reinput);
				break;
			case "4":
				i.rankprocess(stuList,category);
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;

			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

}
